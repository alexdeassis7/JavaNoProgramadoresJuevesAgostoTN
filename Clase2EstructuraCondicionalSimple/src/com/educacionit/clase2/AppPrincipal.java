package com.educacionit.clase2;

import java.util.Scanner;

//Determinar si un alumno aprueba o reprueba un curso , sabiendo que aprobara si su promedio de 
//tres calificaciones es mayor o igual a 7 , reprueba caso contrario .
public class AppPrincipal {

	public static void main(String[] args) {

		float nota1 = 0, nota2 = 0, nota3 = 0, promedio = 0;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese la calificacion 1");
		nota1 = teclado.nextFloat();

		System.out.println("Ingrese la calificacion 2");
		nota2 = teclado.nextFloat();

		System.out.println("Ingrese la calificacion 3");
		nota3 = teclado.nextFloat();

		promedio = (nota1 + nota2 + nota3) / 3;

		// estrucutra condicional simple (solo el if ) , condicional doble (if - else)
		if (promedio >= 7) {
			// sentencias a ejecutar si la condicion se cumple
			System.out.println("Alumno Aprobado");
		} else {
			// sentencias a ejecutar si la condicion NOOO se cumple
			System.out.println("Alumno Reprobado");
		}

		System.out.println("Fin de la App");

	}

}
