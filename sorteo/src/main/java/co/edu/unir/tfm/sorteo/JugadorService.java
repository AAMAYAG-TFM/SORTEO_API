package service;

import java.util.List;

import entidades.Jugador;

public interface JugadorService {

	public List<Jugador> findAll();

	public void saveOrUpdate(Jugador jugador);

}
