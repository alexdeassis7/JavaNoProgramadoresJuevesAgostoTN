package com.educacionit;

import java.util.Scanner;

public class AppPrincipal {

	public static void main(String[] args) {
//		1)	Calcular el promedio de 10 valores almacenados en un Vector.
//      Determinar además cuantos son mayores que el promedio, imprimir el promedio,
//      el número de datos mayores que el promedio y una lista de valores mayores que el promedio .

		// definimos las variables de trabajo
		int limite = 10, mayores = 0;
		float promedio = 0, sumatoria = 0;
		int[] valoresArray = new int[limite];
		int[] mayoresQueElPromedio;

		Scanner teclado = new Scanner(System.in);
		// solicitamos al usuario ingrese los valores y los guardamos en cada indice del
		// array
		for (int i = 0; i < limite; i++) {
			System.out.println("Ingrese el numero " + (i + 1));
			valoresArray[i] = teclado.nextInt();
			sumatoria += valoresArray[i]; // acumulamos todos los valores que tiene el array en una variable para poder
											// obtener luego el promedio
		}

		System.out.println("La suma de todos los valores del array es  : " + sumatoria);
		// calculamos el promedio
		promedio = sumatoria / limite;

		// mostramos el array cargado
		for (int i = 0; i < valoresArray.length; i++) {
			System.out.print(valoresArray[i] + " - ");
		}
		System.out.println("El promedio de los valores ingresados es : " + promedio);

		// contamos los valores mayores al promedio
		for (int i = 0; i < limite; i++) {
			if (valoresArray[i] > promedio) {
				mayores++;// sumo uno cada vez que encuentro un valor mayor al promedio dentro del array
							// de valores
			}
		}

		System.out.println(
				"existen " + mayores + " datos mayores promedio ( " + promedio + " ) dentro del array de valores ");

		mayoresQueElPromedio = new int[mayores];
		int j = 0; // variables que controlar el indice de el array "mayoresQueElPromedio"

		// recorremos el array de valores buscando todos los datos mayores al promedio
		// para copiarlos al array "mayoresQueElPromedio"
		for (int i = 0; i < limite; i++) {
			if (valoresArray[i] > promedio) {
				mayoresQueElPromedio[j] = valoresArray[i];
				j++;
			}

		}

		// mostramos lo valores que son mayores al promedio
		for (int i = 0; i < mayores; i++) {

			System.out.print(mayoresQueElPromedio[i] + " - ");

		}

		teclado.close();
	}

}
