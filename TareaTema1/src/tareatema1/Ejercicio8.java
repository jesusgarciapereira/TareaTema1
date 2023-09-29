package tareatema1;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		int entradasAdulto, entradasInfantil;
		final double PRECIO_INFANTIL = 15.50;
		final double PRECIO_ADULTO = 20;
		final double DESCUENTO = 0.05;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el número de entradas para adultos que desea comprar");
		entradasAdulto = sc.nextInt();
		System.out.println("Introduzca el número de entradas para niños que desea comprar");
		entradasInfantil = sc.nextInt();
	}

}
