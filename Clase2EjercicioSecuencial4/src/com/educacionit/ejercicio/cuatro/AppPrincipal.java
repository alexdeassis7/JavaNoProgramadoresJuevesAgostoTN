package com.educacionit.ejercicio.cuatro;

import java.util.Scanner;

//implementar un algoritmo que permita calcular y mostrar por pantalla la suma y el producto de 
//dos números enteros ingresados por teclado 
public class AppPrincipal {

	public static void main(String[] args) {
		int a = 0, b = 0, suma = 0, producto = 0;
		Scanner teclado = new Scanner(System.in);

		System.out.println("ingrese el primer numero ");
		a = teclado.nextInt();

		System.out.println("ingrese el segundo numero ");
		b = teclado.nextInt();

		suma = a + b;
		producto = a * b;

		System.out.println("La suma de los numeros ingresados es : " + suma);
		System.out.println("El producto de los numeros ingresados es : " + producto);

	}

}
