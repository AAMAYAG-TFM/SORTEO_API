package co.edu.unir.tfm.sorteo.controllers;

import co.edu.unir.tfm.sorteo.entities.Premio;
import co.edu.unir.tfm.sorteo.services.PremioService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Componente que recibe las peticiones de información de premios.
 *
 * @author aamayag
 */
@RestController
@RequestMapping("/api/organizaciones")
public class PremioController {

  private PremioService premioSrv;

  @GetMapping("/{ideOrganizacion}/premios")
  public Premio getPremio(@PathVariable Integer idOrg, @RequestParam Integer idPre) {
    return premioSrv.find(idOrg, idPre);
  }

}
