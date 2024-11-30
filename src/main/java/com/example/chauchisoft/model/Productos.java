package com.example.chauchisoft.model;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter
public class Productos {
    @Column(length = 32)
    @GeneratedValue(generator = "system-uuid")
    @Hidden
    String oid;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length=50)
    @Required
    String nombre;

    @Column(length=50)
    @Required
    String precio;

    @Files
    @Column(length = 32)
    String fotos;

    @Column(length=50)
    @Required
    String descripcion;

    @ManyToOne(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
    @Required
    Categoria categoria;
}