package fundamentos_lenguaje;

public class Operadores {
	
	public static void main(String[] args) {
		
		/*
		 * Operadores: permiten realizar operaciones sobre variables y valores.
		 * - Operadores aritmeticos
		 * - Operadores de asignacion
		 * - Operadores relacionales
		 * - Operadores logicos
		 * - Operadores de incremento y decremento
		 * - Operadores bit a bit
		 */
		
		/*
		 * Operadores aritmeticos: Se utilizan para realizar operaciones matematicas basicas
		 * - Suma: +
		 * - Resta: -
		 * - Multiplicacion: *
		 * - Division: /
		 * - Modulo (Resto): %
		 */		
		int a = 10, b = 3;
		System.out.println("Suma: " + (a + b));
		System.out.println("Resta " + (a - b));
		System.out.println("Multiplicacion: " + (a * b));
		System.out.println("Division: " + (a / b));
		System.out.println("Modulo: " + (a % b));
		
		
		/*
		 * Operadores de asignacion: Se utilizan para asignar valores a variables
		 * - Asignacion: =
		 * - Suma y asignacion: += -> (a = a + 5)
		 * - Resta y asignacion: -=
		 * - Multiplicacion y asignacion: *=
		 * - Division y asignacion: /=
		 * - Modulo y asignacion: %=
		 */
		int x = 5;
		x += 3;
		x *= 2;
		System.out.println("Valor final de x: " + x);
		
		
		/*
		 * Operadores relacionales: Sirven para comparar valores, devolviendo true o false
		 * Igual a: ==
		 * No es igual: !=
		 * Mayor que: >
		 * Menor que: <
		 * Mayor igual que: >=
		 * Menor igual que: <=
		 */
		int c = 10, d = 5;
		System.out.println(c == d);
		System.out.println(c > d);
		System.out.println(c <= d);
		
		/*
		 * Operadores logicos: se utilizan para combinar expresiones booleanas
		 * - AND logico: &&
		 * - OR logico: ||
		 * - NOT logico: !
		 */
		boolean esMayor = (10 > 5) && (8 < 10);
		boolean esIgual = (5 == 5) || (3 > 8);
		boolean negacion = !(5 > 2);
		
		
		/*
		 * Operadores de incremento y decremento: se usan para aumentar o disminuir en una unidad
		 * - Incremento: ++
		 * - Decremento: -- 
		 */
		int num = 10;
		System.out.println(num++);
		System.out.println(num--);
		
		
		/*
		 * Operadores bit a bit: Operan sobre los bits de los valores enteros
		 * - AND: &
		 * 	- Devuelve 1 solo si ambos bits son 1, de lo contrario devuelve 0
		 * - OR: |
		 * 	- Devuelve 1 si al menos uno de los bits es 1
		 * - XOR: ^
		 * 	- Devuelve 1 si los bits son diferentes, y 0 si son iguales
		 * - NOT: ~
		 * 	- Invierte todos los bits, cambia los 1 por 0 y viceversa. El resultado puede ser negativo
		 * - Desplazamiento izquierda: <<
		 * 	- Desplaza los bits de un numero hacia la izquierda, rellenando con 0 la derecha, cada desplazamiento equivale a multiplicar por 2
		 * - Desplazamiento derecha: >>
		 * 	- Desplaza los bits de un número hacia la derecha, conservando el signo (rellena con el bit de signo). Equivale a dividir por 2.
		 */
		int num1 = 5, num2 = 3;
		
		System.out.println(num1 & num2);
		System.out.println(num1 | num2);
		System.out.println(num1 ^ num2);
		System.out.println(~num1);
		System.out.println(num1 << 2);
		System.out.println(num1 >> 2);
		
	}
	
	
	

}
