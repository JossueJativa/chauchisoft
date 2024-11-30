package com.example.chauchisoft.model;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter
public class Inventario {
    @Column(length = 32)
    @GeneratedValue(generator = "system-uuid")
    @Hidden
    String oid;

    @ManyToOne(fetch=FetchType.LAZY)
    @Required
    Productos producto;

    @Column
    @Required
    int cantidad;
}
