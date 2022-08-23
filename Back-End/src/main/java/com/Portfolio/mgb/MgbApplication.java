package com.portfolio.mgb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
//quitar la linea de abajo que no es original, si no se soluciona el prolema
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class MgbApplication {

	public static void main(String[] args) {
		SpringApplication.run(MgbApplication.class, args);
	}

}
