package ejercicios;

public class ejecucion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContadorLetras ejercicio1 = new ContadorLetras("Hola michel eres bien linda",'e');
		System.out.println(ejercicio1.letras());
		
		String[] nuevo = {"Elefate","Alpaca","Perro"};
		OrdenarArray ejercicio2 = new OrdenarArray(nuevo);
		ejercicio2.ordenar();
		
		
	}

}
