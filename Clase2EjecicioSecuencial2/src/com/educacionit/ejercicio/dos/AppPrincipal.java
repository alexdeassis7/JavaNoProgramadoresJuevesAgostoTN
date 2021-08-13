package com.educacionit.ejercicio.dos;

import java.util.Scanner;

//una Tienda ofrece un descuento del 15% sobre el total de la compra y un cliente desea saber cuanto deberá
// pagar finalmente por su compra 
public class AppPrincipal {

	public static void main(String[] args) {
		// defino mis variables de trabajo
		Scanner teclado = new Scanner(System.in);
		float totalCompra = 0, decuento = 0, total_a_pagar = 0;
		final float PORCENTAJE = 0.15f;

//		que entra ?  
		System.out.println("Ingrese por favor el monto de su compra");
		totalCompra = teclado.nextFloat();// leemos el dato y lo persisto en la variable totalCompra

//		que se procesa ?
		decuento = totalCompra * PORCENTAJE;
		total_a_pagar = totalCompra - decuento;

//		que sale?
		System.out.println("se Realizo un descuento del 15% sobre su compra de " + totalCompra + " pesos"
				+ " el precio final a pagar es de " + total_a_pagar + " pesos");

		teclado.close();
	}

}
