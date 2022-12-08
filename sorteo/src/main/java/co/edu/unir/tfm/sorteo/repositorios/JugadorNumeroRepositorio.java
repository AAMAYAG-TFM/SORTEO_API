package co.edu.unir.tfm.sorteo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import co.edu.unir.tfm.sorteo.entities.JugadorNumero;

public interface JugadorNumeroRepositorio extends JpaRepository<JugadorNumero, Integer> {

	@Query("SELECT jn FROM JugadorNumero jn WHERE jn.jugador.organizacion.ideOrganizacion = :ideOrganizacion and jn.numSorteo = :numero")
	public JugadorNumero getAsignacionNumero(@Param("ideOrganizacion") String ideOrganizacion,
			@Param("numero") int numero);
	
	@Modifying
	@Transactional
	@Query("DELETE JugadorNumero jn WHERE jn.jugador.numIdentificacion = :numIdentificacion")
	public void deleteAsignacionesJugador(@Param("numIdentificacion") String numIdentificacion);

}
