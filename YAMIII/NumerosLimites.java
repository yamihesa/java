package YAMIII;

import java.util.Scanner;

public class NumerosLimites
{
	public static void main(String[] args) {
		
		System.out.println("Ingrese el limite hasta el que quiere contar");
		try (Scanner teclado = new Scanner (System.in)) {
            int limite = teclado.nextInt();
            int cont = 1;
            
            while (cont <= limite){
                System.out.println(cont);
                cont = cont + 1;
            }
        }
	}
}
