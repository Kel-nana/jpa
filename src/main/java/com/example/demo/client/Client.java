package com.example.demo.client;

import java.time.LocalDate;

public class Client {
    private Long id;
    private String fname;
    private String onames;
    private  Long client_idno;
    private LocalDate dob;
    private String email;

    public Client() {
    }

    public Client(String email, LocalDate dob, Long client_idno, String onames, String fname, Long id) {
        this.email = email;
        this.dob = dob;
        this.client_idno = client_idno;
        this.onames = onames;
        this.fname = fname;
        this.id = id;
    }
}
