package com.example.chauchisoft.model;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@MappedSuperclass
@Getter @Setter
abstract public class Persona {
    @Column(length=50)
    @Required
    String nombre;

    @Column(length=50)
    @Required
    String apellido;

    @Column(length=50)
    @Required
    String email;

    @Column(length=50)
    @Required
    String cedula;
}
