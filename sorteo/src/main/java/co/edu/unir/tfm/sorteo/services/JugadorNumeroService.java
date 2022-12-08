package co.edu.unir.tfm.sorteo.services;

import java.util.List;

import co.edu.unir.tfm.sorteo.entities.JugadorNumero;


public interface JugadorNumeroService {

	public List<JugadorNumero> findAll();

	public void saveOrUpdate(JugadorNumero jugadorNumero);
	
	public JugadorNumero find(String identificador);

}
