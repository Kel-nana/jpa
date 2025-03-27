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
            Client Lin = new Client(
                    "Lin",
                    "Yu",
                    32155391L,
                    LocalDate.of(2019, Month.APRIL, 05),
                    "yu@gmail.com"
            );

            Client Jackie = new Client(
                    "Jackie",
                    "Chan",
                    27935237L,
                    LocalDate.of(2015, Month.AUGUST, 07),
                    "Jackie@gmail.com"

            );

            // Save clients to the database
            repository.saveAll(List.of(Lin, Jackie));
        };
    }
}
