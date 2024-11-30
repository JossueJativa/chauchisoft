package com.example.chauchisoft.model;

import java.util.Date;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter
public class Vendedor extends Persona {
    @Column(length = 32)
    @GeneratedValue(generator = "system-uuid")
    @Hidden
    String oid;

    @Column(length=50)
    @Required
    String usuario;

    @Column(length=50)
    @Required
    String contrasena;

    @DateTime
    @Required
    Date fechaIngreso;
}
