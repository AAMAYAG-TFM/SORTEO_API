package co.edu.unir.tfm.sorteo.services.impl;

import co.edu.unir.tfm.sorteo.entities.Jugador;
import co.edu.unir.tfm.sorteo.entities.JugadorNumero;
import co.edu.unir.tfm.sorteo.repositorios.JugadorNumeroRepositorio;
import co.edu.unir.tfm.sorteo.repositorios.JugadorRepositorio;
import co.edu.unir.tfm.sorteo.repositorios.OrganizacionRepositorio;
import co.edu.unir.tfm.sorteo.services.JugadorService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Implementación del servido que administra la información de los jugadores.
 *
 * @author aamayag
 * 
 */
@Service
public class JugadorServiceImpl implements JugadorService {

  @Autowired
  private JugadorRepositorio repositorio;

  @Autowired
  private OrganizacionRepositorio repositorioOrganizacion;

  @Autowired
  private JugadorNumeroRepositorio repositorioNumeros;

  @Override
  public List<Jugador> findAll() {
    return repositorio.findAll();
  }

  @Override
  public JugadorNumero saveOrUpdate(Jugador jugador) {

    /* Se actualiza o almacenan los datos del jugador */
    repositorio.saveAndFlush(jugador);

    /* Eliminamos asignaciones anteriores de números */
    repositorioNumeros.deleteAsignacionesJugador(jugador.getNumIdentificacion());

    JugadorNumero numero = new JugadorNumero();
    numero.setJugador(jugador);
    numero.setFecRegistro(new Date());

    String ideOrganizacion = jugador.getOrganizacion().getIdeOrganizacion();

    Long cantidad = repositorioOrganizacion.getCantidadEmpleados(ideOrganizacion);

    int numSorteo = (int) (Math.random() * cantidad);

    numero.setNumSorteo(numSorteo);
    JugadorNumero jugnum = null;

    jugnum = repositorioNumeros.getAsignacionNumero(ideOrganizacion, numSorteo);

    if (jugnum == null) {
      repositorioNumeros.saveAndFlush(numero);
    }

    return repositorioNumeros.getAsignacionNumero(ideOrganizacion, numSorteo);

  }

  @Override
  public Jugador find(String id) {
    return repositorio.findById(id).isPresent() ? repositorio.findById(id).get() : null;
  }

}
