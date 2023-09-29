package tareatema1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Declaramos las variables para los dos números que pediremos
		int num1, num2;
		// Declaramos la variable sumarParaMultiplo
		int sumarParaMultiplo;
		// Declaramos la variable multiploValido
		int multiploValido;
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
		// Establecemos la relación entre las variables
		sumarParaMultiplo = (num1 % num2 == 0) ? 0 : num2 - num1 % num2;
		multiploValido = num1 + sumarParaMultiplo;
		// Mostramos el resultado
		System.out.println("Al " + num1 + " hay que sumarle " + sumarParaMultiplo + " para obtener " + multiploValido
				+ ", es decir, un múltiplo de " + num2 + "\n" + num2 + " * " + (multiploValido / num2) + " = "
				+ multiploValido);
		// Cerramos el scanner
		sc.close();

	}

}
