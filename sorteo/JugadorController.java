package co.edu.unir.tfm.sorteo.controllers;

import org.springframework.web.bind.annotation.RequestBody;

import co.edu.unir.tfm.sorteo.entities.Jugador;
import co.edu.unir.tfm.sorteo.services.JugadorService;

public class JugadorController {

	private JugadorService jugadorSrv;

	public Jugador addJugador(@RequestBody Jugador jugador) {
		return jugadorSrv.saveOrUpdate(jugador);
	}

}
