package org.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Linkedlist {
    public static void main(String[] args) {
        List<Persona> list = new LinkedList<Persona>();

        list.add(new Persona(1,"Manuel",24));
        list.add(new Persona(1,"Manuel",24));
        list.add(new Persona(1,"Manuel",24));
        list.add(new Persona(1,"Manuel",24));

        //Add first
        list.add(0,new Persona(4,"MenTest",52));


        for (Persona peso:list){
            System.out.println("Prueba: " + peso.getNombre());
            System.out.println("Edad: " + peso.getEdad());
        }
    }
}
