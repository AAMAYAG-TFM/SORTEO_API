package co.edu.unir.tfm.sorteo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unir.tfm.sorteo.entities.JugadorNumero;
import co.edu.unir.tfm.sorteo.repositorios.JugadorNumeroRepositorio;
import co.edu.unir.tfm.sorteo.services.JugadorNumeroService;

@Service
public class JugadorNumeroServiceImpl implements JugadorNumeroService {
	
	@Autowired
	private JugadorNumeroRepositorio repositorio;

	@Override
	public List<JugadorNumero> findAll() {
		return null;
	}

	@Override
	public JugadorNumero find(String identificador) {
		return null;
	}

	@Override
	public void saveOrUpdate(JugadorNumero jugadorNumero) {
		repositorio.save(jugadorNumero);
	}

}
