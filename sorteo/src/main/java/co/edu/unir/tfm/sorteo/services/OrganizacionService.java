package co.edu.unir.tfm.sorteo.services;

import co.edu.unir.tfm.sorteo.entities.Organizacion;
import java.util.List;


/**
 * Interfaz del servicio que administra la información de las organizaciones.
 *
 * @author aamayag
 *
 */
public interface OrganizacionService {

  public List<Organizacion> findAll();

  public Organizacion find(String identificacion);

  public Organizacion saveOrUpdate(Organizacion organizacion);

}
