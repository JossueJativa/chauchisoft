package com.example.chauchisoft.model;

import javax.persistence.*;

import org.openxava.annotations.Hidden;

import java.util.List;
import lombok.*;

@Entity
@Table(name = "cliente")
@Getter @Setter
public class Cliente extends Persona {
    @Id
    @Column(length = 32)
    @GeneratedValue(generator = "system-uuid")
    @Hidden
    String oid;

    @OneToMany(mappedBy = "cliente")
    private List<Productos> productos;
}
