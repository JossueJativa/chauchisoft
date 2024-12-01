package com.example.chauchisoft.model;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;
import org.openxava.annotations.*;

import lombok.*;

@Entity
@Table(name = "inventarios")
@Getter @Setter
public class Inventario {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(length = 32)
    @Hidden
    String oid;

    @ManyToOne(fetch=FetchType.LAZY)
    @Required
    Productos producto;

    @Column
    @Required
    int cantidad;
}
