package co.edu.unir.tfm.sorteo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unir.tfm.sorteo.entities.Jugador;
import co.edu.unir.tfm.sorteo.entities.JugadorNumero;
import co.edu.unir.tfm.sorteo.entities.Organizacion;
import co.edu.unir.tfm.sorteo.services.JugadorService;

@RestController
@RequestMapping("/api")
public class JugadorController {

	@Autowired
	private JugadorService jugadorSrv;

	@PostMapping("/organizaciones/{ideOrganizacion}/jugadores/")
	public JugadorNumero setJugador(@PathVariable String ideOrganizacion, @RequestBody Jugador jugador) {
		jugador.setOrganizacion(new Organizacion(ideOrganizacion));
		return jugadorSrv.saveOrUpdate(jugador);
	}

	@GetMapping("/organizaciones/{ideOrganizacion}/jugadores/{ideJugador}")
	public Jugador getJugador(@PathVariable String identificador) {
		return jugadorSrv.find(identificador);
	}

}
