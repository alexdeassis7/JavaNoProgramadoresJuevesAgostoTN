package com.educacionit.mientras;

public class AppPrincipal {

	// mostrar los numeros del 0 al 10
	public static void main(String[] args) {
		int contador = 0;// variable de control de nuestro while

		System.out.println("Inicio el while");

		// Estructura repetitiva Mientras (while)
		while (contador <= 10) { // LOOP INFINITO : cuando la condicion nunca se modifica
			// cuerpo del while
			// aqui van las sentencias a ejecutar si la condicio es TRUE
			System.out.println("contador: " + contador);
			contador++; // incremento la variable de control
//			contador = contador + 1;
//			contador += 1;
		}

		System.out.println("Finalizo el while");

	}

}
