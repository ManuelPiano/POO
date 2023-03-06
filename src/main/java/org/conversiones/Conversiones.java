package org.conversiones;

public class Conversiones {
    public static void main(String[] args) {

        /*double num = 1.77;

        //cast to int

        int numint = (int) num;

        //cast to long
        long numlong = (long) num;

        // cast to double again
        double numdouble = (double) numint;

        System.out.println("double: " +  num);
        System.out.println("Int: " + numint);
        System.out.println("Long: " + numlong);
        System.out.println("double2: " + numdouble);*/


        //otro ejemplo

        /*String cantidad = "15";
        String precio = "150.27";

        int cant = Integer.parseInt(cantidad);
        double precioD = Double.parseDouble(precio);

        System.out.println("EL valor de venta es: " + (cant*precioD));*/

        //otro mas

        int edad = 33;
        double estatura = 1.77;

        String edadS = String.valueOf(edad);
        String estatD = String.valueOf(estatura);

        System.out.println("edad: " + edadS +" " + "Estatura: " + estatD);

    }
}
