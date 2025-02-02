package com.example.chauchisoft.model;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;
import org.openxava.annotations.*;

import com.example.chauchisoft.calculadores.CalculadoraGanancia;

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

    @Column(length = 50)
    @Required
    double porcentageGanancia;

    @Column(length = 50)
    @Required
    @DefaultValueCalculator(value = CalculadoraGanancia.class, properties = {
            @PropertyValue(name = "precio", from = "precio"),
            @PropertyValue(name = "porcentageGanancia", from = "porcentageGanancia")
    })
    double gananciaCalculada;

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

    private boolean isPriceValid(double price) {
        return price > 0;
    }

    @PrePersist
    @PreUpdate
    private void validatePrice() {
        if (!isPriceValid(precio)) {
            throw new IllegalArgumentException("El precio debe ser mayor a 0");
        }
    }
}