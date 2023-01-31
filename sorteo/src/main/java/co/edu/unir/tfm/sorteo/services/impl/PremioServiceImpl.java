package co.edu.unir.tfm.sorteo.services.impl;

import co.edu.unir.tfm.sorteo.entities.Premio;
import co.edu.unir.tfm.sorteo.services.PremioService;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * Implementación de la Intefaz de administración de premios.
 *
 * @author aamayag
 *
 */
@Service
public class PremioServiceImpl implements PremioService {

  @Override
   public List<Premio> findAll() {
    return null;
  }

  public Premio find(Integer ideOrganizacion, Integer idePremio) {
    return null;
  }

  @Override
  public void saveOrUpdate(Premio premio) {

  }

}
