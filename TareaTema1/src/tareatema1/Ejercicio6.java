package tareatema1;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		// Declaramos las variables
		int horas, minutos, segundosPedidos, segundosSobrantes;
		// Activamos el scanner para leer el teclado
		Scanner sc = new Scanner(System.in);
		// Le pedimos al usuario que escriba la cantidad de segundos
		System.out.println("Introduzca la cantidad de segundos");
		// Leemos los segundos que hemos pedido
		segundosPedidos = sc.nextInt();
		// Establecemos la relación entre las variables
		horas = segundosPedidos / 3600;
		minutos = segundosPedidos % 3600 / 60;
		segundosSobrantes = segundosPedidos % 3600 % 60;
		// Mostramos el resultado
		System.out.println(segundosPedidos + " segundos son en total: " + horas + " horas, " + minutos + " minutos y "
				+ segundosSobrantes + " segundos");
		// Cerramos el scanner
		sc.close();
	}
}
