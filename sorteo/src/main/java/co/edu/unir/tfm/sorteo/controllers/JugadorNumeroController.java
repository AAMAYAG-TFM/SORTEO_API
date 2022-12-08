package co.edu.unir.tfm.sorteo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unir.tfm.sorteo.entities.JugadorNumero;
import co.edu.unir.tfm.sorteo.services.JugadorNumeroService;

@RestController
@RequestMapping("/api/jugadores")
public class JugadorNumeroController {

	private JugadorNumeroService jugadorNumeroSrv;

	@GetMapping("/{identificador}/numeros")
	@ResponseBody
	public JugadorNumero getJugadorNumero(@PathVariable String identificador) {
		return jugadorNumeroSrv.find(identificador);
	}

}
