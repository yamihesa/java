package YAMIII;
import java.util.Scanner;

public class EjercicioCentinela {
    
    public static void main(String[] args){
        
        System.out.println("Ingrese una palabra");
        try (Scanner teclado = new Scanner (System.in)) {
            String palabra = teclado.next();

            while (!palabra.equalsIgnoreCase("salir")) {
            System.out.println("La palabra es: " + palabra);

            System.out.println("Ingrese una palabra");
                palabra = teclado.next();
            }
        }

    }


}
