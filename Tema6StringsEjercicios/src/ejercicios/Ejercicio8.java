package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

		String frase = "";// guardara mensaje con muletillas, lo inicializo vacio

		String mensaje = "";// guardara mensaje sin muletillas, lo inicializo vacio

		Scanner dogma = new Scanner(System.in);

		System.out.println("Introduzca una frase: ");
		frase = dogma.nextLine();

		// siguiente linea es mensaje de prueba (espacios=2 tabs)
		// Javalin, javalonsosjavalen, len, len
		// Javalin, javalon sos javalen, len, len

		// si la cadena empieza por "Javalin, javalon" y acaba en "javalen, len, len"
		if ((frase.startsWith("Javalin, javalon		") == true && frase.endsWith("		javalen, len, len") == true)) {
			// elimino las muletillas y me quedo con el mensaje
			mensaje = frase.substring("Javalin, javalon		".length(),
					frase.length() - ("		javalen, len, len".length()));
			// hago print de mensaje
			System.out.println(mensaje);

			// si la cadena empieza por "Javalin, javalon"
		} else if (frase.startsWith("Javalin, javalon		") == true) {
			// elimino la muletilla y me quedo con el mensaje
			mensaje = frase.substring("Javalin, javalon		".length());
			// hago print de mensaje
			System.out.println(mensaje);

			// si la cadena termina en "javalen, len, len"
		} else if (frase.endsWith("		javalen, len, len") == true) {
			// elimino la muletilla y me quedo con el mensaje
			mensaje = frase.substring(0, frase.length() - ("		javalen, len, len".length()));
			// hago print de mensaje
			System.out.println(mensaje);

		}

		dogma.close();
	}

}
