package co.edu.unir.tfm.sorteo.services;

import co.edu.unir.tfm.sorteo.entities.Jugador;
import co.edu.unir.tfm.sorteo.entities.JugadorNumero;
import java.util.List;

/**
 * Interfaz del servicio de Jugador.
 *
 * @author aamayag
 *
 */
public interface JugadorService {

  public List<Jugador> findAll();

  public Jugador find(String identificador);

  public JugadorNumero saveOrUpdate(Jugador jugador);

}
