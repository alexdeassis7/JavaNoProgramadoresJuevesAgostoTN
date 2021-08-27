package com.educacionit;

//Enunciado :
//6)	Almacenar 15 números en un vector, almacenarlos en otro vector 
//en orden inverso al vector original e imprimir el vector resultante
public class AppPrincipal {

	public static void main(String[] args) {

		int[] vectorA = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
		int[] vectorResultante = new int[15];

		int j = 14;

		for (int i = 0; i < vectorResultante.length; i++) {

			vectorResultante[j] = vectorA[i];
			j--;
		}

		System.out.println("Vector A :");
		for (int i = 0; i < vectorA.length; i++) {

			System.out.print(vectorA[i] + " - ");
		}
		System.out.println();
		System.out.println("vectorResultante:");

		for (int i = 0; i < vectorResultante.length; i++) {

			System.out.print(vectorResultante[i] + " - ");
		}

	}

}
