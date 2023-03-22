package POO;

public class Persona {
	private String nombre;
	private String apellido;
	private int edad;
	private char genero;
	private String correo;
	
	//Constructor
	public Persona(String  nombre, String apellido, int edad, char genero ,String correo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.genero = genero;
		this.correo = correo;
	}
	//Seter y Getter
	public String getNombre() {
		return this.nombre;
	}
	public String getApellido() {
		return this.apellido;
	}
	public int getEdad(){
		return this.edad;
	}
	public char getGenero() {
		return this.genero;
	}
	public String getCorreo() {
		return this.correo;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public void imprimirDatos() {
		System.out.println("Soy "+this.nombre +" "+ this.apellido + " Tengo " + this.edad + "mi genero es "+ this.genero +" años y mi correo es "+ this.correo );
	}
}
