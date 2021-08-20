package com.educacionit;

public class AppPrincipal {

	public static void main(String[] args) {

		System.out.println("inicio de la app");
		// sintaxis estructura for / para

		System.out.println("mostramos los numero del 1 al 10");
		for (int i = 1; i < 11; i++) {
			// cuerpo del for

			System.out.println(i);
		}
		
		System.out.println("mostramos los numero del 100 al 115");
		for (int i = 100; i <= 115; i++) { //scope
			// cuerpo del for
		
			System.out.println(i);
		}

		System.out.println("mostramos los numero del 10 al 0");
		for (int i = 10; i >= 0; i--) {
			// cuerpo del for

			System.out.println(i);
		}

		System.out.println("fin de la app");
	}

}
