package com.example.demo.client;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "client",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "client_idno"),
                @UniqueConstraint(columnNames = "email")
        })

public class Client {
    @Id
    @SequenceGenerator(
            name = "client_sequence",
            sequenceName = "client_sequence",
            allocationSize = 1
    )

    @GeneratedValue (
           strategy = GenerationType.SEQUENCE,
            generator = "client_sequence"
    )

    @Column(
            name = "id",
            updatable = false
    )
    private Long id;

    @Column(
            name = "fname",
            nullable = false
//            columnDefinition = "Text"
    )
    private String fname;

    @Column(
            name = "onames",
            nullable = false
//            columnDefinition = "Text"
    )
    private String onames;

    @Column(
            name = "client_idno",
            nullable = false
//            unique = true
    )
    private  Long client_idno;

    private LocalDate dob;

    @Column(
            name = "email",
            nullable = false
//            unique = true,
//            columnDefinition = "Text"
    )
    private String email;

    public Client() {
    }

    public Client(String email, LocalDate dob, Long client_idno, String onames, String fname, Long id) {
//        this.id = id;
        this.fname = fname;
        this.onames = onames;
        this.client_idno = client_idno;
        this.dob = dob;
        this.email = email;

    }

//    autogenerated id
    public Client(String fname, String onames, Long client_idno, LocalDate dob, String email) {
        this.fname = fname;
        this.onames = onames;
        this.client_idno = client_idno;
        this.dob = dob;
        this.email = email;
    }

    //refactor using lombook : https://medium.com/devdomain/using-lombok-in-spring-boot-simplifying-your-code-c38057894cb8
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getOnames() {
        return onames;
    }

    public void setOnames(String onames) {
        this.onames = onames;
    }

    public Long getClient_idno() {
        return client_idno;
    }

    public void setClient_idno(Long client_idno) {
        this.client_idno = client_idno;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", onames='" + onames + '\'' +
                ", client_idno=" + client_idno +
                ", dob=" + dob +
                ", email='" + email + '\'' +
                '}';
    }
}
