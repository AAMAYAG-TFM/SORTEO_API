package service;

import java.util.List;

import entidades.JugadorNumero;

public interface JugadorNumeroService {

	public List<JugadorNumero> findAll();

	public void saveOrUpdate(JugadorNumero jugadorNumero);

}
