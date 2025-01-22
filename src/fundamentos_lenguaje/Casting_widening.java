package fundamentos_lenguaje;

public class Casting_widening {

	public static void main(String[] args) {
		
		/*
		 * Widening (conversion implicita): cuando un tipo de dato mas pequeño se convierte en un tipo de dato mas grande de forma automatica sin perdida de datos. Java realiza este tipo de conversion de manera implicita, ya que no existe riesgo de perdida de precision.
		 * 
		 * Jerarquia: byte -> short -> int -> long -> float -> double
		 */
		int num = 100;
		long bigNum = num;
		float decimalNum = bigNum;
		
		System.out.println("int: " + num);
		System.out.println("long: " + bigNum);
		System.out.println("float: " + decimalNum);
		
		
		/*
		 * Casting (conversion explicita): cuando se realiza una conversion de un tipo mas grande a uno mas pequeño de manera explicita, ya que podria haber perdida de datos. 
		 * 
		 * Jerarquia: double → float → long → int → short → byte
		 */		
		double doubleNum = 9.78;
		int wholeNum = (int) doubleNum;
		
		System.out.println("double: " + doubleNum);
		System.out.println("int (after casting): " + wholeNum);
		
		
		/*
		 * Casting de tipos primitivos a String
		 * - Concatenacion
		 * - String.valueOf()
		 * - Integer.toString(), Double.toString(), etc
		 */
		int number = 42;
		String str1 = number + "";
		String str2 = String.valueOf(number);
		String str3 = Integer.toString(number);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		
		/*
		 * Casting de String a tipos primitivos
		 * - Integer.parseInt(), Double.parseDouble(), etc.
		 * - Integer.valueOf() -> para convertir a objeto en lugar de primitivos
		 */
		String numberString = "123";
		int num1 = Integer.parseInt(numberString);
		double num2 = Double.parseDouble("45.67");
		
		System.out.println(num1);
		System.out.println(num2);
		
		Integer numObj = Integer.valueOf(numberString);
		
		System.out.println(numObj);
		
		
		/*
		 * Casting de objetos a String
		 * - toString() - metodo estandar en java
		 * - Concatenacion con cadena vacia
		 */
		Integer obj = 100;
		String strObj = obj.toString();
		System.out.println(strObj);
		
		
	}

}
