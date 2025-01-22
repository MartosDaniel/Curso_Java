package fundamentos_lenguaje;

public class Tipos_datos_primitivos {
	
	/** 
	 * Tipo numerico:
	 * byte: representa un tipo de dato de 8 bits con signo. -128 a 127
	 * short: representa un tipo de dato de 16 bits con signo. -32.768 a 32.767
	 * int: representa un tipo de dato de 32 bits con signo para almacenar valores numericos. -2^31 a (2^31)-1
	 * long: tipo de dato de 64 bits. -2^63 a (2^63)-1
	 * 
	 * Coma flotante:
	 * float: tipo de dato para almacenar numeros en coma flotante con precision simple de 32bits
	 * double: tipo de dato para almacenar numeros en coma flotanto con precision simple de 64bits
	 * 
	 * Booleano y caracter
	 * boolean: sirve para almacenar aquellos datos que tienen un valor de true o false
	 * char: tipo de datos que representa un caracter Unicode sencillo de 16 bits
	 * 
	 * */

	
	//USOS
	
	/**
	 * Byte:
	 * - Almacenar datos de imagenes, sonido o video.
	 * - Guardar informacion de tipo flag, como el estado de un interruptor
	 * - Guardar datos de configuracion que no requieren mucho espacio de almacenamiento
	 * - Guardar valores empleados para enviar y recibir datos a traves de una red */
	byte edad = 28;
	
	/** 
	 * Short:
	 * - Representar valores que no necesitan mucha precision y que estan dentro del rango permitido
	 * - Se utilizan para ahorrar espacio en matrices grandes que contienen muchos valores enteros pequeños
	 * - Mejorar el rendimiento en calculos matematicos
	 * */
	short temperatura = -10;
	
	/**
	 * Int:
	 * - Programar contadores y variables de control en bucles y estructuras de control
	 * - Para indices de matrices, listas y arreglos
	 * - Como valores numericos en calculos matematicos
	 */
	int numero_entero = 100; 
	
	/**
	 * Long:
	 * - Valores enteros muy grandes
	 * - Medir el tiempo cuando la cantidad de digitos es amplia
	 * - Calculos matematicos con precision muy alta
	 */
	long numero_largo = 99999999;
	
	/**
	 * Float:
	 * - Representar numeros decimales
	 * - Para calculos matematicos que involucran numeros con decimales
	 */
	float numero_flotante = 3.1416F;
	
	/**
	 * Double: 
	 * - Se emplean para representar numeros con decimales con alta precision
	 * - Almacenar grandes datos en una matriz
	 * - Geolocalizacion
	 */
	double numero_double = 3.14159265358979323846;
	
	/**
	 * Char:
	 * - En la entrada y salida de datos para representar caracteres
	 */
	char letra = 'A';
	
	/**
	 * Boolean:
	 * - Operaciones booleanas: AND, OR, NOT, XOR
	 * - Estructuras condicionales
	 */
	boolean es_true = true;
}
