package ejercicios;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {

		String frase = "";// guardara la frase introducida por el usuario, lo inicializo a vacio para uso
							// en bucle

		String abecedario = "abcdefghijklmnñopqrstuvwxyz";// guardara las letras del abecedario, lo inicializo a con
															// letras del abecedario para uso en bucle

		char caracter = '*';// guardara un caracter concreto del abecedario, lo inicializo a * para uso en
							// bucle

		int contador = 0;// guardara la cantidad de veces que aparece un caracter en la frase, lo
							// inicializo a 0 para uso en bucle

		Scanner dogma = new Scanner(System.in);

		System.out.println("Introduzca una frase: ");

		// recojo la frase del usuario con escaner
		frase = dogma.nextLine();

		// paso la frase a minusculas para comparar mas facilmente
		frase = frase.toLowerCase();

		// recorro las posiciones de la cadena abecedario
		for (int i = 0; i < abecedario.length(); i++) {
			// y le voy dando a caracter el valor de la posicion actual
			caracter = abecedario.charAt(i);
			// compruebo que el valor del caracter actual se encuentra en la cadena frase
			if (frase.indexOf(caracter) >= 0) {
				// de ser asi busco el caracter en la frase recorriendo la cadena comparandola
				// con el caracter
				for (int j = 0; j < frase.length(); j++) {
					// si el caracter se encuentra en la frase
					if (caracter == frase.charAt(j)) {
						// sumo+1 al contador
						contador++;
					}
				}
				// al final de bucle interno hago print mostrando cuantas veces aparece el
				// caracter en la frase
				System.out.println("La letra " + caracter + " aparece " + contador + " veces.");
			}
			// al final de bucle interno reinicio el contador a 0
			contador = 0;
		}

		dogma.close();
	}
}
