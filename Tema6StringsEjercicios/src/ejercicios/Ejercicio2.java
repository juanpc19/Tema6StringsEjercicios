package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner dogma = new Scanner(System.in);

		String contraseñaJugador1 = "";

		String contraseñaJugador2 = "";

		System.out.println("Introduzca contraseña jugador 1: ");

		// uso nextLine en lugar de next, porque next para de leer si encuentra espacio
		// en string
		contraseñaJugador1 = dogma.nextLine();

		// ejecuto bucle mientras jugador2 no acierte la contraseña de jugador1
		while (!contraseñaJugador1.equals(contraseñaJugador2)) {

			System.out.println("Jugador 2 intente adivinar la contraseña del jugador 1: ");

			// uso nextLine en lugar de next, porque next para de leer si encuentra espacio
			// en string
			contraseñaJugador2 = dogma.nextLine();

			// no hace falta comprobar que sean iguales alfabeticamente (devolveria = 0),
			// porque en ese caso saldria de bucle por condicion equals

			// si la funcion compareTo me devuelve un negativo al comparar las 2 strings
			if (contraseñaJugador2.compareTo(contraseñaJugador1) < 0) {
				System.out.println("La contraseña introducida por jugador 2 es menor alfabeticamente que la deseada.");
				// si la funcion compareTo me devuelve un positivo
				// (lo unico que queda como opcion) al comparar las 2 strings
			} else {
				System.out.println("La contraseña introducida por jugador 2 es mayor alfabeticamente que la deseada.");
			}
		}

		dogma.close();

	}

}
