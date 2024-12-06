package com.example.chauchisoft.model;

import java.util.Date;
import java.util.Calendar;
import java.util.List;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter
@Setter
public class Vendedor extends Persona {
    @Id
    @Column(length = 32)
    @GeneratedValue(generator = "system-uuid")
    @Hidden
    String oid;

    @Column(length = 50)
    @Required
    String usuario;

    @Column(length = 50)
    @Required
    String contrasena;

    @DateTime
    @Required
    Date fechaNacimiento;

    @Column(length = 10)
    @Required
    String cedula;

    @OneToMany(mappedBy = "vendedor")
    private List<Productos> productos;

    public boolean isOlderThan18() {
        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);
        calendar.setTime(fechaNacimiento);
        int birthYear = calendar.get(Calendar.YEAR);
        return (currentYear - birthYear) > 18;
    }

    private boolean validarCedula(String x) {
        int suma = 0;
        if (x.length() == 9) {
            return false;
        } else {
            int a[] = new int[x.length() / 2];
            int b[] = new int[(x.length() / 2)];
            int c = 0;
            int d = 1;
            for (int i = 0; i < x.length() / 2; i++) {
                a[i] = Integer.parseInt(String.valueOf(x.charAt(c)));
                c = c + 2;
                if (i < (x.length() / 2) - 1) {
                    b[i] = Integer.parseInt(String.valueOf(x.charAt(d)));
                    d = d + 2;
                }
            }

            for (int i = 0; i < a.length; i++) {
                a[i] = a[i] * 2;
                if (a[i] > 9) {
                    a[i] = a[i] - 9;
                }
                suma = suma + a[i] + b[i];
            }
            int aux = suma / 10;
            int dec = (aux + 1) * 10;
            if ((dec - suma) == Integer.parseInt(String.valueOf(x.charAt(x.length() - 1))))
                return true;
            else if (suma % 10 == 0 && x.charAt(x.length() - 1) == '0') {
                return true;
            } else {
                return false;
            }

        }
    }

    @PrePersist
    @PreUpdate
    private void validateAgeAndCedula() {
        if (!isOlderThan18()) {
            throw new IllegalArgumentException("El vendedor debe ser mayor de 18 años.");
        }
        if (!validarCedula(cedula)) {
            throw new IllegalArgumentException("La cédula ingresada no es válida.");
        }
    }
}
