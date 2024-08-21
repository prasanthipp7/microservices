package com.employee.Employee.Test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//@ImportResource("classpath:appConfig.xml")
@ComponentScan(basePackages = { " com.employee.Employee.Test" })
public class EmployeeTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeTestApplication.class, args);
	}

}
