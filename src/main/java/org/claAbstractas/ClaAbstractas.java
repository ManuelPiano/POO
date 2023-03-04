package org.claAbstractas;

import java.util.Scanner;

public class ClaAbstractas {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int opcion;
        double radio;
        double lado;
        do{
            System.out.println("Que figura desea calcular su area");
            System.out.println("1. Circulo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Salir");
            opcion = inp.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("ingrese el radio de la figura");
                    radio = inp.nextDouble();
                    Circulo circulo = new Circulo(radio);
                    String accion = circulo.dibujar();
                    String rot = circulo.rotar();
                    double areaC = circulo.calcularArea();
                    System.out.println("El area del circulo es: " + areaC);
                    System.out.println(accion);
                    System.out.println(rot);
                    System.out.println("--------------------------------");

                    break;

                case 2:
                    System.out.println("Ingrese el lado del cuadrado");
                    lado = inp.nextDouble();
                    Cuadrado cuadrado = new Cuadrado(lado);
                    double areaCu = cuadrado.calcularArea();
                    String accionC = cuadrado.dibujar();
                    System.out.println("El area del cuadrado es: " + areaCu);
                    System.out.println(accionC);
                    System.out.println("----------------------------------");
                    break;
                case 3:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }

        }while (opcion != 3);
    }
    }

