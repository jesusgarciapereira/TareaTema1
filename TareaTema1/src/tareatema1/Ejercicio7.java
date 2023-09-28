package tareatema1;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Declaramos las variables
		double milimetros, centimetros, metros, totalCentimetros;
		// Declaramos las constantes
		final int MILIMETROS_POR_CENTIMETRO = 10;
		final int CENTIMETROS_POR_METRO = 100;
		// Activamos el scanner para leer el teclado
		Scanner sc = new Scanner(System.in);
		// Para poder usar decimales con un punto
		sc.useLocale(Locale.US);
		// Le pedimos al usuario que escriba la primera distancia
		System.out.println("Introduzca la primera distancia (en milímetros)");
		// Leemos la primera distancia
		milimetros = sc.nextDouble();
		// Le pedimos al usuario que escriba la segunda distancia
		System.out.println("Introduzca la segunda distancia (en centímetros)");
		// Leemos la segunda distancia
		centimetros = sc.nextDouble();
		// Le pedimos al usuario que escriba la tercera distancia
		System.out.println("Introduzca la tercera distancia (en metros)");
		// Leemos la tercera distancia
		metros = sc.nextDouble();
		// Establecemos la relación entre las variables
		totalCentimetros = milimetros / MILIMETROS_POR_CENTIMETRO + centimetros + metros * CENTIMETROS_POR_METRO;
		// Mostramos el resultado
		System.out.println("Las tres longitudes suman " + totalCentimetros + " centímetros");
		// Cerramos el scanner
		sc.close();
	}

}
