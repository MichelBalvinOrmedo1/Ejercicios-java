package POO;

public class pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Automovil auto = new Automovil("Tollota", "stevan", "rojo", "200km");
		System.out.println(auto.getVelocidadMaxima());
		Persona michel = new Persona("Michel","Balvin", 22,'M', "michel_balvin@hotmail.com");
		michel.imprimirDatos();
		Persona Alex = new Persona("Alex","Paredes", 22,'M',"michel_balvin@hotmail.com");
		Alex.imprimirDatos();
		
		Empleado daniel = new Empleado("Daniel","Ramirez",25,'M',"danielRamirez@gmail.com", 2500);
		System.out.println("Mi salario total es : "+daniel.salarioAnual());*/
		
		
		cuentaBanco michel = new cuentaBanco(154554,"Michel", 1500);
		
		if(michel.depositar(15060)) {
			System.out.println("Transferencia aceptada");
			System.out.println(michel.getSaldo());
		}else {
			System.out.println("No tienes los fondos suficientes");
		}
		System.out.println();
	}

}
