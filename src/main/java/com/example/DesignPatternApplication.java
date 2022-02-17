package com.example;

import com.example.factory.Fruites;
import com.example.service.FruitesFeatures;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternApplication implements CommandLineRunner {

	@Autowired
	private Fruites fruites;
	public static void main(String[] args) {
		SpringApplication.run(DesignPatternApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		String name = "mango";
		FruitesFeatures features = fruites.getFruitesName(name);
		features.color();
		features.weigth();


	}
}
