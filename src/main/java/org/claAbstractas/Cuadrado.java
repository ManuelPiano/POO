package org.claAbstractas;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
public class Cuadrado implements Figura, Dibujable{

    private double lado;


    @Override
    public double calcularArea() {

        double resultado = lado * lado;
        return resultado;
    }

    @Override
    public String dibujar() {

        return "Hola estoy dibujando un cuadrado";
    }
}
