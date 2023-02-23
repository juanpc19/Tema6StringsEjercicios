package ejercicios;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {

		String cadenaJugador1 = "";// guardara primera cadena introducida por usuario

		String cadenaJugador2 = "";// guardara segunda cadena introducida por usuario

		String cadenaDesordenada = "";// guardara cadenaJugador1 con caracteres desordenados

		char letrasCadena1[] = new char[0];// array que guardara la cadenaJugador1 descompuesta en chars, lo inicializo
											// a 0 y el metodo toCharArray() le dara longitud necesaria

		char letrasCadenaDesordenada[] = new char[0];// array que guardara el return de la funcion desordenaCadena, lo
														// inicializo a 0 y la funcion desordenaCadena le dara longitud
														// necesaria al machacarla

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
		}

		// si salgo del bucle sera porque jugador 2 ha acertado la cadena, se lo muestro
		// con mensaje por pantalla
		System.out.println("Enhorabuena ha acertado la palabra/frase!");

		// cierro escaner
		dogma.close();
	}

}
