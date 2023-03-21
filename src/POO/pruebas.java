package POO;

public class pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automovil auto = new Automovil("Tollota", "stevan", "rojo", "200km");
		System.out.println(auto.getVelocidadMaxima());
		Persona michel = new Persona("Michel","Balvin", 22, "michel_balvin@hotmail.com");
		michel.imprimirDatos();
	}

}
