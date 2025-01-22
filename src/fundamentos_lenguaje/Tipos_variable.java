package fundamentos_lenguaje;

public class Tipos_variable {
	
	/*
	 * Tipos de variables en Java:
	 * - Variables de instancia
	 * - Variables de clase
	 * - Variables locales
	 * - Variables de parametros
	 * - Variables final
	 */
	
	
	/*
	 * Variables de instancia: 
	 * - Se declaran dentro de una clase pero fuera de cualquier metodo, constructor o bloque
	 * - Cada objeto de la clase tiene su propia copia
	 * - Se inicializan con valores predeterminados si no se asignan esplicitamente
	 * - Accedidas mediante objetos de la clase
	 * - Suelen llevar un modificador de visibilidad (public, private, protected)
	 */
	private String nombre;
	public int edad;
	
	
	/*
	 * Variables de clase (static):
	 * - La variable estatica solo se instancia una vez
	 * - Se declaran con la palabra clave static
	 * - Son compartidas por todos los objetos de la clase
	 * - Accedidas usando el nombre de la clase o instancias
	 */
	static String empleo = "Desarrollador";
	
	
	/*
	 * Variables locales:
	 * - Declaradas dentro de un metodo, constructor o bloque
	 * - Existen mientras se ejecuta el metodo
	 * - Deben ser inicializadas antes de su uso
	 * - Se diferencian de las de instancia por que no llevan modificadores delante
	 */
	public void mostrarMensaje() {
		String videojuego = "Silent Hill";
		System.out.println("Mi videojuego favorito es: " + videojuego);
	}
	
	/*
	 * Variables de parametro:
	 * - Declaradas en la firma de un metodo y reciben valores cuando es llamado el metodo
	 */
	public void superHeroe(String heroe) {
		System.out.println("Mi superheroe favorito es: " + heroe);
	}
	
	
	/*
	 * Variables final (constantes)
	 * - Declaradas con la palabra clave final
	 * - Su valor no puede cambiar despues de ser asignado
	 * - Se utilizan mayusculas para definir su nombre
	 */
	final int MAX_INTENTOS = 5;

}
