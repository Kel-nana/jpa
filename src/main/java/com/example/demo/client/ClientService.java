package com.example.demo.client;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class ClientService {

    public List<Client> getClient() {
        return List.of(
                new Client(
                        "mawai@gmail.com",
                        LocalDate.of(2000, Month.MARCH, 27),
                        27119287L,
                        "Mwai",
                        "Kelvin",
                        1L
                )
        );
    }
}
