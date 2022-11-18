package co.edu.unir.tfm.sorteo.services;

import java.util.List;

import co.edu.unir.tfm.sorteo.entities.Jugador;

public interface JugadorService {

	public List<Jugador> findAll();

	public Jugador saveOrUpdate(Jugador jugador);

}
