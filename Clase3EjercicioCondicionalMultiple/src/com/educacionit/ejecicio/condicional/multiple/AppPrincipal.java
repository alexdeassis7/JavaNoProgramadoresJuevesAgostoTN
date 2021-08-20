package com.educacionit.ejecicio.condicional.multiple;

import java.util.Scanner;

//Enunciado : Desarrollar un algoritmo que permita ingresar un número entero comprendido entre 1 y 7 , y que 
//muestre por pantalla el dia de la semana al que se corresponde 

public class AppPrincipal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num = 0;

		System.out.println("Ingrese un numero entero comprendido entre 1 y 7");
		num = teclado.nextInt();

		switch (num) {
		case 1:
			System.out.println("el numero " + num + " corresponde al dia Domingo");
			break;
		case 2:
			System.out.println("el numero " + num + " corresponde al dia Lunes");
			break;
		case 3:
			System.out.println("el numero " + num + " corresponde al dia Martes");
			break;
		case 4:
			System.out.println("el numero " + num + " corresponde al dia Miercoles");
			break;
		case 5:
			System.out.println("el numero " + num + " corresponde al dia Jueves");
			break;
		case 6:
			System.out.println("el numero " + num + " corresponde al dia Viernes");
			break;
		case 7:
			System.out.println("el numero " + num + " corresponde al dia Sabado");
			break;

		default:
			System.out.println("Numero ingresado incorrecto");
			break;
		}

		teclado.close();

		System.out.println("Finalizo la app");
	}

}
