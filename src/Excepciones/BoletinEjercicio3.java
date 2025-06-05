package Excepciones;

import java.util.Scanner;

public class BoletinEjercicio3 {
	public void NumeroPorTeclado () {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce un numero: ");
        int numero = scanner.nextInt();
        if (numero >= 0) {
        	throw new ArithmeticException("El número no puede ser positivo");
        }
	}
}
