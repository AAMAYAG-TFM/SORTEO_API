package service;

import java.util.List;

import entidades.Organizacion;

public interface OrganizacionService {

	public List<Organizacion> findAll();

	public void saveOrUpdate(Organizacion organizacion);

}
