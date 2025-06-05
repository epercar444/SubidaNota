package Excepciones;
import java.util.Random;
public class BoletinEjercicio4 {
	public static void main(String[] args) {
	Random random = new Random();
	Double[] resultados = new Double[20];

	try {
	for (int i = 0; i < 20; i++) {
	int numero1 = random.nextInt(11);
	int numero2 = random.nextInt(11);

	double division = numero1 / numero2;
	resultados[i] = division;
	}


	resultados[100] = 1.5;


	Double valorrecogido = resultados[5];
	System.out.println("Valor en la posición 5: " + valorrecogido.toString());

	} catch (ArithmeticException e) {
	System.out.println(e.getMessage());;

	} catch (ArrayIndexOutOfBoundsException e) {
	System.out.println(e.getMessage());;

	} catch (NullPointerException e) {
	System.out.println(e.getMessage());


	}
	}
	}
 
