package co.edu.unir.tfm.sorteo.services;

import java.util.List;

import co.edu.unir.tfm.sorteo.entities.Organizacion;

public interface OrganizacionService {

	public List<Organizacion> findAll();

	public Organizacion find(String identificacion);

	public Organizacion saveOrUpdate(Organizacion organizacion);

}
