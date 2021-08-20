package com.educacionit;

import java.util.Scanner;

//2)	Leer 10 números y obtener su cubo y su cuarta
public class AppPrincipal {

	public static void main(String[] args) {
		int contador = 1, numeroIngresado = 0, cubo = 0, cuarta = 0;
		Scanner teclado = new Scanner(System.in);

		while (contador <= 10) {
			System.out.println("Ingrese el numero " + contador + " por favor ");
			numeroIngresado = teclado.nextInt();
			contador++;
			cubo = numeroIngresado * numeroIngresado * numeroIngresado;
			cuarta = cubo * numeroIngresado;
			System.out.println(numeroIngresado + " al cubo es = " + cubo);
			System.out.println(numeroIngresado + " a la cuata potencia es = " + cuarta);

		}

		System.out.println("Fin de la app");

	}
}
