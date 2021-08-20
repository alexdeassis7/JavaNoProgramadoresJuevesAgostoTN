package com.educacionit.condicional.multiple;

import java.util.Scanner;

//Enunciado :
//Desarrollar un algoritmo que permita ingresar un numero entero comprendido entre 1 y 10 ,
//y que muestre por pantalla si el numero es par o impar 
public class AppPrincipal {

	public static void main(String[] args) {
		int num = 0;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese un numero entero comprendido entre 1 y 10");
		num = teclado.nextInt();

		if (num >= 1 && num <= 10) {

			switch (num) {
			case 1, 3, 5, 7, 9:
				System.out.println("Numero Impar");
				break;
			case 2:
			case 4:
			case 6:
			case 8:
			case 10:
				System.out.println("Numero Par");
				break;

			}
		} else {
			System.out.println("Numero ingresado Incorrecto");
		}

		System.out.println("Fin de la app");
	}
}
