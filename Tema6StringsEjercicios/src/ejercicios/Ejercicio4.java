package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner dogma = new Scanner(System.in);

		String frase = "";

		System.out.println("Introduzca su texto: ");

		// uso nextLine en lugar de next, porque next para de leer si encuentra espacio
		//en string
		frase = dogma.nextLine();
		
		//llamo a la funcion volteaCadena y hago print de su return
		System.out.println(Funciones.volteaCadena(frase));
		
		dogma.close();

	}

}
