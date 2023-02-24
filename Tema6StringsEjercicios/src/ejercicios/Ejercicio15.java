package ejercicios;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {

		String cadenaJugador1 = "";// guardara primera cadena introducida por usuario

		String cadenaJugador2 = "";// guardara segunda cadena introducida por usuario

		String cadenaDesordenada = "";// guardara cadenaJugador1 con caracteres desordenados

		char letrasCadena1[] = new char[0];// array que guardara la cadenaJugador1 descompuesta en chars, lo inicializo
											// a 0 y el metodo toCharArray() le dara longitud necesaria

		char letrasCadenaDesordenada[] = new char[0];// array que guardara el return de la funcion desordenaCadena, lo
														// inicializo a 0 y la funcion desordenaCadena le dara longitud
														// necesaria al machacarla

		int posicion = 0;// guardara la posicion a la que hacer char en cadenas, inicializo a 0 para uso
							// en bucle

		int contador = 0;// guardara la cantidad de coincidencias entre cadenaJugador1 y cadenaJugador2,
							// inicializo a 0 para uso en bucle

		// creo escaner y lo nombro dogma
		Scanner dogma = new Scanner(System.in);

		// bucle que se ejecutara mientras la cadenaJugador1 se encuentre vacia o
		// contenga solo un espacio solicitando al usuario una frase o palabra
		while (cadenaJugador1.isEmpty() == true || cadenaJugador1.equals(" ")) {
			// print por pantalla solicitando cadena
			System.out.println("Introduzca una palabra o frase: ");
			// asigno valor a cadenaJugador1 con escaner
			cadenaJugador1 = dogma.nextLine();
		}

		// paso la cadena cadenaJugador1 a minusculas
		cadenaJugador1 = cadenaJugador1.toLowerCase();

		// convierto la cadena cadenaJugador1 en un array tipo char
		letrasCadena1 = cadenaJugador1.toCharArray();

		// machaco array letrasCadenaDesordenada igualandola a return de funcion
		// desordenaCadena aplicada a array letrasCadena1
		letrasCadenaDesordenada = Funciones.desordenaCadena(letrasCadena1);

		// doy a cadenaDesordenada valor igual a array char letrasCadenaDesordenada
		cadenaDesordenada = String.valueOf(letrasCadenaDesordenada);

		// bucle que se ejecutara mientras cadenaJugador2 no sea igual a cadenaJugador1
		// solicitando al jugador2 que intente adivinar la frase/palabra a partir de la
		// pista dada
		while (!cadenaJugador1.equals(cadenaJugador2)) {

			// print por pantalla mostrando cadenaDesordenada como pista a jugador2
			System.out.println("Intente adivinar la cadena del jugador 1 a partir de la siguiente pista: ");
			System.out.println(cadenaDesordenada);

			// recojo por escaner valor para cadenaJugador2
			cadenaJugador2 = dogma.nextLine();

			// compruebo que las cadenas no son iguales para evitar un bucle con
			// instrucciones que serian innecesarios si el jugador 2 ha acertado la palabra
			// del jugador 1
			if (!cadenaJugador1.equals(cadenaJugador2)) {

				// bucle que se ejecutara mientras posicion se menor a la longitud de la cadena
				// del jugador 1
				while (posicion < cadenaJugador1.length()) {

					// si la letra de la cadenaJugador2 contiene un caracter en la posicion indicada
					// igual al caracter en la misma posicion en la cadena cadenaJugador1
					if (cadenaJugador2.charAt(posicion) == cadenaJugador1.charAt(posicion)) {
						// lo cuento como acierto y añado +1 a contador
						contador++;
					}
					// añado +1 a posicion para comprobar el siguiente caracter de la cadena
					posicion++;
				}
				// muestro por mensaje por pantalla la cantidad de caracteres acertados al
				// jugador 2
				System.out.println("Ha acertado " + contador + " letras.");
			}
		}

		// si salgo del bucle sera porque jugador 2 ha acertado la cadena, se lo muestro
		// con mensaje por pantalla
		System.out.println("Enhorabuena ha acertado la palabra/frase!");

		// cierro escaner
		dogma.close();
	}
}
