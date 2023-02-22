package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		String palabras[] = new String[0];// creo array de longitud 0 donde guardare palabras de la
											// fraseConEspacios(metodo split añadira longitud necesaria)

		String fraseConEspacios = "";// guardara la frase con espacios, la inicializo vacia

		String fraseSinEspacios = "";// guardara la frase sin espacios, la inicializo vacia

		String espacio = " ";// guardara un espacio a usar en el metodo split

		boolean palindroma = true;// guardara si la frase es palindroma o no con true o false

		Scanner dogma = new Scanner(System.in);

		System.out.println("Introduzca una frase: ");
		fraseConEspacios = dogma.nextLine();

		// creo array string palabras con las cadenas devueltas por el metodo split
		// aplicado a la cadena frase usando espacio como separador
		// asi me deshago de los espacios de la string
		palabras = fraseConEspacios.split(espacio);

		// recorro array palabras
		for (String auxiliar : palabras) {
			// añado cadena contenida en auxiliar a cadena fraseSinEspacios
			// para formar la frase sin espacios
			fraseSinEspacios += auxiliar;
		}

		//paso la frase a minusculas para evitar errores de igualdad
		fraseSinEspacios = fraseSinEspacios.toLowerCase();

		// print para comprobar funcionamiento
		// frase palindroma de prueba y resultado a obtener en el print
		// Dabale arroz a la zorra el abad
		// Dabalearrozalazorraelabad
		System.out.println(fraseSinEspacios);

		// bucle recorrera fraseSinEspacios
		for (int i = 0; i < fraseSinEspacios.length(); i++) {

			// si el valor de la posicion i (que ira en aumento de izquierda a derecha)
			// es diferente del valor de la posicion fraseSinEspacios.length()-1 - i
			// (que ira en decremento de derecha a izquierda)
			if (fraseSinEspacios.charAt(i) != fraseSinEspacios.charAt(fraseSinEspacios.length() - 1 - i)) {
				// dara a palindroma valor igual a false
				palindroma = false;
			}
		}

		// hago print por pantalla de resultado de ternario aplicado a palindroma
		// para comunicar a usuario si la frase es palindroma o no
		System.out.println(palindroma ? "La frase es palindroma." : "La frase no es palindroma.");

		dogma.close();
	}

}
