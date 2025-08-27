package cust_ord_prod.cop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("cust_ord_prod.cop")
public class CopApplication {

	public static void main(String[] args) {
		SpringApplication.run(CopApplication.class, args);
	}

}
