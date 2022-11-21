package co.edu.unir.tfm.sorteo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unir.tfm.sorteo.entities.Jugador;
import co.edu.unir.tfm.sorteo.entities.JugadorNumero;
import co.edu.unir.tfm.sorteo.services.JugadorService;

@RestController
@RequestMapping("/api/jugadores")
public class JugadorController {

	private JugadorService jugadorSrv;

	@PostMapping("/")
	@ResponseBody
	public JugadorNumero setJugador(@RequestBody Jugador jugador) {
		return jugadorSrv.saveOrUpdate(jugador);
	}

	@GetMapping("/")
	@ResponseBody
	public Jugador getJugador(@RequestParam Integer identificador) {
		return jugadorSrv.find(identificador);
	}

}
