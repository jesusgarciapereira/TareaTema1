package tareatema1;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		// Declaramos las variables
		int horas, minutos, segundosPedidos, segundosSobrantes;
		// Declaramos las constantes
		final int SEGUNDOS_EN_UNA_HORA = 3600;
		final int MINUTOS_EN_UNA_HORA = 60;
		// Activamos el scanner para leer el teclado
		Scanner sc = new Scanner(System.in);
		// Le pedimos al usuario que escriba la cantidad de segundos
		System.out.println("Introduzca la cantidad de segundos");
		// Leemos los segundos que hemos pedido
		segundosPedidos = sc.nextInt();
		// Establecemos la relación entre las variables
		horas = segundosPedidos / SEGUNDOS_EN_UNA_HORA;
		minutos = segundosPedidos % SEGUNDOS_EN_UNA_HORA / MINUTOS_EN_UNA_HORA;
		segundosSobrantes = segundosPedidos % SEGUNDOS_EN_UNA_HORA % MINUTOS_EN_UNA_HORA;
		// Mostramos el resultado
		System.out.println(segundosPedidos + " segundo(s) son en total: " + horas + " hora(s), " + minutos + " minuto(s) y "
				+ segundosSobrantes + " segundo(s)");
		// Cerramos el scanner
		sc.close();
	}
}
