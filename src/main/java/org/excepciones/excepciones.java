package org.excepciones;

public class excepciones {
    public static void main(String[] args) {

        int edades [] = {15,12,23,30};

    try {


        System.out.println("La edad de la posicion 4 es: " + edades[6]);

    }catch (Exception e){
        System.out.println("Indice no existe");
    }
    }
}
