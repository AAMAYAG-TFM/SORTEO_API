package co.edu.unir.tfm.sorteo.services;

import co.edu.unir.tfm.sorteo.entities.Premio;
import java.util.List;


/**
 * Servicio para PRemio.
 *
 */
public interface PremioService {

  public List<Premio> findAll();

  public Premio find(Integer ideOrganizacion, Integer idePremio);

  public void saveOrUpdate(Premio premio);

}
