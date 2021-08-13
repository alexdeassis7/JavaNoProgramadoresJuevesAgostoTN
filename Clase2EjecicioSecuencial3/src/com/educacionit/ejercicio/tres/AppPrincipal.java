package com.educacionit.ejercicio.tres;

import java.util.Scanner;

//Un Maestro desea saber que porcentaje de hombres y que porcentaje de mujeres hay es un grupo de estudiantes
public class AppPrincipal {

	public static void main(String[] args) {
		// Defino mis variables de trabajo
		float numHombres = 0, numMujeres = 0, totalAlumnos = 0, porcentajeHombres = 0, porcentajeMujeres = 0;
		Scanner teclado = new Scanner(System.in);

//		que entra ? 
		System.out.println("ingrese la cantidad de alumnas");
		numMujeres = teclado.nextFloat();
		System.out.println("ingrese la cantidad de alumnos");
		numHombres = teclado.nextFloat();
//		que se procesa ?
		totalAlumnos = numHombres + numMujeres;
		porcentajeHombres = numHombres * 100 / totalAlumnos;
		porcentajeMujeres = numMujeres * 100 / totalAlumnos;
//		que sale?
		System.out.println("El porcentaje de alumnos de su curso es : " + porcentajeHombres);
		System.out.println("El porcentaje de alumnas de su curso es : " + porcentajeMujeres);

	}

}
