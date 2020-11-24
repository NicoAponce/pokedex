package projectspring.pokedex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApiRestPokedexApplicationTests {

	@Test
	void contextLoads() {
		int num1=1;
		int num2=4;
		Assertions.assertEquals(5,num1+num2);
	}

}
