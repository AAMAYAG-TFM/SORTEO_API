package co.edu.unir.tfm.sorteo.services;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import co.edu.unir.tfm.sorteo.entities.Organizacion;
import co.edu.unir.tfm.sorteo.repositorios.OrganizacionRepositorio;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

/**
 * Clase para la aplicación de Test a los servicios de Organización.
 *
 * @author user
 *
 */
public class OrganizacionServiceTest {

  @Mock
  private OrganizacionRepositorio repositorio;

  @InjectMocks
  private OrganizacionService organizacionService;

  private Organizacion organizacion;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.initMocks(getClass());

    organizacion = new Organizacion("AJS334");
    organizacion.setNumEmpleados(12L);
    organizacion.setValRazonSocial("Mockito TEST");

  }

  @Test
  void findAll() {
    when(repositorio.findAll()).thenReturn(Arrays.asList(organizacion));
    assertNotNull(organizacionService.findAll());

  }

}
