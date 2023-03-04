package org.Herenecia;

public class Herencia {
    public static void main(String[] args) {
        Persona vector [] = new Persona[5];
        vector [0] = new Persona();
        vector [1] = new Empleado();
        vector [2] = new Consultor();
        vector [3] = new Jefe();

        Persona perso = new Persona();
        Consultor consultor = new Consultor();



    }
}
