package co.edu.unir.tfm.sorteo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class SorteoApplicationTests {
	
  @DisplayName("Test MessageService.get()")
  @Test
  void testGet() {
   assertEquals("Hello JUnit 5", MessageService.get());
  }


}
