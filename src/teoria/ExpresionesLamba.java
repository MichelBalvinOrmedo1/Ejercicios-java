package teoria;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ExpresionesLamba {

	public static void main(String[] args) {
		// Streams / Lamdba
		
		List<String> cities = new ArrayList<>();
		cities.add("London");
		cities.add("New York");
		cities.add("Lima");
		cities.add("Miami");
		cities.add("Bogota");
		/* con for normal
		for (int i = 0; i < cities.size(); i++) {
			System.out.println(cities.get(i));
		}*/
		/* foreach
		for(String city : cities) {
			System.out.println(city);
		}*/
		/*En Java, un Stream es una secuencia de elementos que se puede procesar 
		 * de forma paralela o en serie. Un Stream se puede crear a 
		 * partir de una colección, un array, un archivo, una fuente de datos externa, entre otros.*/
		List<Integer> numeros = Arrays.asList(2, 4, 6, 8, 10, 7, 3, 1);

		int suma = numeros.stream()          // Creamos un Stream a partir de la lista de números
		                 .filter(n -> n > 5) // Filtramos los números mayores que 5
		                 .filter(n -> n % 2 == 0) // Filtramos los números pares
		                 .mapToInt(n -> n)  // Convertimos los números en enteros
		                 .sum();            // Sumamos los números
		int[] enteros = numeros.stream().filter(n-> n %2 == 0).mapToInt(n -> n).toArray();
			       
			       
		System.out.println("La suma de los números pares y mayores que 5 es: " + suma);
		for(int entero : enteros) {
			System.out.println(entero);
		}

		cities.stream().parallel().forEach(city -> System.out.println(city));
		
		
	}
	//Seria igual
	public static void printCity(String city) {
		System.out.println(city);		
	}
			
}
