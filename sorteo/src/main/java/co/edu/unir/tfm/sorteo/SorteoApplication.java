package co.edu.unir.tfm.sorteo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import co.elastic.apm.attach.ElasticApmAttacher;

/**
 * Inicio de la aplicación.
 *
 * @author aamayag
 *
 */
@SpringBootApplication
public class SorteoApplication {

  public static void main(String[] args) {
	ElasticApmAttacher.attach();  
    SpringApplication.run(SorteoApplication.class, args);
  }

}
