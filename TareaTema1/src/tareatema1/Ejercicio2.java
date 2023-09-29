package tareatema1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Declaramos la variable numero
		int numero;
		// Declaramos la variable sumarParaMultiplo
		int sumarParaMultiplo;
		// Declaramos la variable multiploValido
		int multiploValido;
		// Declaramos la constante MULTIPLO_DE
		final int MULTIPLO_DE = 7;
		// Activamos el scanner para leer el teclado
		Scanner sc = new Scanner(System.in);
		// Le pedimos al usuario que escriba un número
		System.out.println("Introduzca un número");
		// Leemos el número
		numero = sc.nextInt();
		// Establecemos la relación entre las variables
		sumarParaMultiplo = (numero % MULTIPLO_DE == 0) ? 0 : MULTIPLO_DE - numero % MULTIPLO_DE;
		multiploValido = numero + sumarParaMultiplo;
		/*
		 * Mostramos el resultado, mediante un ternario quiero imponer la condición de que el
		 * usuario sólo pueda elegir números a partir del 1
		 */
		System.out.println((numero > 0)
				? "Hay que sumarle " + sumarParaMultiplo + " para obtener " + multiploValido
						+ ", es decir, un múltiplo de " + MULTIPLO_DE + "\n" + MULTIPLO_DE + " * "
						+ (multiploValido / MULTIPLO_DE) + " = " + multiploValido
				: "Sólo son válidos los números a partir del 1, ejecute de nuevo el programa e introduzca otro número");
		// Cerramos el scanner
		sc.close();
	}

}
