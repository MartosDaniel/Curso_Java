package fundamentos_lenguaje;

public class Strings {
	
	public static void main (String[] args) {
		
		/*
		 * Es una secuencia de caracteres representada por la clase String. Esta clase en inmutable, lo que significa que una vez se crea una instancia de String su contenido no puede cambiar. Cualquier operacion que parezca modificar un objeto de tipo String, en realidad crea un objeto con los cambios aplicados.
		 */

		//Creando strings
		String texto = "Hola Mundo!";
		
		String s = new String("Hola Mundo!");
		
		//Operaciones con strings
		
		/**
		 * Concatenar cadenas:
		 * 
		 * - Operador +
		 * - Metodo concat()
		 * - StringBuilder o StringBuffer (Mejor rendimiento)
		 */
		
		//Operador +
		String concatenar = "Esta es mi primera variable: " + s;
		
		//Metodo concat
		String s1 = "Mi nombre es: ";
		String frase = s1.concat("Daniel");
		
		//StringBuilder (mas rapido, no es seguro para multiples hilos)
		StringBuilder sb = new StringBuilder("Hola");
		sb.append(" mundo");
		
		//StringBuffer (Similar a StringBuilder pero seguro para hilos)
		StringBuffer sbu = new StringBuffer("Hola");
		sbu.append(" mundo!");
		
		
	}

	
	
}
