package ar.com.educacionit;

public class AppPrincipal {

	// comentario de linea
	/*
	 * Comentario de Bloque
	 */
	public static void main(String[] args) {
		
		System.out.println("Hola Mundo ");
		System.out.println("Edu It ");

		// Variables: Es un espacio en memoria (RAM) que puede albergar un determinado
		// dato , este
		// dato podra ir mutando a lo largo de la ejecucion de nuestra app.

		// Variables numericas :

		// enteros
		int cantidadAlumnosJavaNoProgramadores;
		long serial_number = 151541205;
		short cantidadDeNeumaticos;
		byte edad = 26;

		cantidadAlumnosJavaNoProgramadores = 0;
		cantidadDeNeumaticos = 0;

		cantidadDeNeumaticos = 4;

		// mostramos por consola el valor de las variables
		System.out.println("Cantidad de Alumnos : " + cantidadAlumnosJavaNoProgramadores);
		System.out.println("serial number : " + serial_number);
		System.out.println("cantidad De Neumaticos : " + cantidadDeNeumaticos);
		System.out.println("Cantidad de Alumnos : " + edad);

		// numero con coma

		float gramos = 1250.5f;
		double cantidadDeLitros = 78.6d;
		System.out.println("gramos : " + gramos);
		System.out.println("cantidad De Litros: " + cantidadDeLitros);

		// carácter
		char sexo = 'F';
		char opcionIngresada = '1';
		System.out.println("sexo : " + sexo);
		System.out.println("opcion Ingresada: " + opcionIngresada);

		// boolean.
		boolean esCasado = false;
		boolean tieneHijos = true;

		System.out.println("tieneHijos : " + tieneHijos);
		System.out.println("es Casado: " + esCasado);

		// Cadenas de caracteres
		String direccion = "av siempre viva 4070";
		System.out.println("Direccion : " + direccion);

		// Valores Inmutables : CONSTANTES
//		 final tipo NOMBRE = valor
		final int DIAS_DE_LA_SEMANA = 7;
		final int DIAS_LABORALES = 5;

		System.out.println("el numero de dias de la semana es :" + DIAS_DE_LA_SEMANA);
		System.out.println("el numero de dias laborales es :" + DIAS_LABORALES);

	}
}
