package co.edu.unir.tfm.sorteo.services;

import java.util.List;

import co.edu.unir.tfm.sorteo.entities.Jugador;
import co.edu.unir.tfm.sorteo.entities.JugadorNumero;

public interface JugadorService {

	public List<Jugador> findAll();

	public Jugador find(Integer identificador);

	public JugadorNumero saveOrUpdate(Jugador jugador);

}
