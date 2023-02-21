package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2Avanzado {

	public static void main(String[] args) {

		Scanner dogma = new Scanner(System.in);

		String contraseñaJugador1 = "";

		String contraseñaJugador2 = "";

		System.out.println("Introduzca contraseña jugador 1: ");

		// uso nextLine en lugar de next, porque next para de leer si encuentra espacio
		// en string
		contraseñaJugador1 = dogma.nextLine();

		char pistaJugador[] = new char[contraseñaJugador1.length()];//guardara los char extraidos de la string contraseñaJugador2 
		//y lo inicializo con longitud igual a contraseñaJugador1

		// ejecuto bucle mientras jugador2 no acierte la contraseña de jugador1
		while (!contraseñaJugador1.equals(contraseñaJugador2)) {

			System.out.println("Jugador 2 intente adivinar la contraseña del jugador 1: ");

			// uso nextLine en lugar de next, porque next para de leer si encuentra espacio
			// en string
			contraseñaJugador2 = dogma.nextLine();

			// si la contraseña a adivinar es mas larga
			if (contraseñaJugador1.length() > contraseñaJugador2.length()) {
				System.out.println("La contraseña de jugador 1 es "
						+ (contraseñaJugador1.length() - contraseñaJugador2.length()) + " caracteres mas larga.");

				// si la contraseña a adivinar es mas corta
			} else if (contraseñaJugador2.length() > contraseñaJugador1.length()) {
				System.out.println("La contraseña de jugador 1 es "
						+ (contraseñaJugador2.length() - contraseñaJugador1.length()) + " caracteres mas corta.");

				// solo quedaria que sean iguales
			} else {

				// por lo que no da error en el charAt
				for (int i = 0; i < contraseñaJugador1.length(); i++) {

					// si los char dentro de las string contraseña en posicion i son iguales
					if (contraseñaJugador1.charAt(i) == contraseñaJugador2.charAt(i)) {

						// los añado al array pistaJugador en posicion i
						pistaJugador[i] = contraseñaJugador2.charAt(i);

						// de lo contrario añado al array pistaJugador asterisco en posicion i
					} else {
						pistaJugador[i] = '*';
					}

				}
				
				System.out.println("Estas son las letras que ha acertado: " + Arrays.toString(pistaJugador));
			}

		}

		System.out.println("Enhorabuena ha adivinado la contraseña!");

		dogma.close();

	}

}
