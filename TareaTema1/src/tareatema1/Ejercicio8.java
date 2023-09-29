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
		/*
		 * Decido declarar esta variable de tipo String para mostrar un texto que
		 * definiré más adelante
		 */
		String aplicoDescuento;
		// Activamos el scanner para leer el teclado
		Scanner sc = new Scanner(System.in);
		// Texto informativo sobre los precios
		System.out.println("El precio de cada entrada para adultos es de " + PRECIO_ADULTO
				+ " € y el precio de cada entrada para niños es de " + PRECIO_INFANTIL + " €");
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
		/*
		 * Mediante un ternario aplicaremos el descuento en caso de que se cumpla la
		 * condición del precio total mayor que 100 o, en caso de que no, mantendremos
		 * el precio total sin descuento
		 */
		precioTotalConDescuento = (precioTotal >= 100) ? precioTotal - precioTotal * POR_CIENTO_DESCUENTO / 100
				: precioTotal;
		/*
		 * Definimos un String que muestre un texto al que le concatenaremos otra cadena
		 * de texto (mediante otro ternario con la misma condición que el anterior) en
		 * caso de que se cumpla la condición, si no se cumple no mostrará nada más
		 */
		aplicoDescuento = "El precio total de las entradas sería de " + precioTotal + " €."
				+ ((precioTotal >= 100)
						? "\nAl superar la cantidad de 100€, le aplicaremos un descuento del 5% y se lo dejaríamos en "
								+ precioTotalConDescuento + " €"
						: "");
		// Mostramos el resultado
		System.out.println(aplicoDescuento);
		// Cerramos el scanner
		sc.close();
	}

}
