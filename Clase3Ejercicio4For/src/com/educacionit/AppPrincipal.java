package com.educacionit;

import java.util.Scanner;

//4)	Leer 20 números e imprimir cuantos son positivos , cuantos negativos y cuantos neutros
public class AppPrincipal {

	public static void main(String[] args) {

		int cantidadPositivos = 0, cantidadNegativos = 0, cantidadNeutros = 0, numeroIngresado = 0;
		Scanner teclado = new Scanner(System.in);

		int i = 0;

		for (i = 1; i <= 20; i++) {

			System.out.println("ingrese por favor el numero " + i);
			numeroIngresado = teclado.nextInt();

			if (numeroIngresado > 0) {
				cantidadPositivos++;
			} else if (numeroIngresado < 0) {
				cantidadNegativos++;
			} else {
				cantidadNeutros++;
			}
		}

		System.out.println("de los " + (i - 1) + " numeros ingresados ");
		System.out.println(cantidadNegativos + " son Negativos");
		System.out.println(cantidadPositivos + " son Positivos");
		System.out.println(cantidadNeutros + " son Neutros");

		System.out.println("Fin de la App");
	}

}
