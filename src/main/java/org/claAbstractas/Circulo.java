package org.claAbstractas;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Circulo implements Figura,Dibujable,Rotable {

    private double radio;


    @Override
    public double calcularArea() {
        double pi = 3.14;
        double resultado = pi * radio * radio;
        return resultado;
    }

    @Override
    public  String dibujar() {

        return "Hola estoy dibujando un circulo";
    }

    @Override
    public String rotar() {

        return "Estoy rotando un circulo";
    }
}
