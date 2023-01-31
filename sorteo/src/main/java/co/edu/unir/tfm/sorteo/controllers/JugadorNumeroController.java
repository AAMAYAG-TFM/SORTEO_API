package co.edu.unir.tfm.sorteo.controllers;

import co.edu.unir.tfm.sorteo.entities.JugadorNumero;
import co.edu.unir.tfm.sorteo.services.JugadorNumeroService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller del servicio para administración de la información asociada a la
 * asignación de numeros a los jugadores.
 *
 * @author aamayag
 *
 */
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
