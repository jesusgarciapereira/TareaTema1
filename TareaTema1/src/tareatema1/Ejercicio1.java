package tareatema1;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Declaramos la variable numero
		double numero;
		// Declaramos la variable numeroRedondeado
		int numeroRedondeado;
		// Activamos el scanner para leer el teclado
		Scanner sc = new Scanner(System.in);
		// Para poder usar decimales con un punto
		sc.useLocale(Locale.US);
		// Le pedimos al usuario el número
		System.out.println("Escriba un número con decimales");
		// Leemos el número
		numero = sc.nextDouble();
		// Establecemos la relación entre las variables
		numeroRedondeado = (int) (numero + 0.5);
		// Mostramos el resultado
		System.out.println("El número entero más próximo es: " + numeroRedondeado);
		// Cerramos el scanner
		sc.close();
	}

}
