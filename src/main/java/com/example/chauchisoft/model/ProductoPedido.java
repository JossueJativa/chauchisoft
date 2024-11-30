
package com.example.chauchisoft.model;

import javax.persistence.*;

import lombok.*;

@Entity
@Getter @Setter
public class ProductoPedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "producto_id")
    Productos producto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "reporte_id")
    Reporte reporte;

    @Column
    int cantidad;
}