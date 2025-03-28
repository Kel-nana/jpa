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
            Client Philip = new Client(
                    "Philip",
                    "Butoyi",
                    21347391L,
                    LocalDate.of(2019, Month.APRIL, 05),
                    "butoyi@gmail.com"
            );

//            Client Brian = new Client(
//                    "Brian",
//                    "Chan",
//                    72935877L,
//                    LocalDate.of(2015, Month.AUGUST, 07),
//                    "Brian@gmail.com"
//
//            );
//
//            Client Francis = new Client(
//                    "Francis",
//                    "Chan",
//                    65935237L,
//                    LocalDate.of(2015, Month.AUGUST, 07),
//                    "Francis@gmail.com"
//
//            );
//
//            Client Jecinta = new Client(
//                    "Jecinta",
//                    "Chan",
//                    6593509L,
//                    LocalDate.of(2015, Month.AUGUST, 07),
//                    "jecinta@gmail.com"
//
//            );
//
//            Client Chris = new Client(
//                    "JChris",
//                    "Mwiru",
//                    65976437L,
//                    LocalDate.of(2015, Month.AUGUST, 07),
//                    "mwiru@gmail.com"
//
//            );

            // Save clients to the database
            repository.saveAll(List.of(Philip));
        };
    }
}
