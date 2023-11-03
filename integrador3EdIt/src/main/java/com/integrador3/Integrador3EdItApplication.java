package com.integrador3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.integrador3.controller.InicioController;

@SpringBootApplication

@ComponentScan(basePackageClasses = InicioController.class)
public class Integrador3EdItApplication {

	public static void main(String[] args) {
		SpringApplication.run(Integrador3EdItApplication.class, args);
	}

}
