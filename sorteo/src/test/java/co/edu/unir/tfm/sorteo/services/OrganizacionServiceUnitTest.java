package co.edu.unir.tfm.sorteo.services;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import co.edu.unir.tfm.sorteo.controllers.OrganizacionController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

/**
 * Clase para la aplicación de Test a los servicios de Organización.
 *
 * @author user
 *
 */
@WebMvcTest(OrganizacionController.class)
public class OrganizacionServiceUnitTest {

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private OrganizacionService organizacionService;

  @Test
  public void getListOrganizaciones() throws Exception {
    this.mockMvc.perform(MockMvcRequestBuilders.get("/api/organizaciones"))
        .andExpect(status().is2xxSuccessful());
  }

  
}
