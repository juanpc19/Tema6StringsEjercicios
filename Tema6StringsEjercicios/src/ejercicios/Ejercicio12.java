package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {

		String palabra1 = "";// guardara primera cadena introducida por usuario

		String palabra2 = "";// guardara segunda cadena introducida por usuario

		char letrasPalabra1[] = new char[0];// array que guardara la palabra1 descompuesta en chars, lo inicializo a 0 y
											// el metodo toCharArray() le dara longitud necesaria

		char letrasPalabra2[] = new char[0];// array que guardara la palabra2 descompuesta en chars, lo inicializo a 0 y
											// el metodo toCharArray() le dara longitud necesaria

		Scanner dogma = new Scanner(System.in);

		System.out.println("Introduzca una palabra: ");

		palabra1 = dogma.nextLine();

		// paso la cadena palabra1 a minusculas
		palabra1 = palabra1.toLowerCase();

		// convierto la cadena palabra1 en un array tipo char
		letrasPalabra1 = palabra1.toCharArray();

		// ordeno el array
		Arrays.sort(letrasPalabra1);

		System.out.println("Introduzca otra palabra: ");

		palabra2 = dogma.nextLine();

		// paso la cadena palabra2 a minusculas
		palabra2 = palabra2.toLowerCase();

		// convierto la cadena palabra2 en un array tipo char
		letrasPalabra2 = palabra2.toCharArray();

		// ordeno el array
		Arrays.sort(letrasPalabra2);

		// prints para ver funcionamiento del sort
		// System.out.println(Arrays.toString(letrasPalabra1));
		// System.out.println(Arrays.toString(letrasPalabra2));

		// si ambos arrays son iguales
		if (Arrays.equals(letrasPalabra1, letrasPalabra2)) {
			// comunico que las palabras son anagramas mediante mensaje por consola
			System.out.println("Las palabras son anagramas.");
		}

		// si no son iguales
		else {
			// comunico que las palabras no son anagramas mediante mensaje por consola
			System.out.println("Las palabras no son anagramas.");
		}

		dogma.close();
	}

}
