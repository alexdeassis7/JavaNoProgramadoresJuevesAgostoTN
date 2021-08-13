package com.educacionit.clase2;

import java.util.Scanner;

//1) Desarrollar un algoritmo que permita determinar si un número
//ingresado por teclado es positivo o negativo. 
public class AppPrincipalDos {

	public static void main(String[] args) {

		int numeroIngresado = 0;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese por favor un numero entero distinto de cero");
		numeroIngresado = teclado.nextInt();

		if (numeroIngresado > 0) {
			System.out.println("el numero ingresado es positivo");
		} else {
			System.out.println("el numero ingresado es Negativo");
		}

		System.out.println("Fin de la app");
	}

}
