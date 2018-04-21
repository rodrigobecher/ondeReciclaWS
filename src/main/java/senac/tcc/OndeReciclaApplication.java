package senac.tcc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class OndeReciclaApplication {

	public static void main(String[] args) {
		SpringApplication.run(OndeReciclaApplication.class, args);
	}
}
