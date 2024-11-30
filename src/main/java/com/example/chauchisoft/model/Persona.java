package com.example.chauchisoft.model;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@MappedSuperclass
@Getter @Setter
abstract public class Persona {
    @Id
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
    private Productos product;
}
