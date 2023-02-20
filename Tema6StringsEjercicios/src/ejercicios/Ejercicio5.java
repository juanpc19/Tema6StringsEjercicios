package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		String texto[] = new String[0];

		String palabra = "";

		Scanner dogma = new Scanner(System.in);

		// uso equalsIgnoreCase para comparar cadenas sin tener minusculas o mayusculas
		// en cuenta
		// bucle while que se ejecutara mientras la cadena introducida es distinta a fin
		while (!palabra.equalsIgnoreCase("fin")) {
			System.out.println("Introduzca una palabra: ");
			palabra = dogma.nextLine();

			// uso equalsIgnoreCase para comparar cadenas sin tener minusculas o mayusculas
			// en cuenta
			// si la cadena introducida es distinta a fin
			if (!palabra.equalsIgnoreCase("fin")) {
				// añado espacio al final de la palabra introducida
				palabra += " ";
				// extiendo longitud de array texto en +1
				texto = Arrays.copyOf(texto, texto.length + 1);
				// añado palabra al array texto
				texto[texto.length - 1] = palabra;
			}
		}

		// recorro el array texto haciendo print en misma linea de las strings que
		// contiene
		for (String auxiliar : texto) {
			System.out.print(auxiliar);
		}

		dogma.close();
	}

}
