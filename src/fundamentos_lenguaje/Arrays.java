package fundamentos_lenguaje;

import java.util.Iterator;

public class Arrays {

	public static void main(String[] args) {
		
		/*
		 * Arrays: estructura de datos que nos permite almacenar datos de un mismo tipo. El tamaño de los arrays se declara en un primer momento y no puede cambiar en tiempo de ejecucion. 
		 * Declaracion:
		 * 	tipo_de_dato[] nombreArray;
		 */
		int[] numeros;
		
		/*
		 * Hay varias formas de inicializar un array dependiendo de las necesidades
		 */
		
		//Forma 1: se le asigna el tamaño a la hora de inicilizarlo esto no cambiara de aqui en adelante despues podemos acceder a las posiciones y asignarle los valores.
		numeros = new int[5];
		
		numeros[0] = 23;
		numeros[1] = 16;
		numeros[2] = 66;
		numeros[3] = 99;
		numeros[4] = 143;
		
		
		//Forma 2: se le asignan los valores durante la creacion, lo que el tamaño depende de los datos que introduzcamos.
		char[] caracteres = {'a', 'b', 'c', 'd', 'e'};
		
				
		/*
		 * Los arrays se numeran desde el elemento 0, que seria el primer elemento, hasta el tamaño-1 que seria el ultimo elemento.
		 * Para acceder a un elemento especifico lo hacemos de la siguiente manera:
		 * 	nombreArray[numero];
		 */
		char caracter1 = caracteres[1]; //Devuelve el segundo elemento del array
		
		
		/*
		 * Tamaño de un array: para conocer el numero de elementos que posee un array usamos la propiedad length
		 */
		System.out.println("Tamaño del array es: " + caracteres.length); //Nos devuelve 5
		
		
		/*
		 * Para recorrer un array usamos los bucles for y for each
		 */
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Posicion: " + i + " valor: " + numeros[i]);
		}
		
		for (char c : caracteres) {
			System.out.println(c);
		}
		
		/*
		 * Arrays de n-dimensiones: son arrays que contienen otros arrays como elementos. 
		 * 	Ejemplo de array de dos dimensiones: tipo_de_dato[][] nombre_del_array = new tipo_de_dato[numero_de_filas][numero_de_columnas];
		 */
		int[][] matriz = { //El primer corchete indica las filas y el segundo las columnas en este caso seria [3][3]
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };
		
		//Para recorrer un array multidimensional usamos un for dentro de otro, para recorrer las filas y las columnas
		System.out.println("Matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t"); // \t para tabulación
            }
            System.out.println();
        }
		
		
	}

}
