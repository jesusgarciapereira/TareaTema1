package tareatema1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Declaramos la variable numero
		int numero;
		// Declaramos la variable sumarParaMultiplo
		int sumarParaMultiplo;
		// Activamos el scanner para leer el teclado
		Scanner sc = new Scanner(System.in);
		// Le pedimos al usuario que escriba un número
		System.out.println("Introduzca un número");
		// Leemos el número
		numero = sc.nextInt();
		// Establecemos la relación entre las variables
		sumarParaMultiplo = (numero % 7 == 0) ? 0 : 7 - numero % 7;
		// Mostramos el resultado
		System.out.println("Hay que sumarle " + sumarParaMultiplo + " para obtener un múltiplo de 7");
		// Cerramos el scanner
		sc.close();
	}

}
