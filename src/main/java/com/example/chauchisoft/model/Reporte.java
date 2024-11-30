package com.example.chauchisoft.model;

import java.time.LocalDate;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.calculators.CurrentLocalDateCalculator;

import lombok.*;

import java.util.List;

@Entity
@Getter @Setter
public class Reporte {
    @Column(length = 32)
    @GeneratedValue(generator = "system-uuid")
    @Hidden
    String oid;

    @Column(length=50)
    @DefaultValueCalculator(CurrentLocalDateCalculator.class)
    LocalDate fecha;

    @OneToMany(mappedBy = "reporte", cascade = CascadeType.ALL)
    List<ProductoPedido> productosPedidos;

    @ManyToOne(fetch = FetchType.LAZY)
    @Required
    Comprador comprador;
}
