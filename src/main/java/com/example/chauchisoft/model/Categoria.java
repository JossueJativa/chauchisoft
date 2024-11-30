package com.example.chauchisoft.model;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter
public class Categoria {
    @Column(length = 32)
    @GeneratedValue(generator = "system-uuid")
    @Hidden
    String oid;

    @Column(length=50)
    @Required
    String nombre;
}
