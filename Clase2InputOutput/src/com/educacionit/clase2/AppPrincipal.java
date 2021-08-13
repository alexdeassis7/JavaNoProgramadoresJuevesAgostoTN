package com.educacionit.clase2;

import java.util.Scanner;

public class AppPrincipal {

	public static void main(String[] args) {
		// lectura de datos
		Scanner teclado = new Scanner(System.in);

		System.out.println("welcome to app");

		System.out.println("por favor ingrese su edad :");
		int edadIngresada = teclado.nextInt();

		System.out.println("por favor ingrese su nombre :");
		String nombreIngresado = teclado.next();

		// salida de datos
		System.out.println("su nombre es : " + nombreIngresado + " y su edad es " + edadIngresada);

		teclado.close();//liberar recursos 
	}

}
