package com.example.chauchisoft.model;

import java.time.LocalDate;
import java.util.Collection;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.calculators.CurrentLocalDateCalculator;

import lombok.*;

@Entity
@Getter @Setter
public class Reporte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Required
    @DefaultValueCalculator(CurrentLocalDateCalculator.class)
    LocalDate fecha;

    @ManyToOne(optional = false)
    Comprador comprador;

    @OneToMany(mappedBy = "reporte")
    Collection<ReporteBody> reporteBody;

    public Reporte() {
        this.fecha = LocalDate.now();
    }
}
