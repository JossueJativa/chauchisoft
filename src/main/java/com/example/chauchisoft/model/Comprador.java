package com.example.chauchisoft.model;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter
public class Comprador {
    @Column(length=50)
    @Required
    String nombre;

    @Column(length=50)
    @Required
    String apellido;

    @Column(length=50)
    @Required
    String email;

    @Id
    @Column(length=50, unique=true)
    @Required
    String cedula;
}
