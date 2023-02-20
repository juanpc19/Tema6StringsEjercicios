package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		String palabras[] = new String[0];

		String frase = "";

		String palabra = "";

		String espacio = " ";

		int contador = 0;

		Scanner dogma = new Scanner(System.in);

		System.out.println("Introduzca una frase: ");
		frase = dogma.nextLine();

		// creo array string palabras con las cadenas devueltas por el metodo split
		// aplicado ala cadena frase usando espacio como separador
		palabras = frase.split(espacio);

		// recorro array palabras
		for (String auxiliar : palabras) {
			// comoprobando si el valor de la posicion actual es igual a la string palabra
			if (auxiliar == palabra) {
				// de serlo añado +1 a contador
				contador++;
			}
		}

		// mensaje por pantalla mostrando a usuario cuantas veces aparece su palabra
		System.out.println("La palabra aparece" + contador + "veces.");

		dogma.close();
	}

}
