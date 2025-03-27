package com.example.demo.client;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class ClientConfig {

    @Bean
    CommandLineRunner commandLineRunner(ClientRepository repository) {
        return args -> {
            Client Nala = new Client(
                    "Nala",
                    "Simba",
                    12355321L,
                    LocalDate.of(2019, Month.APRIL, 05),
                    "simba@gmail.com"
            );

            Client Brandol = new Client(
                    "Brandol",
                    "Maithya",
                    27735237L,
                    LocalDate.of(2015, Month.AUGUST, 07),
                    "Brandol@gmail.com"

            );

            // Save clients to the database
            repository.saveAll(List.of(Nala, Brandol));
        };
    }
}

