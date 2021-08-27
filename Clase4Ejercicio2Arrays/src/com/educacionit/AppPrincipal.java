package com.educacionit;

public class AppPrincipal {

//	2)	Llenar dos vectores A y B de 45 elementos cada uno, sumar el elemento
//   uno del vector A con el elemento uno del vector B y así sucesivamente hasta 45, almacenar el 
//   resultado en un vector C, e imprimir el vector resultante por pantalla.

	public static void main(String[] args) {
		final int CANTIDADELEMENTOS = 45;

		// defino los 3 vectores
		int[] vectorA = new int[CANTIDADELEMENTOS];
		int[] vectorB = new int[CANTIDADELEMENTOS];
		int[] vectorC = new int[CANTIDADELEMENTOS];

		for (int i = 0; i < CANTIDADELEMENTOS; i++) {
			
			vectorA[i] = i;
			vectorB[i] = i;
			vectorC[i] = vectorA[i] + vectorB[i];

			System.out.println(vectorA[i] + " + " + vectorB[i] + " = " + vectorC[i]);
		}
	}

}
