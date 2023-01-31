package co.edu.unir.tfm.sorteo.repositorios;

import co.edu.unir.tfm.sorteo.entities.Premio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * Repositorio de información de los premios a sortear.
 *
 * @author aamayag
 *
 */
@Repository
public interface PremioRepositorio extends JpaRepository<Premio, String> {

}
