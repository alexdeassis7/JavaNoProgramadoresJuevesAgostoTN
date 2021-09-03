package com.educacionit;

import java.util.Scanner;

public class Calculadora {

	// defino variables globales (atributos)
	static Scanner teclado = new Scanner(System.in);
	static int opcionIngresada = 0;
	static float numero1 = 0, numero2 = 0;

	public static void main(String[] args) {
		System.out.println("Inicio de la calculadora");
		mostrarMenuDeOpciones();
		switch (opcionIngresada) {
		case 1:
			System.out.println("usted Selecciono la opcion sumar ");
			solicitarNumerosAlUsuario();
			System.out.println("el resultado de la suma es " + sumar());
			break;
		case 2:
			System.out.println("usted Selecciono la opcion dividir ");
			solicitarNumerosAlUsuario();
			float resultado = dividir();

			if (resultado != 0) {
				System.out.println("el resultado de la division es " + resultado);
			}
			break;
			
		default:
			System.out.println("La opcion " + opcionIngresada + " No es valida!");

		}

		System.out.println("Fin de la calculadora");
	}

	public static float sumar() {
		float resultado = numero1 + numero2;
		return resultado;
	}

	public static float dividir() {
		float resultado = 0;
		if (numero2 != 0) {
			resultado = numero1 / numero2;
		} else {
			System.out.println("No podes dividir por cero ");
		}
		return resultado;
	}

	public static void solicitarNumerosAlUsuario() {
		System.out.println("Ingrese el numero uno");
		numero1 = teclado.nextFloat();
		System.out.println("Ingrese el numero uno");
		numero2 = teclado.nextFloat();
	}

	public static void mostrarMenuDeOpciones() {
		System.out.println("Ingrese la operacion a realizar");
		System.out.println("1-SUMAR");
		System.out.println("2-DIVIDIR");
		opcionIngresada = teclado.nextInt();
	}
}
