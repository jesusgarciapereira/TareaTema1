package tareatema1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Declaramos las variables de la base y la altura (las que pediremos)
		double base, altura;
		// Declaramos la variable area
		double area;
		// Activamos el scanner para leer el teclado
		Scanner sc = new Scanner(System.in);
		// Le pedimos al usuario que escriba la base
		System.out.println("Introduzca la longitud de la base");
		// Leemos la base
		base = sc.nextDouble();
		// Le pedimos al usuario que escriba la altura
		System.out.println("Introduzca la longitud de la altura");
		// Leemos la altura
		altura = sc.nextDouble();
		// Establecemos la relación entre las variables
		area = base * altura / 2;
		// Mostramos el resultado
		System.out.println("El área del triángulo es: " + area);
		// Cerramos el scanner
		sc.close();
	}

}
