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
            Client Tom = new Client(
                    "Tom",
                    "Creative",
                    32155321L,
                    LocalDate.of(2019, Month.APRIL, 05),
                    "creative@gmail.com"
            );

            Client Jerry = new Client(
                    "Jerry",
                    "Winner",
                    28835237L,
                    LocalDate.of(2015, Month.AUGUST, 07),
                    "Jerry@gmail.com"

            );

            // Save clients to the database
            repository.saveAll(List.of(Tom, Jerry));
        };
    }
}

