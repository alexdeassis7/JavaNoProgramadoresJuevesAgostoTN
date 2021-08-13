package com.educacionit.clase2;

import java.util.Scanner;

//3) Implementar un algoritmo que permita calcular y mostrar la superficie 
//de un triángulo teniendo en cuenta que las dimensiones de su altura y base 
//se ingresan por teclado.

public class AppPrincipal {

	public static void main(String[] args) {

		float base = 0, altura = 0, superficie = 0;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese la base del triangulo ");
		base = teclado.nextFloat();

		System.out.println("Ingrese la altura del triangulo ");
		altura = teclado.nextFloat();

		superficie = (base * altura) / 2;

		System.out.println("La superficie del triangulo es : " + superficie);
	}

}
