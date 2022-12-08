package co.edu.unir.tfm.sorteo.services.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unir.tfm.sorteo.entities.Jugador;
import co.edu.unir.tfm.sorteo.entities.JugadorNumero;
import co.edu.unir.tfm.sorteo.repositorios.JugadorNumeroRepositorio;
import co.edu.unir.tfm.sorteo.repositorios.JugadorRepositorio;
import co.edu.unir.tfm.sorteo.repositorios.OrganizacionRepositorio;
import co.edu.unir.tfm.sorteo.services.JugadorService;

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

		Long cantidad = repositorioOrganizacion.getCantidadEmpleados(jugador.getOrganizacion().getIdeOrganizacion());

		int numSorteo = (int) (Math.random() * cantidad);

		numero.setNumSorteo(numSorteo);

		JugadorNumero asignacion = repositorioNumeros
				.getAsignacionNumero(jugador.getOrganizacion().getIdeOrganizacion(), numero.getNumSorteo());

		if (asignacion == null)
			repositorioNumeros.saveAndFlush(numero);

		return repositorioNumeros.getAsignacionNumero(jugador.getOrganizacion().getIdeOrganizacion(),
				numero.getNumSorteo());

	}

	@Override
	public Jugador find(String identificador) {
		return repositorio.findById(identificador).isPresent() ? repositorio.findById(identificador).get() : null;
	}

}
