package co.edu.unir.tfm.sorteo.controllers;


import co.edu.unir.tfm.sorteo.entities.Jugador;
import co.edu.unir.tfm.sorteo.entities.JugadorNumero;
import co.edu.unir.tfm.sorteo.entities.Organizacion;
import co.edu.unir.tfm.sorteo.services.JugadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller del servicio para administración de la información asociada al
 * registro de personas que van a representar a los jugares
 *
 * @author aamayag
 *
 */
@RestController
@RequestMapping("/api")
public class JugadorController {

  @Autowired
  private JugadorService jugadorSrv;

  @PostMapping("/organizaciones/{ideOrganizacion}/jugadores/")
  public JugadorNumero setJugador(@PathVariable String ideOrg, @RequestBody Jugador jugador) {
    jugador.setOrganizacion(new Organizacion(ideOrg));
    return jugadorSrv.saveOrUpdate(jugador);
  }

  @GetMapping("/organizaciones/{ideOrganizacion}/jugadores/{ideJugador}")
  public Jugador getJugador(@PathVariable String identificador) {
    return jugadorSrv.find(identificador);
  }

}
