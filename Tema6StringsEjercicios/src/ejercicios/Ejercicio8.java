package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

		String frase = "";

		boolean idiomaJavalandia = false;// guardara si la frase es palindroma o no con true o false

		Scanner dogma = new Scanner(System.in);

		System.out.println("Introduzca una frase: ");
		frase = dogma.nextLine();

		if (frase.startsWith("Javalin, javalon		")==true && (frase.endsWith("		javalén, len, len"))) {
			idiomaJavalandia=true;
		}
		//si javalandia true hacer PRINT DEMENSAJE SSIN COLETILLA
	}

}
