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
            Client kelvin = new Client(
                    "Bryan",
                    "Kimani",
                    12349287L,
                    LocalDate.of(2019, Month.APRIL, 05),
                    "kimani@gmail.com"
            );

            Client lulu = new Client(
                    "Alexandria",
                    "Kyalo",
                    27439287L,
                    LocalDate.of(2015, Month.AUGUST, 07),
                    "kyalo@gmail.com"

            );

            // Save clients to the database
            repository.saveAll(List.of(kelvin, lulu));
        };
    }
}

