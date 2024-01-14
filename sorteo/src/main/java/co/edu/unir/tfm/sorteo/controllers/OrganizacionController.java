package co.edu.unir.tfm.sorteo.controllers;

import co.edu.unir.tfm.sorteo.entities.Organizacion;
import co.edu.unir.tfm.sorteo.services.OrganizacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Controller del servicio para administración de la información asociada a la
 * asignación a la organización que organiza el sorteo.
 *
 * @author aamayag
 *
 */
@RestController
@RequestMapping("/api")
public class OrganizacionController {

  @Autowired
  private OrganizacionService organizacionSrv;

  @GetMapping("/organizaciones")
  public List<Organizacion> getOrganizacion() {
    return organizacionSrv.findAll();
  }

  @GetMapping("/organizaciones/{identificador}")
  public Organizacion getOrganizacion(@PathVariable String identificador) {
    return organizacionSrv.find(identificador);
  }

  @PostMapping("/organizaciones")
  public void setOrganizacion(@RequestBody Organizacion organizacion) {
    organizacionSrv.saveOrUpdate(organizacion);
  }

}
