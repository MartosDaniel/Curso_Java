package fundamentos_lenguaje;

public class Estructuras_control {

	public static void main(String[] args) {
		
		/*
		 * Las estructuras de control son bloques de programacion que pueden cambiar el camino que seguimos a traves de esas instrucciones. Existen tres tipos:
		 * - Condicionales: if/else, operador ternario y switch
		 * - Bucles: for, while, do while
		 * - Ramificacion (sirven para alterar el flujo en los bucles): break, continue
		 */
		
		//Condicionales
		
		/*
		 * if else: se utilizan para evaluar una condicion y ejecutar diferentes de codigo segun el resultado
		 */
		
		int edad = 20;
		
		if (edad >= 18) {
			System.out.println("Eres mayor de edad");
		} else if(edad >= 13){
			System.out.println("Eres un adolescente");
		} else {
			System.out.println("Eres un niño");
		}
		
		
		/*
		 * Operador ternario: es una forma concisa de escribir una estructura condicional if/else en una sola linea
		 */
		String mensaje = (edad >= 18) ? "Eres mayor de edad" : "Eres menor de edad";
		System.out.println(mensaje);
		
		
		/*
		 * Switch-case: se utiliza cuando se desea evaluar una variable con multiples valores posibles, ejecutando el bloque de codigo correspondiente
		 */
		int dia = 3;
		switch (dia) {
		case 1:
			System.out.println("Lunes");
			break;
		
		case 2:
			System.out.println("Martes");
			break;

		case 3:
			System.out.println("Miercoles");
			break;
			
		default:
			System.out.println("Dia no valido");
			break;
		}
		
		
		//Bucles
		
		/*
		 * For: se usa cuando se conoce el numero exacto de iteraciones
		 * Sintaxis:
		 * 	for (inicializacion; condicion; actualizacion){
		 * 	
		 * 	}
		 */
		for (int i = 0; i < 5; i++) {
		    System.out.println("Iteración " + i);
		}
		
		
		/*
		 * For each: utilizado para iterar arrays y colecciones
		 * Sintaxis:
		 * 	for(type var: array/coleccion){
		 * 		
		 * 	}
		 */
		int[] numeros = {1,2,3,4,5};
		
		for(int numero: numeros) {
			System.out.println(numero);
		}
		
		
		/*
		 * while: bucle que ejecuta un bloque de codig mientras se cumpla una condicion.
		 * Sintaxis: 
		 * 	while(condicion){
		 * 
		 * 	}
		 */
		int i = 5;
		
		while(i < 5) {
			System.out.println("i es: " + i);
			i++;
		}
		
		
		/*
		 * Do while: bucle que se ejecuta minimo una vez y a continuacion se ejecuta la condicion hasta que se cumpla.
		 * Sintaxis:
		 * 	do {
		 * 
		 * 	}while(condicion)
		 */
		int count = 0;
		
		do {
			System.out.println("count: " + count);
			count++;
		} while (count < 5);
		
		
		//Ramificaciones
		
		/*
		 * Break: se utiliza para terminar prematuramente la ejecucion de un bucle o sentencia switch.
		 */
		for (i = 0; i < 10; i++) {
            if (i == 5) {
                break; // termina el bucle cuando i es 5
            }
            System.out.println("i: " + i);
        }
		
		
		/*
		 * Continue: se utiliza para saltarse la iteracion actual del bucle y pasar a la siguiente iteracion. 
		 */
		for (i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue; //Salta los numeros pares
            }
            System.out.println(i);
        }
	}

}
