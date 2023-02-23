package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {

		// usar ej 7 y ej 12, puedo meterlos en funciones

		String cadenaJugador1 = "";// guardara primera cadena introducida por usuario

		String cadenaJugador2 = "";// guardara segunda cadena introducida por usuario

		String cadenaDesordenada = "";

		char letrasCadena1[] = new char[0];// array que guardara la palabra1 descompuesta en chars, lo inicializo a 0 y
											// el metodo toCharArray() le dara longitud necesaria

		char letrasCadena2[] = new char[0];// array que guardara la palabra2 descompuesta en chars, lo inicializo a 0 y
											// el metodo toCharArray() le dara longitud necesaria

		char letrasCadenaDesordenada[] = new char[0];

		Scanner dogma = new Scanner(System.in);

		while (cadenaJugador1.isEmpty() == true) {
			System.out.println("Introduzca una palabra o frase: ");
			cadenaJugador1 = dogma.nextLine();
		}

		// paso la cadena palabra1 a minusculas
		cadenaJugador1 = cadenaJugador1.toLowerCase();

		// convierto la cadena palabra1 en un array tipo char
		letrasCadena1 = cadenaJugador1.toCharArray();

		letrasCadenaDesordenada = Funciones.desordenaCadena(letrasCadena1);

		while (!cadenaJugador1.equals(cadenaJugador2)) {

			System.out.println("Intente adivinar la cadena del jugador 1 a partir de la siguiente pista: ");

			cadenaDesordenada = String.valueOf(letrasCadenaDesordenada);

			System.out.println(cadenaDesordenada);

			cadenaJugador2 = dogma.nextLine();

		}
		System.out.println("Enhorabuena ha acertado la palabra!");
		
		dogma.close();
	}

}
