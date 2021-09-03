package com.educacionit;

import java.util.Scanner;
// 					PROBLEMA PRINCIPAL

//Calcular el promedio de tres notas de un alumno y la condicion final 
//osea si aprobo o reprobo la materia "Estrcuturas de Datos 2" 
//aprueba con promedio mayor o igual a 7 , caso contrario reprueba

//Lo descomponemos en Sub Problemas menos "complejos"
//subProblema 1 : entrada de datos (nota1 , nota2 , nota3)
//subProblema 2 : Calcular el promedio del alumnos
//subProblema 3 : Calcular la Condición del alumno
//subProblema 4 : mostrar resultados por pantalla 
public class AppPrincipal {

	// Variables Globales: es una variable que puede ser utilizada dentro de todos
	// los metodos (funciones o procedimientos) de nuestro archivo
	static float nota1 = 0, nota2 = 0, nota3 = 0, promedio = 0;
	static Scanner teclado = new Scanner(System.in);
	static String condicionAlumno = "";

	// Algoritmo Principal
	public static void main(String[] args) {
		System.out.println("Inicio del Applicativo");
		// invocamos a los subalgoritmos
		solicitarDatos();
		calcularPromedio();
		validarCondicion();
		mostrarResultados();

		System.out.println("Fin del Applicativo");
	}

	// Resolvemos el sub problema 1 : entrada de datos (nota1 , nota2 , nota3)
	public static void solicitarDatos() {
		System.out.println("Ingrese la nota 1");
		nota1 = teclado.nextFloat();
		System.out.println("Ingrese la nota 2");
		nota2 = teclado.nextFloat();
		System.out.println("Ingrese la nota 3");
		nota3 = teclado.nextFloat();
	}

	// Resolvemos el SubProblema 2 : Calcular el promedio del alumnos
	public static void calcularPromedio() {
		promedio = (nota1 + nota2 + nota3) / 3;
	}

	// Resolvemos el Sub Problema 3 : Calcular la Condición del alumno
	public static void validarCondicion() {
		if (promedio >= 7) {
			condicionAlumno = "Aprobado";
		} else {
			condicionAlumno = "Desaprobado";
		}
	}

	// Resolvemos el sub Problema 4 :mostrar resultados por pantalla
	public static void mostrarResultados() {
		System.out.println("Las notas del Alumnos son : " + nota1 + " - " + nota2 + " - " + nota3);
		System.out.println("El Promedio del Alumno es : " + promedio);
		System.out.println("La condicion del alumno es : " + condicionAlumno);
	}

}
