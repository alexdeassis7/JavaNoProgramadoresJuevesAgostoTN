package com.educacionit.condiciona.multiple;

import java.util.Scanner;

//Condicional multiple (switch)

//Ejemplo menu de opciones 

public class AppPrincipal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int opcionIngresada = 0;

		System.out.println("ingrese una opcion por favor ");
		System.out.println("1) sumar");
		System.out.println("2) sumar");
		System.out.println("3) multiplicar");
		opcionIngresada = teclado.nextInt();

		switch (opcionIngresada) {

		case 1:
			System.out.println("Usted selecciono la opcion 1 de sumar");
			break;
		case 2:
			System.out.println("Usted selecciono la opcion 2 de restar");
			break;
		case 3:
			System.out.println("Usted selecciono la opcion 3 de multiplicar");
			break;
		// el default es opcional
		default:
			System.out.println("la opcion " + opcionIngresada + " no es valida ");

		}

		System.out.println("Fin de la app");

		teclado.close();

	}

}
