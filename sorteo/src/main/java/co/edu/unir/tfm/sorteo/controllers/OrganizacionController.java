package co.edu.unir.tfm.sorteo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unir.tfm.sorteo.entities.Organizacion;
import co.edu.unir.tfm.sorteo.services.OrganizacionService;

@RestController
@RequestMapping("/api")
public class OrganizacionController {

	private OrganizacionService organizacionSrv;

	@GetMapping("/organizaciones")
	@ResponseBody
	public Organizacion getOrganizacion(@RequestParam String identificacion) {
		return organizacionSrv.find(identificacion);
	}

	@PostMapping("/organizaciones")
	@ResponseBody
	public void setOrganizacion(@RequestBody Organizacion organizacion) {
		organizacionSrv.saveOrUpdate(organizacion);
	}

}