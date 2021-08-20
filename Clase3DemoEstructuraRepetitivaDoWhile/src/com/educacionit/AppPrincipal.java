package com.educacionit;

import java.util.Scanner;

//1) desarrollar un algoritmo que permita ingresar 10 números 
//por teclado y que muestre por pantalla el promedio 
public class AppPrincipal {

	public static void main(String[] args) {

		int limite = 10, contador = 1, suma = 0, num = 0;
		float promedio = 0;
		Scanner teclado = new Scanner(System.in);

		do {
			System.out.println("ingrese el número " + contador);
			num = teclado.nextInt();
			suma += num;
			contador++;
		} while (contador <= limite);

		promedio = suma / limite;
		System.out.println("EL promedio de los números es: " + promedio);

		teclado.close();
		/*
		 * // - se ejecuta una vez // - n veces // - nunca se ejecuta while (false) {
		 * System.out.println("hola"); }
		 * 
		 * 
		 * // - se ejecuta una vez SI O SI // - n veces
		 * 
		 * do { // cuerpo del do while // sentencias a ejecutar
		 * 
		 * } while (condicion);
		 */
	}

}
