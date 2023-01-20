package co.edu.unir.tfm.sorteo.services;

import co.edu.unir.tfm.sorteo.entities.JugadorNumero;
import java.util.List;



/**
 * Interface del servicion para la persistencia del Numero asignado a cada
 * jugador.
 *
 * @author aamayag
 *
 */
public interface JugadorNumeroService {

  public List<JugadorNumero> findAll();

  public void saveOrUpdate(JugadorNumero jugadorNumero);

  public JugadorNumero find(String identificador);

}
