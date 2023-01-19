package co.edu.unir.tfm.sorteo.services;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import co.edu.unir.tfm.sorteo.controllers.OrganizacionController;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

/**
 * Clase para la aplicación de Test a los servicios de Organización.
 *
 * @author user
 *
 */
@WebMvcTest(OrganizacionController.class)
public class OrganizacionServiceTest {

  @Autowired
  private MockMvc mockMvc;
  
  @MockBean
  private OrganizacionService organizacionService;

  @Test
  public void findAll() throws Exception {

    mockMvc.perform(get("/organizaciones")
        .accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
        .andExpect(jsonPath("$", Matchers.hasSize(1)))
        .andExpect(jsonPath("$[0].valRazonSocial", Matchers.equalTo("Arun")));

  }

}
