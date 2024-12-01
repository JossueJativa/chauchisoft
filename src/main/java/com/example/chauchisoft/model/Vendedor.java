package com.example.chauchisoft.model;

import java.util.Date;
import java.util.Calendar;
import java.util.List;

import javax.persistence.*;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter
public class Vendedor extends Persona {
    @Id
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
    Date fechaNacimiento;

    @OneToMany(mappedBy = "vendedor")
    private List<Productos> productos;

    public boolean isOlderThan18() {
        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);
        calendar.setTime(fechaNacimiento);
        int birthYear = calendar.get(Calendar.YEAR);
        return (currentYear - birthYear) > 18;
    }

    @PrePersist
    @PreUpdate
    private void validateAge() {
        if (!isOlderThan18()) {
            throw new IllegalArgumentException("El vendedor debe ser mayor de 18 años.");
        }
    }
}
