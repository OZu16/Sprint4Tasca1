package cat.itacademy.barcelonactiva.benageschale.gerard.s04.t01.n01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"cat.itacademy.barcelonactiva.benageschale.gerard.s04.t01.n01", "controllers"})
public class S04T01N01BenagesChaleGerard2Application {

	public static void main(String[] args) {
		SpringApplication.run(S04T01N01BenagesChaleGerard2Application.class, args);
	}

}
