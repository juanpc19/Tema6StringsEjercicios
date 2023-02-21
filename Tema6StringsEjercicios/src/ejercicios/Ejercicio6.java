package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		String palabras[] = new String[0];// creo array de longitud 0 que guardara las palabras que contiene la frase
											// (metodo split añadira longitud necesaria)

		String frase = "";// guardara frase introducida por el usuario

		String palabra = "";// guardara palabra introducida por el usuario

		String espacio = " ";// guardar un espacio en blanco para usar como separador de palabras

		int contador = 0;// guardara la cantidad de veces que se repite la palabra en la frase

		Scanner dogma = new Scanner(System.in);

		System.out.println("Introduzca una frase: ");
		frase = dogma.nextLine();

		System.out.println("Introduzca una palabra: ");
		palabra = dogma.nextLine();

		// creo array string palabras con las cadenas devueltas por el metodo split
		// aplicado a la cadena frase usando espacio como separador
		palabras = frase.split(espacio);

		// recorro array palabras
		for (String auxiliar : palabras) {
			// comoprobando si el valor de la posicion actual es igual a la string palabra
			if (auxiliar.equalsIgnoreCase(palabra)) {
				// de serlo añado +1 a contador
				contador++;
			}
		}

		// mensaje por pantalla mostrando a usuario cuantas veces aparece su palabra en
		// la frase
		System.out.println("La palabra aparece " + contador + " veces.");

		dogma.close();
	}

}
