package io.sunbit.app.expenseuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Explicit declaration as eureka customer(redundant)
@SpringBootApplication
public class ExpenseuserApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExpenseuserApplication.class, args);
	}

}
