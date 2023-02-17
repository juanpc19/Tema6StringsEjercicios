package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner dogma = new Scanner(System.in);

		String contraseñaJugador1 = "";

		String contraseñaJugador2 = "";

		System.out.println("Contraseña jugador 1. ");

		contraseñaJugador1 = dogma.next();

		while (!contraseñaJugador1.equals(contraseñaJugador2)) {
			System.out.println("Jugador 2 intente adivinar la contraseña del jugador 1. ");

			contraseñaJugador2 = dogma.next();
			System.out.println(contraseñaJugador2.compareTo(contraseñaJugador1));
		}

		if (contraseñaJugador2.compareTo(contraseñaJugador1) == 0) {
			System.out.println("Las dos contraseñas son igual de largas alfabeticamente.");

		} else if (contraseñaJugador2.compareTo(contraseñaJugador1) < 0) {
			System.out.println("La contraseña introducida es menor alfabeticamente que la deseada");

		} else {
			System.out.println("La contraseña introducida es mayor alfabeticamente que la deseada");
		}

	}

}
