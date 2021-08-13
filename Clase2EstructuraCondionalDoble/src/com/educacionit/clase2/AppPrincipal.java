package com.educacionit.clase2;

import java.util.Scanner;

//3) Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:
//Si trabaja 40 horas o menos se le paga $16 por cada hora.
//Si trabaja más de 40 horas  se le paga $16 por cada una de las primeras 40 horas y $20 por cada hora extra.
public class AppPrincipal {

	public static void main(String[] args) {

		int horasTrabajadas = 0, horasExtras = 0, salarioSemanal = 0;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese por favor las horas que trabajo esta semana");
		horasTrabajadas = teclado.nextInt();

		if (horasTrabajadas > 40) {
			// calculo el salario con hs extras
			horasExtras = horasTrabajadas - 40;
			salarioSemanal = horasExtras * 20 + 40 * 16;
		} else {
			// calculamos el salario sin hs extras
			salarioSemanal = horasTrabajadas * 16;
		}

		System.out.println("Su salario semanal sera de : " + salarioSemanal + " pesos ");

		teclado.close();
	}

}
