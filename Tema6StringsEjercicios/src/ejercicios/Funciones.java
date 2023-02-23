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

	/**
	 * funcion estatica que recibira un caracter y 2 conjuntos de caracteres, si el
	 * caracter se encuentra en conjunto2 cambiara dicho caracter por su
	 * correspondiente en conjunto 1 y lo devolvera en el return de lo contrario no
	 * modificara el caracter y lo devolvera sin mas
	 * 
	 * @param conjunto1 parametro de entrada que contendra letras para codificacion
	 * @param conjunto2 parametro de entrada que contendra letras para codificacion
	 * @param caracter  contendra un caracter extraido de la cadena introducida por
	 *                  el usuario
	 * @return caracterCodificado contendra el caracter modificado o no segun el
	 *         caracter pasado como parametro de entrada haya sido encontrado en
	 *         conjunto2 o no
	 */
	static char descodifica(char conjunto1[], char conjunto2[], char caracter) {

		char caracterDescodificado = caracter;// doy a caracterDescodificado valor de caracter

		int indiceBusqueda = 0;// inicializo variable a 0 para uso en bucle

		// ejecuto busqueda mientras indiceBusqueda sea menor a longitud del array y
		// mientras el valor buscado no se encuentre en la posicion del array indicada
		// por indiceBusqueda
		while (indiceBusqueda < conjunto2.length && caracter != conjunto2[indiceBusqueda]) {
			indiceBusqueda++;
		}

		// si indice busqueda menor que longitud array conjunto2 significa que he
		// encontrado el valor buscado en el array, estaria en posicion indiceBusqueda
		if (indiceBusqueda < conjunto2.length) {
			// en tal caso sustituyo valor de caracterDescodificado por valor de posicion
			// indiceBusqueda en array conjunto1
			caracterDescodificado = conjunto1[indiceBusqueda];
		}

		// si indice busqueda igual o mayor que longitud array conjunto2 significa que
		// el valor buscado no se encuentra en el array
		else {
			// en tal caso no modifico caracterDescodificado y la funcion lo devuelve con
			// valor
			// igual al recibido por caracter como parametro de entrada
		}

		return caracterDescodificado;
	}

	/**
	 * funcion que recibira un array char extraido de una cadena, y pondra los
	 * valores de ese array en otro array en posiciones aleatorias
	 * 
	 * @param arrayCadena parametro de entrada que contendra los caracteres a
	 *                    insertar en el otro array
	 * @return arrayCadenaDevuelto array que contendra los caracteres de arrayCadena
	 *         en posiciones aleatorias
	 */
	static char[] desordenaCadena(char[] arrayCadena) {

		char arrayCadenaDevuelto[] = new char[arrayCadena.length];//declaro arrayCadenaDevuelto y le doy longitud igual a la de arrayCadena

		int posicion = 0;//declaro variable que guardara la posicion que se esta recorriendo de arrayCadena

		int posicionAleatoria = 0;//declaro variable que guardara una posicion aleatoria

		//bucle que se ejecutara mientras la posicion actual sea menor a la longitud de arrayCadena 
		//llenando el arrayCadenaDevuelto con los valores de arrayCadena
		while (posicion < arrayCadena.length) {

			//doy a posicionAleatoria valor aleatorio enter 0 y longitud de arrayCadena (20, que el metodo pasara a 1 menos (19)) con Math.random 
			posicionAleatoria = (int) (Math.random() * arrayCadena.length);
			
			//si la posicion aleatoria de arrayCadenaDevuelto esta vacia 
			if (arrayCadenaDevuelto[posicionAleatoria] == 0) {
				
				//le doy a esa posicion valor igual a posicion actual en arrayCadena
				arrayCadenaDevuelto[posicionAleatoria] = arrayCadena[posicion];
				//y aumento en +1 el valor de posicion
				posicion++;
			}
		}
		return arrayCadenaDevuelto;
	}

}
