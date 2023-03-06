package org.linkedlist;

import java.util.*;


public class Arraylist {
    public static void main(String[] args) {

        List<Persona> listArray = new ArrayList<Persona>();
        listArray.add(new Persona(1,"Jose",53));
        listArray.add(new Persona(2,"mario",23));
        listArray.add(new Persona(3,"mateo",32));
        listArray.add(new Persona(4,"lucas",12));
        listArray.add(new Persona(5,"Juan",24));


        LinkedList<Persona> linkedlist = new LinkedList<Persona>();
        linkedlist.add(new Persona(1,"Jose",53));
        linkedlist.add(new Persona(2,"mario",23));
        linkedlist.add(new Persona(3,"mateo",32));
        linkedlist.add(new Persona(4,"lucas",12));
        linkedlist.add(new Persona(5,"Juan",24));

        //remove arraylist
        listArray.remove(1);

        //remove linkedlist


        String nombreBorrar = "mario";
        for (Persona persona2 : linkedlist){
            if (persona2.getNombre().equals(nombreBorrar)){
                linkedlist.remove(persona2);
                break;
            }
        }
        System.out.println("-----Luego de eliminar-----");
        //recorre foreach
        System.out.println("-----Arryalis-----");
        for (Persona persona : listArray){
            System.out.println("Prueba: " + persona.getNombre());

        }
        System.out.println("----LINKEDLIST----");
        for (Persona perso : linkedlist){
            System.out.println("Prueba2: " + perso.getNombre());
        }

        System.out.println("-----------Tamaño de listas-------------");
        System.out.println("Arraylist: " +listArray.size());
        System.out.println("LinkedList" + linkedlist.size());

        //obtener el primer object
        System.out.println("obtener el primer y el ultimo objeto");
        System.out.println("Primero Linkedlist: " + linkedlist.getFirst().toString());
        System.out.println("Ultimo de Linkedlist: " + linkedlist.getLast().toString());

        //Borrar la lista
        System.out.println("Borrando listas" );
        listArray.clear();
        linkedlist.clear();

        //comprobacion si esta vacia

        System.out.println("la lista esta vacia");
        System.out.println("Arraylist: " + listArray.isEmpty());
        System.out.println("Linkedlist: " + linkedlist.isEmpty());

    }
}
