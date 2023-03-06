package org.pilas;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<Integer>();
        System.out.println("Lista vacía: " + pila);
        System.out.println("Esta vacía? " + pila.isEmpty());

        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);

        for (Integer pilis : pila){
            System.out.println(pilis);
        }
        //mostrar
        System.out.println("Pila: " + pila);
        System.out.println("Esta vacía?" + pila.isEmpty());

        pila.pop();// eliminar el ultimo
        System.out.println("esta el 3? " + pila.search(3));
        System.out.println("Ultimo agregado: " + pila.peek());

    }
}
