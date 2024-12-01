package com.example.chauchisoft.model;

import javax.persistence.*;
import java.util.List;
import lombok.*;

@Entity
@Getter @Setter
public class Cliente extends Persona {
    @ManyToMany
    @JoinTable(
        name = "cliente_productos",
        joinColumns = @JoinColumn(name = "cliente_id"),
        inverseJoinColumns = @JoinColumn(name = "producto_id")
    )
    private List<Productos> productosComprados;
}