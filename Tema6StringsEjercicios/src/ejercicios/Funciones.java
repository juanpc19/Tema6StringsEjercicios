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

	/**
	 * funcion estatica que recibira un caracter y 2 conjuntos de caracteres, si el
	 * caracter se encuentra en conjunto1 cambiara dicho caracter por su
	 * correspondiente en conjunto 2 y lo devolvera en el return de lo contrario no
	 * modificara el caracter y lo devolvera sin mas
	 * 
	 * @param conjunto1 parametro de entrada que contendra letras para codificacion
	 * @param conjunto2 parametro de entrada que contendra letras para codificacion
	 * @param caracter  contendra un caracter extraido de la cadena introducida por
	 *                  el usuario
	 * @return caracterCodificado contendra el caracter modificado o no segun el
	 *         caracter pasado como parametro de entrada haya sido encontrado en
	 *         conjunto1 o no
	 */
	static char codifica(char conjunto1[], char conjunto2[], char caracter) {

		char caracterCodificado = caracter;// doy a caracterCodificado valor de caracter

		int indiceBusqueda = 0;// inicializo variable a 0 para uso en bucle

		// ejecuto busqueda mientras indiceBusqueda sea menor a longitud del array y
		// mientras el valor buscado no se encuentre en la posicion del array indicada
		// por indiceBusqueda
		while (indiceBusqueda < conjunto1.length && caracter != conjunto1[indiceBusqueda]) {
			indiceBusqueda++;
		}

		// si indice busqueda menor que longitud array conjunto1 significa que he
		// encontrado el valor buscado en el array, estaria en posicion indiceBusqueda
		if (indiceBusqueda < conjunto1.length) {
			// en tal caso sustituyo valor de caracterCodificado por valor de posicion
			// indiceBusqueda en array conjunto2
			caracterCodificado = conjunto2[indiceBusqueda];
		}

		// si indice busqueda igual o mayor que longitud array conjunto1 significa que
		// el valor buscado no se encuentra en el array
		else {
			// en tal caso no modifico caracterCodificado y la funcion lo devuelve con valor
			// igual al recibido por caracter como parametro de entrada
		}

		return caracterCodificado;
	}

}
