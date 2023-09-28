package tareatema1;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Declaramos las variables del polinomio
		double a, b, c, x, y;
		// Activamos el scanner para leer el teclado
		Scanner sc = new Scanner(System.in);
		// Para poder usar decimales con un punto
		sc.useLocale(Locale.US);
		// Presentamos el programa
		System.out.println("Vamos a crear un polinomio de segundo grado tal que así: y = ax^2 + bx + c");
		// Le pedimos al usuario que elija un valor para a
		System.out.println("Elije un valor para a");
		// Leemos la variable a
		a = sc.nextDouble();
		// Le pedimos al usuario que elija un valor para b
		System.out.println("Elije un valor para b");
		// Leemos la variable b
		b = sc.nextDouble();
		// Le pedimos al usuario que elija un valor para c
		System.out.println("Elije un valor para c");
		// Leemos la variable c
		c = sc.nextDouble();
		//Enseñamos cómo quedaría el polinomio con las variables definidas anteriormente
		System.out.println("Así queda el polinomio: y = " + a + "x^2 + " + b + "x + " + c);
		// Le pedimos al usuario que elija un valor para x
		System.out.println("Ahora elije un valor para x");
		// Leemos la variable x
		x = sc.nextDouble();
		// Establecemos la relación entre las variables
		y = a * Math.pow(x, 2) + b * x + c;
		// Mostramos el resultado
		System.out.println("El valor de y será " + y);
		// Cerramos el scanner
		sc.close();
	}

}
