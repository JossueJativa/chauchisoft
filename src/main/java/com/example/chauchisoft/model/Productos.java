package com.example.chauchisoft.model;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;
import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter
public class Productos {
    @Id
    @Column(length = 32)
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Hidden
    String oid;

    @Column(length=50)
    @Required
    String nombre;

    @Column(length=50)
    @Required
    double precio;

    @Files
    @Column(length = 32)
    String fotos;

    @Column(length=50)
    @Required
    String descripcion;

    @DescriptionsList
    @ManyToOne
    private Categoria categoria;

    @ManyToOne
    @Required
    private Vendedor vendedor;
}