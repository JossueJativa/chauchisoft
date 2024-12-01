package com.example.chauchisoft.model;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter
public class ReporteBody {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne(optional = false)
    Reporte reporte;

    @ManyToOne(optional = false)
    Productos producto;

    @Column
    @Required
    int cantidad;
}
