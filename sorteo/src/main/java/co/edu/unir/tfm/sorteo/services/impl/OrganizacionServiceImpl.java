package co.edu.unir.tfm.sorteo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unir.tfm.sorteo.entities.Organizacion;
import co.edu.unir.tfm.sorteo.repositorios.OrganizacionRepositorio;
import co.edu.unir.tfm.sorteo.services.OrganizacionService;

@Service
public class OrganizacionServiceImpl implements OrganizacionService {

	@Autowired
	private OrganizacionRepositorio repositorio;

	@Override
	public List<Organizacion> findAll() {
		return repositorio.findAll();
	}

	@Override
	public Organizacion saveOrUpdate(Organizacion organizacion) {
		return repositorio.saveAndFlush(organizacion);
	}

	@Override
	public Organizacion find(String identificacion) {
		return repositorio.findById(identificacion).isPresent() ? repositorio.findById(identificacion).get() : null;
	}

}
