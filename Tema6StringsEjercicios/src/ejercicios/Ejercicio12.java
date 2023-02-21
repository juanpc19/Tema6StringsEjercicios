package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {

		String palabra1 = "";// guardara cadena introducida por usuario

		String palabra2 = "";// guardara cadena introducida por usuario

		char letrasPalabra1[] = new char[0];

		char letrasPalabra2[] = new char[0];

		Scanner dogma = new Scanner(System.in);

		System.out.println("Introduzca una palabra: ");

		palabra1 = dogma.nextLine();

		palabra1 = palabra1.toLowerCase();

		letrasPalabra1 = palabra1.toCharArray();

		Arrays.sort(letrasPalabra1);

		System.out.println("Introduzca otra palabra: ");

		palabra2 = dogma.nextLine();

		palabra2 = palabra2.toLowerCase();

		letrasPalabra2 = palabra2.toCharArray();

		Arrays.sort(letrasPalabra2);

		// print para ver funcionamiento del sort

		// System.out.println(Arrays.toString(letrasPalabra1));

		// System.out.println(Arrays.toString(letrasPalabra2));

		if (Arrays.equals(letrasPalabra1, letrasPalabra2) == true) {
			System.out.println("Las palabras son anagramas.");
		}

		else {
			System.out.println("Las palabras no son anagramas.");
		}

		dogma.close();
	}

}
