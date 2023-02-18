package ejercicios;

public class Funciones {

	/**
	 * funcion estatica que recibira una cadena y la devolvera invertida
	 * 
	 * @param cadena parametro de entrada que contiene la cadena a invertir
	 * @return textoInvertido contendra la cadena ya invertida
	 */
	static String volteaCadena(String cadena) {

		String textoInvertido = "";// creo cadena para el return y la inicializo vacia

		// creo for que recorrera la cadena desde el final hasta el principio
		for (int i = cadena.length() - 1; i >= 0; i--) {

			// añado valor del charAt en posicion i a textoInvertido

			// este valor podria meterse en un array tipo char igualando el charAt en
			// posicion i a la posicion i del array tipo char para tener la palabra guardada
			// y usarla pero al hacerlo como lo hago aqui no es necesario crear un array
			textoInvertido += cadena.charAt(i);
		}

		return textoInvertido;

	}
}
