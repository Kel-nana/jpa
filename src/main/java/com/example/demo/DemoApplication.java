package com.example.demo;

import com.example.demo.client.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping()
	public List<Client> hello () {
		return List.of(
				new Client(
						"mawai@gmail.com",
						LocalDate.of(2000, Month.MARCH,27),
						27119287L,
						"Mwai",
						"Kelvin",
						1L
				)
		);
	}

}
