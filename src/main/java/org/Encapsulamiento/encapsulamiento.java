package org.Encapsulamiento;

public class encapsulamiento {
    public static void main(String[] args) {

        Alumno alu = new Alumno();
        Alumno alu2 = new Alumno(15, "Todo code","Suscibete");

        System.out.println("id: " + alu2.getId());
        System.out.println("nombre: " + alu2.getNombre());
        System.out.println("Apellido: " + alu2.getApellido());
    }

}
