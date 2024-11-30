package com.example.chauchisoft.model;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter
public class Persona {
    @Column(length = 32)
    @GeneratedValue(generator = "system-uuid")
    @Hidden
    String oid;

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

    @ManyToOne(fetch=FetchType.LAZY)
    @DescriptionsList
    Productos productos;
}
