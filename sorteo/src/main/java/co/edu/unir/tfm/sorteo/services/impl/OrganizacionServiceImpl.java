package co.edu.unir.tfm.sorteo.services.impl;


import co.edu.unir.tfm.sorteo.entities.Organizacion;
import co.edu.unir.tfm.sorteo.repositorios.OrganizacionRepositorio;
import co.edu.unir.tfm.sorteo.services.OrganizacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class OrganizacionServiceImpl implements OrganizacionService {

  @Autowired
  private OrganizacionRepositorio repo;

  @Override
  public List<Organizacion> findAll() {
    return repo.findAll();
  }

  @Override
  @Deprecated
  public Organizacion saveOrUpdate(Organizacion organizacion) {
    return repo.saveAndFlush(organizacion);
  }

  @Override
  public Organizacion find(String id) {
    return repo.findById(id).isPresent() ? repo.findById(id).get() : null;
  }

}
