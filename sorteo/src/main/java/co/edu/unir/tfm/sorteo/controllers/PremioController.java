package co.edu.unir.tfm.sorteo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unir.tfm.sorteo.entities.Premio;
import co.edu.unir.tfm.sorteo.services.PremioService;

@RestController
@RequestMapping("/api/organizaciones")
public class PremioController {

	private PremioService premioSrv;

	@GetMapping("/{ideOrganizacion}/premios")
	public Premio getPremio(@PathVariable Integer ideOrganizacion, @RequestParam Integer identificador) {
		return premioSrv.find(ideOrganizacion, identificador);
	}
	
	

}
