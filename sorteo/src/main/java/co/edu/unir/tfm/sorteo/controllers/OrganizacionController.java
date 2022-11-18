package co.edu.unir.tfm.sorteo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unir.tfm.sorteo.entities.Organizacion;
import co.edu.unir.tfm.sorteo.services.OrganizacionService;

@RestController
@RequestMapping("/api")
public class OrganizacionController {

	private OrganizacionService organizacionSrv;

	@GetMapping("/organizaciones")
	public Organizacion getOrganizacion(@RequestParam String identificacion) {
		return organizacionSrv.find(identificacion);
	}
}
