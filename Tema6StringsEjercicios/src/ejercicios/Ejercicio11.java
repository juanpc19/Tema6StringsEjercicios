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

		palabras = frase.split(espacio);

		for (String auxiliar : palabras) {

			if (auxiliar.length() > palabraMasLarga.length()) {
				palabraMasLarga = auxiliar;
			}
		}

		System.out.println("La palabra mas larga es : " + palabraMasLarga + " y tinene una longitud de "
				+ palabraMasLarga.length());

		dogma.close();
	}

}
