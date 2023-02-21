package ejercicios;

import java.util.Scanner;

public class Ejecrcicio10 {

	public static void main(String[] args) {

		char conjuntoC1[] = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v' };// guardara valores predefinidos
																						// para codificacion

		char conjuntoC2[] = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };// guardara valores predefinidos
																						// para codificacion

		String mensajeCodificado = "";// guardara cadena introducida por usuario

		String mensajeDescodificado = "";// guardara cadena introducida por usuario modificada con funcion descodifica

		Scanner dogma = new Scanner(System.in);

		System.out.println("Introduzca el mensaje a descodificar: ");

		mensajeCodificado = dogma.nextLine();

		// paso la cadena a minusculas porque no importa si es mayuscula o minuscula
		// para este ejercicio se busca la coincidencia de letra en los arrays
		mensajeCodificado = mensajeCodificado.toLowerCase();

		// recorro las posiciones char de la cadena
		for (int i = 0; i < mensajeCodificado.length(); i++) {

			// llamo a la funcion codifica dandole los arrays del main y el char
			// correspondiente al charAt posicion i y añado el valor devuelto pur la funcion
			// a la cadena mensajeDescodificado, creando asi el mensajeDescodificado
			mensajeDescodificado += Funciones.descodifica(conjuntoC1, conjuntoC2, mensajeCodificado.charAt(i));
		}

		// print del mensaje descodificado
		System.out.println(mensajeDescodificado);

		dogma.close();
	}

}
