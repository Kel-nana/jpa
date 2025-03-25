package com.example.demo.client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/client")
public class ClientController {
      @GetMapping()
	public List<Client> getClient () {
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
