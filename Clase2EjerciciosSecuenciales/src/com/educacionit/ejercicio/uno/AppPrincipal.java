package com.educacionit.ejercicio.uno;

import java.util.Scanner;
//Suponga que un individuo desea inverti su capital es un banco y desea saber cuanto dinero ganara 
//después de un mes si el banco paga a razon de 2% mensual.

public class AppPrincipal {

	public static void main(String[] args) {
		
		float capital = 0, ganancia = 0;
		Scanner teclado = new Scanner(System.in);
		final float PORCENTAJE = 0.02f;

//		que entra ? 
		System.out.println("Ingrese por favor el capital que desea invertir este mes");
		capital = teclado.nextFloat();

//		que se procesa ?
		ganancia = capital * PORCENTAJE;

//		que sale?
		System.out.println("La ganancia obtenida en los proximos 30 dias por su inversion de " + capital
				+ " pesos sera de " + ganancia + " pesos ");

	}
}
