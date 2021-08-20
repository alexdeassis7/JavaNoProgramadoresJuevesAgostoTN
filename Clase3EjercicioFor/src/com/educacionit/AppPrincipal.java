package com.educacionit;

import java.util.Scanner;

//3)	Leer 10 números e imprimir solamente los positivos
public class AppPrincipal {

	public static void main(String[] args) {
		int numeroIngresado = 0;
		Scanner teclado = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.println("ingrese el numero " + (i + 1));
			numeroIngresado = teclado.nextInt();
			if (numeroIngresado > 0)
				System.out.println(numeroIngresado + " ES POSITIVO ");
		}

		System.out.println("Fin de la app");
	}

}
