package co.edu.unir.tfm.sorteo.repositorios;

import co.edu.unir.tfm.sorteo.entities.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




/**
 * Repositorio de información del jugador.
 *
 * @author aamayag
 *
 */
@Repository
public interface JugadorRepositorio extends JpaRepository<Jugador, String> {

}
