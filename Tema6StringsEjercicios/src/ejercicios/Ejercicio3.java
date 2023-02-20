package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		Scanner dogma = new Scanner(System.in);

		String frase = "";

		int contador = 0;

		System.out.println("Introduzca su frase: ");

		// uso nextLine en lugar de next, porque next para de leer si encuentra espacio
		// en string
		frase = dogma.nextLine();

		for (int i = 0; i < frase.length(); i++) {
			
			if (frase.charAt(i) == ' ') {
				contador++;
			}
		}
		
		System.out.println("La frase tiene " + contador + " espacios en blancos");

		dogma.close();
	}

}
