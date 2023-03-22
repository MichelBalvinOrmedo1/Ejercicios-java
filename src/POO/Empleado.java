package POO;

public class Empleado extends Persona{
	
	private double salario;
	
	public Empleado(String nombre, String apellido, int edad, char genero, String correo, double salario) {
		super(nombre, apellido, edad, genero, correo);
		this.salario = salario;
	}
	public double getSalario() {
		return this.salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double salarioAnual() {
		double salarioAnual = this.salario * 12;
		return salarioAnual;
	}
}
