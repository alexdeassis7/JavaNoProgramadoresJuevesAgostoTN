package com.educacionit.ejercicio.uno;

import java.util.Scanner;

//1) Calcular el promedio de un alumno que tiene 7 calificaciones en la materia 
//diseño estructura de algoritmos
public class AppPrincipal {

	public static void main(String[] args) {

		// defino mis variables y contantes de trabajo
		Scanner teclado = new Scanner(System.in);
		float calificacion = 0, promedio = 0, sumaNotas = 0;
		int contador = 1;
		final int CANTCALIFICACIONES = 7;

		// solicitamos las 7 calificaciones con una estructura repetitiva while
		while (contador <= CANTCALIFICACIONES) {
			System.out.println("Ingrese la calificacion " + contador);
			calificacion = teclado.nextFloat();
			sumaNotas += calificacion;
			contador++;
		}

		// calculamos el promedio de las notas
		promedio = sumaNotas / CANTCALIFICACIONES;
		System.out.println("El promedio de las " + CANTCALIFICACIONES + " calificaciones es " + promedio);

		System.out.println("Fin de la app");
	}

}
