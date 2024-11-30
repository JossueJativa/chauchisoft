package com.example.chauchisoft.model;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

import java.util.List;

@Entity
@Getter @Setter
public class Comprador extends Persona {
    @Column(length = 32)
    @GeneratedValue(generator = "system-uuid")
    @Hidden
    String oid;

    @OneToMany(mappedBy = "comprador", cascade = CascadeType.ALL)
    List<Reporte> reportes;
}
