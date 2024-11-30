package com.example.chauchisoft.model;

import javax.persistence.*;
import org.openxava.annotations.*;
import lombok.*;

@Entity
@Getter @Setter
public class Categoria {   
    @Id
    @Column(length = 32)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Hidden
    Long oid;

    @Column(length=50)
    @Required
    String nombre;
}
