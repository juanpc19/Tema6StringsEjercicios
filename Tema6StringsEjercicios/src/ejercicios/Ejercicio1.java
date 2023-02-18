package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		Scanner dogma = new Scanner(System.in);

		String frase1 = "";

		String frase2 = "";

		System.out.println("Introduza una frase. ");

		// uso nextLine en lugar de next, porque next para de leer si encuentra espacio
		// en string
		frase1 = dogma.nextLine();

		System.out.println("Introduza una frase. ");

		// uso nextLine en lugar de next, porque next para de leer si encuentra espacio
		// en string
		frase2 = dogma.nextLine();

		// si la longitud de frase1 igual a la longitud de frase2
		if (frase1.length() == frase2.length()) {
			System.out.println("Las dos frases son igual de largas.");

			// si la longitud de frase1 mayor a la longitud de frase2
		} else if (frase1.length() > frase2.length()) {
			System.out.println("La segunda frase es mas corta.");

			// si la longitud de frase1 menor (el unico caso que queda)
			// a la longitud de frase2
		} else {
			System.out.println("La primera frase es mas corta.");
		}

		dogma.close();
	}

}
