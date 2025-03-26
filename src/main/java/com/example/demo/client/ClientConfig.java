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
            Client Linda = new Client(
                    "Linda",
                    "Tina",
                    45679287L,
                    LocalDate.of(2019, Month.APRIL, 05),
                    "linda@gmail.com"
            );

            Client Joy = new Client(
                    "Joy",
                    "Blessing",
                    27439877L,
                    LocalDate.of(2015, Month.AUGUST, 07),
                    "blessing@gmail.com"

            );

            // Save clients to the database
            repository.saveAll(List.of(Linda, Joy));
        };
    }
}

