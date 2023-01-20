package co.edu.unir.tfm.sorteo.services;

import java.util.List;

import co.edu.unir.tfm.sorteo.entities.Organizacion;

/**
 * Interfaz del servicio que administra la información de las organizaciones.
 *
 * @author aamayag
 *
 */
public interface OrganizacionService {

  public List<Organizacion> findAll();

  public Organizacion find(String identificacion);

 @Deprecated
  public Organizacion saveOrUpdate(Organizacion organizacion);

}
