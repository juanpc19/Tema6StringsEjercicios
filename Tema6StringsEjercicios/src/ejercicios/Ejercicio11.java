package ejercicios;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {

		String palabras[] = new String[0];// creo array de longitud 0 donde guardare palabras de la
		// fraseConEspacios(metodo split añadira longitud necesaria)

		String frase = "";// guardara cadena introducida por usuario

		String espacio = " ";// guardara cadena introducida por usuario

		String palabraMasLarga = "";// guardara subcaneda mas larga encontrada en cadena frase

		Scanner dogma = new Scanner(System.in);

		System.out.println("Introduzca un frase: ");

		frase = dogma.nextLine();

		// divido la frase en palabras que guardare en posiciones del array palabras,
		// separo estas palabras con el metodo split que separara donde encuentre un
		// valor igual a a espacio
		palabras = frase.split(espacio);

		// recorro el array que contiene las palabras
		for (String auxiliar : palabras) {

			// si la longitud de la palabra actual (auxiliar) es mayor a la longitud de la
			// palabraMasLarga
			if (auxiliar.length() > palabraMasLarga.length()) {
				// palabraMasLarga toma el valor de esta (auxiliar)
				palabraMasLarga = auxiliar;
			}
		}

		// print de la palabra mas larga y su longitud
		System.out.println("La palabra mas larga es : " + palabraMasLarga + " y tinene una longitud de "
				+ palabraMasLarga.length());

		dogma.close();
	}

}
