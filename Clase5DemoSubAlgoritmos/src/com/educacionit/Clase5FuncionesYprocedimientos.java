package com.educacionit;

import java.util.Scanner;

public class Clase5FuncionesYprocedimientos {

	// Funcion Principal = desde el main es desde donde invocaremos a nuestros
	// metodos (procedimi)
	public static void main(String[] args) {
		System.out.println("Inicio de la app");
		Scanner teclado = new Scanner(System.in);

		// invocamos al procedimiento mostrarNumeros()
		mostrarNumeros();

		// invocamos al procedimiento mostraNumerosPorRangos()
		int i = 50, j = 1;
		mostraNumerosPorRangos(i, j);

		mostrarCliente("Naila", "Penino");

		mostrarCliente("Ignacio", "Sabia");

		// solicitamos un valor al user
		System.out.println("ingrese por favor un valor ");
		int valorIngresado = teclado.nextInt();

		// invocamos a la funcion calcularIva()
		double ivaCalculado = calcularIva(valorIngresado);
		System.out.println("el IVA es " + ivaCalculado);

		System.out.println("Fin de la app");

	}

	// mi primer procedimiento , muestra numeros del 0 a 9
	// no recibe parametros "()" y no retorna ningun valor
	public static void mostrarNumeros() {
		// cuerpo del metodo
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}

	// procedimiento que muestra numero entre dos rangos
	public static void mostraNumerosPorRangos(int inicio, int tope) {
		if (inicio <= tope) {
			// cuerpo del metodo
			for (int i = inicio; i <= tope; i++) {
				System.out.println(i);
			}
		} else {
			System.out.println("el inicio debe ser mayor o igual al fin");
		}
	}

	// procedimiento 2 que muestra nombre y apellido
	public static void mostrarCliente(String nombre, String apellido) {
		System.out.println("Ingrese al procedimiento ");
		System.out.println("Cliente : " + nombre + " " + apellido);
	}

	// funcion para calcular el IVA de un valor (Retorna un dato tipo double )
	public static double calcularIva(int valor) {

		double porcentage = 0.21;
		double resultado = valor * porcentage;

		return resultado;
	}

}
