package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {

		// cambiar la de arriba por la de abajo, si no esta dejar igual
		// palabra
		// busco posicion oincidencia en conj1 obtengo esa pos uso esa pos en conj2
		// extraigo valor pos y doy ese valor a return

		char conjuntoC1[] = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v' };// guardara valores predefinidos
																						// para codificacion

		char conjuntoC2[] = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };// guardara valores predefinidos
																						// para codificacion

		String mensaje = "";// guardara cadena introducida por usuario

		String mensajeCodificado = "";// guardara cadena introducida por usuario modificada con funcion codifica

		Scanner dogma = new Scanner(System.in);

		System.out.println("Introduzca el mensaje a codificar: ");

		mensaje = dogma.nextLine();

		// paso la cadena a minusculas porque no importa si es mayuscula o minuscula
		// para este ejercicio se busca la coincidencia de letra en los arrays
		mensaje = mensaje.toLowerCase();

		// recorro las posiciones char de la cadena
		for (int i = 0; i < mensaje.length(); i++) {

			// llamo a la funcion codifica dandole los arrays del main y el char
			// correspondiente al charAt posicion i y añado el valor devuelto pur la funcion
			// a la cadena mensajeCodificado, creando asi el mensajeCodificado
			mensajeCodificado += Funciones.codifica(conjuntoC1, conjuntoC2, mensaje.charAt(i));

		}

		// print del mensaje codificado
		System.out.println(mensajeCodificado);

		dogma.close();
	}

}
