package tareatema1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Declaramos la variable numero
		int numero;
		// Declaramos la variable sumarParaMultiplo
		int sumarParaMultiplo;
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
		// Mostramos el resultado
		System.out.println("Hay que sumarle " + sumarParaMultiplo + " para obtener un múltiplo de " + MULTIPLO_DE);
		// Cerramos el scanner
		sc.close();
	}

}
