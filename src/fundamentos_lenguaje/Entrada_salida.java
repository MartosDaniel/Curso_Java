package fundamentos_lenguaje;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Entrada_salida {

	public static void main(String[] args) throws IOException {
		
		/*
		 * La entrada y salida de datos (E/S): se refiere a la forma en la que un programa interactua con el mundo exterior. Como recibe informacion del usuario o de otras fuentes (entrada) y como muestra resultados
		 * o envia informacion a otros destinos (salidas). Aqui se abordara la entrada y salida de datos para y por el usuario.
		 * 
		 * La E/S se maneja mediante streams o flujos. Un stream representa un flujo de datos. Hay dos tipos diferentes:
		 * - Streams de bytes: manejan datos en forma de bytes (8 bits). Se utilizan para datos binarios, como imagenes, archivos de audio o video.
		 * Las principales clases son: InputStream (entrada) y OutputStream (salida)
		 * 
		 * - Streams de caracteres: manejan datos en forma de caracteres (16 bits). Se utilizan para datos de texto.
		 * Las principales clases son: Reader (entrada) y Writer (salida)
		 */
		
		/*
		 * Salida de datos (Mostrar informacion al usuario): La salida estandar en Java se maneja principalmente a traves de la clase System.
		 * En concreto se utiliza el objeto System.out, que es una instancia de la clase PrintStream
		 */
		
		//System.out.print() -> Este metodo imprime el argumento que se le pasa en la consola, sin añadir un salto de linea
		System.out.print("Este texto se imprime");
		System.out.print(" en una linea");
		
		
		//System.out.println() -> Este metodo imprime el argumento en la consola y añade un salto de linea al final, moviendo el cursor a la siguiente linea.
		System.out.println("");
		System.out.println("Primera linea");
		System.out.println("Segunda linea");
		
		
		/*
		 * System.out.printf() -> Este metodo permite formatear la salida utilizando especificadores de formato. Util para presentacion de datos
		 * Especificadores comunes:
		 * 	- %d -> entero decimal
		 * 	- %f -> numero de punto flotante
		 * 	- %nf -> numero de punto flotante con n decimales
		 * 	- %s -> cadena de caracteres
		 * 	- %c -> caracter
		 * 	- %b -> valor booleano
		 * 	- %x -> entero hexadecimal
		 * 	- \n -> salto de linea
		 * 	- \t -> tabulacion
		 */
		int edad = 28;
		double altura = 1.75;
		String nombre = "Daniel";
		
		System.out.printf("Nombre: %s, Edad: %d, Altura: %.2f\n", nombre, edad, altura);
		System.out.printf("Edad en hexadecimal: %x\n", edad);
		
		
		/*
		 * Entrada de datos (recibir informacion del usuario): Java ofrece principalmente dos enfoques:
		 * - BufferedReader (Junto con InputStreamReader) -> InputStreamReader lo que hace es leer la entrada en bytes y decodificarlas en caracteres. 
		 * - Scanner
		 */
		
		//BufferedReader (entrada de texto linea por linea)
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(input);
		
		System.out.print("Introduce tu nombre: ");
		nombre = reader.readLine(); //Puede lanzar IOException
		
		System.out.print("Introduce tu edad: ");
		edad = Integer.parseInt(reader.readLine());
		
		System.out.println("Hola " + nombre + " tienes " + edad + " años.");
		
		
		/*
		 * Scanner (entrada formateada y mas flexible)
		 * Metodos utiles:
		 * 	- nextLine() -> lee una linea completa incluyendo espacios
		 * 	- next() -> lee la siguiente palabra
		 * 	- nextInt() -> lee un entero
		 * 	- nextDouble() -> lee un numero de punto flotante
		 * 	- nextBoolean() -> lee un valor booleano
		 * 	- hashNextInt, hashNextDouble -> comprueban si el siguiente token en la entrada es del tipo especificado. Sirve para validacion de entrada.
		 */
		Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
        nombre = scanner.nextLine(); // Lee una línea completa

        System.out.print("Introduce tu edad: ");
        edad = scanner.nextInt(); // Lee un entero

        System.out.print("Introduce tu altura (en metros): ");
        altura = scanner.nextDouble(); // Lee un double

        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Altura: " + altura);

        scanner.close(); // Buena práctica: cerrar el Scanner

	}

}
