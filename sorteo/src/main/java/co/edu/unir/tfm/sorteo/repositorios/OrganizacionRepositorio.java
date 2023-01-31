package co.edu.unir.tfm.sorteo.repositorios;

import co.edu.unir.tfm.sorteo.entities.Organizacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Repositorio de Organizaciones.
 *
 * @author aamayag
 *
 */
@Repository
public interface OrganizacionRepositorio extends JpaRepository<Organizacion, String> {

  @Query("SELECT o.numEmpleados FROM organizacion o WHERE o.ideOrganizacion = :ideOrganizacion")
  public Long getCantidadEmpleados(@Param("ideOrganizacion") String ideOrganizacion);

}
