package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner dogma = new Scanner(System.in);

		String contraseñaJugador1 = "";

		String contraseñaJugador2 = "";

		System.out.println("Introduzca contraseña jugador 1: ");

		contraseñaJugador1 = dogma.next();

		// ejecuto bucle mientras jugador2 no acierte la contraseña de jugador1
		while (!contraseñaJugador1.equals(contraseñaJugador2)) {

			System.out.println("Jugador 2 intente adivinar la contraseña del jugador 1: ");

			contraseñaJugador2 = dogma.next();

			// si la funcion compareTo me devuelve un 0 al comparar las 2 strings
			if (contraseñaJugador2.compareTo(contraseñaJugador1) == 0) {
				System.out.println("Las dos contraseñas son igual de largas alfabeticamente.");
				// si la funcion compareTo me devuelve un negativo al comparar las 2 strings
			} else if (contraseñaJugador2.compareTo(contraseñaJugador1) < 0) {
				System.out.println("La contraseña introducida es menor alfabeticamente que la deseada.");
				// si la funcion compareTo me devuelve un positivo
				// (lo unico que queda como opcion) al comparar las 2 strings
			} else {
				System.out.println("La contraseña introducida es mayor alfabeticamente que la deseada.");
			}
		}

		dogma.close();

	}

}
