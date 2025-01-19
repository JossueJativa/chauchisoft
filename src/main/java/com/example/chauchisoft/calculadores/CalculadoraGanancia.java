package com.example.chauchisoft.calculadores;

import org.openxava.calculators.*;

import lombok.*;

public class CalculadoraGanancia implements ICalculator {
    @Getter
    @Setter
    private double precio;

    @Getter
    @Setter
    private double porcentageGanancia;

    @Override
    public Object calculate() throws Exception {
        double gananciaFinal = precio * (porcentageGanancia / 100);
        System.out.println("La ganancia es: " + gananciaFinal);
        return gananciaFinal;
    }
}
