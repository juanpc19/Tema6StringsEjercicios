package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		Scanner dogma = new Scanner(System.in);

		String frase1 = "";

		int longitud1;

		String frase2 = "";

		int longitud2;

		System.out.println("Introduza una frase. ");

		frase1 = dogma.next();

		System.out.println("Introduza una frase. ");

		frase2 = dogma.next();

		if (frase1.length() == frase2.length()) {
			System.out.println("Las dos frases son igual de largas.");

		} else if (frase1.length() > frase2.length()) {
			System.out.println("La segunda frase es mas corta.");

		} else {
			System.out.println("La primera frase es mas corta.");
		}

		dogma.close();
	}

}
