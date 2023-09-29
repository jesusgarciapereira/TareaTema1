package tareatema1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// Declaramos las variables para los dos números que pediremos
		int num1, num2;
		// Activamos el scanner para leer el teclado
		Scanner sc = new Scanner(System.in);
		// Le pedimos al usuario que escriba un número
		System.out.println("Introduzca un número");
		// Leemos el número
		num1 = sc.nextInt();
		// Le pedimos al usuario que escriba el segundo número
		System.out.println("Introduzca otro número");
		// Leemos el segundo número
		num2 = sc.nextInt();
		// Mostramos el resultado
		System.out.println("¿Los números " + num1 + " y " + num2 + " son iguales? \n" + (num1 == num2));
		// Cerramos el scanner
		sc.close();

	}

}
