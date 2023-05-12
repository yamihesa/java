package YAMIII;

import java.util.Scanner;

public class MaratonInmi {

    public static void main(String[] args) {

        // pedir datos a las personas dni, nombre y edad
        // determinar a que categoria se tienen que inscribir
        // informarle a la persona
        // no sabemos la cantidad de personas

        // DNI
        System.out.println("INGRESE EL DNI DE LA PERSONA");
        try (Scanner teclado = new Scanner(System.in)) {
            String dni = teclado.nextLine();
            // NOMBRE
            System.out.println("INGRESE EL NOMBRE DE LA PERSONA");
            String nombre = teclado.nextLine();
            // EDAD
            System.out.println("INGRESE LA EDAD DE LA PERSONA");
            try (Scanner teclado2 = new Scanner(System.in)) {
                int edad = teclado2.nextInt();

                while ((!dni.equals("0") && !nombre.equalsIgnoreCase("FIN"))) {

                    if (edad >= 6 && edad <= 10) {
                        System.out.println("La categoria es MENORES A");
                    } else {
                        if (edad >= 11 && edad <= 18) {
                            System.out.println("La categoria es MENORES B");
                        } else {
                            if (edad >= 18 && edad <= 30) {
                                System.out.println("La categoria es JUVENILES");
                            } else {
                                if (edad >= 31 && edad <= 50) {
                                    System.out.println("La categoria es ADULTOS");
                                } else {
                                    if (edad >= 51) {
                                        System.out.println("La categoria es ADULTOS MAYORES");
                                    }
                                    else{
                                        System.out.println("La persona no cuenta con la edad indicada");
                                    }
                                }
                            }

                        }

                    }

                    System.out.println("INGRESE EL DNI DE LA PERSONA");
                    dni = teclado.nextLine();
                    System.out.println("INGRESE EL NOMBRE DE LA PERSONA");
                    nombre = teclado.nextLine();
                    System.out.println("INGRESE LA EDAD DE LA PERSONA");
                    edad = teclado.nextInt();
                }
            }
        }
    }
}
