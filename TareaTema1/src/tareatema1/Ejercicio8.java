package tareatema1;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Declaramos las variables para el número de entradas de cada tipo
		int entradasAdulto, entradasInfantil;
		/*
		 * Declaramos las variables para el precio total de las entradas y para el
		 * precio con el descuento aplicqdo
		 */
		double precioTotal, precioTotalConDescuento;
		/*
		 * Declaramos las constantes para los precios de cada tipo y el porcentaje de
		 * descuento
		 */
		final double PRECIO_ADULTO = 20;
		final double PRECIO_INFANTIL = 15.50;
		final double POR_CIENTO_DESCUENTO = 5;
		// Activamos el scanner para leer el teclado
		Scanner sc = new Scanner(System.in);
		// Mostramos un texto informativo sobre los precios
		System.out.println("El precio de cada entrada para adultos es de " + PRECIO_ADULTO
				+ " € y para niños es de " + PRECIO_INFANTIL + " €");
		// Le pedimos al usuario que escriba el número de entradas para adultos
		System.out.println("Introduzca el número de entradas para adultos que desea comprar");
		// Leemos la cantidad
		entradasAdulto = sc.nextInt();
		// Le pedimos al usuario que escriba el número de entradas para adultos
		System.out.println("Introduzca el número de entradas para niños que desea comprar");
		// Leemos la cantidad
		entradasInfantil = sc.nextInt();
		// Establezcemos la relación de las variables para definir el precio total
		precioTotal = entradasAdulto * PRECIO_ADULTO + entradasInfantil * PRECIO_INFANTIL;
		// Establezcemos la relación de las variables para definir el precio con
		// descuento
		precioTotalConDescuento = precioTotal - precioTotal * POR_CIENTO_DESCUENTO / 100;
		/*
		 * Mostramos el resultado del precio total y mostrará también el precio con
		 * descuento pero sólo en caso de que se cumpla la condición de superar los 100
		 * euros
		 */
		System.out
				.println("El precio total de las entradas sería de " + precioTotal + " €."
						+ ((precioTotal >= 100) ? "\nAl superar la cantidad de 100€, le aplicaremos un descuento del "
								+ POR_CIENTO_DESCUENTO + " % y se lo dejaríamos en " + precioTotalConDescuento + " €"
								: ""));
		// Cerramos el scanner
		sc.close();
	}

}
