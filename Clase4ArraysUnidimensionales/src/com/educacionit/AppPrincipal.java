package com.educacionit;

public class AppPrincipal {

	public static void main(String[] args) {
//Programa que inicializa un vector de números enteros  y los muestra en pantalla junto con su posición
		int[] listaNumeros = { 234, 54, 67, 69};
		
		System.out.println("cantidad de elementos de mi arrays = " + listaNumeros.length);

		for (int indice = 0; indice < listaNumeros.length ; indice++) {

			System.out.println("listaNumeros[" + indice + "] = " + listaNumeros[indice]);

		}

	}
}
