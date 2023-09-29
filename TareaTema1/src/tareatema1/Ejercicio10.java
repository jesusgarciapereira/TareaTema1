package tareatema1;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Declaramos las variables
		double distanciaMetros, distanciaCentimetros;
		// Declaramos la constante
		final int CENTIMETROS_POR_METRO = 100;
		// Activamos el scanner para leer el teclado
		Scanner sc = new Scanner(System.in);
		// Para poder usar decimales con un punto
		sc.useLocale(Locale.US);
		// Le pedimos al usuario que escriba la longitud de lanzamiento
		System.out.println("Introduzca la longitud de lanzamiento (en metros)");
		// Leemos la distancia que hemos pedido
		distanciaMetros = sc.nextDouble();
		// Establecemos la relación entre las variables
		distanciaCentimetros = distanciaMetros * CENTIMETROS_POR_METRO;
		// Mostramos el resultado
		System.out.println("Queda registrado en el ranking la longitud de " + (int)distanciaCentimetros + " centímetros.");
		// Cerramos el scanner
		sc.close();
	}

}
