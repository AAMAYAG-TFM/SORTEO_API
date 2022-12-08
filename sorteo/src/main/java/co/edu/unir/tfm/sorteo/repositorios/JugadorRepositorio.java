package co.edu.unir.tfm.sorteo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.unir.tfm.sorteo.entities.Jugador;

@Repository
public interface JugadorRepositorio extends JpaRepository<Jugador, String> {

}
