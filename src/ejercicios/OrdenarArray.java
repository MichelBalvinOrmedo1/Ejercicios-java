package ejercicios;

import java.util.Arrays;

public class OrdenarArray {
	private String[] array;
	
	public OrdenarArray(String[]array) {
		this.array = array;
	}
	public void ordenar() {
		Arrays.sort(this.array);
		for(String nuevo : this.array) {
			System.out.println(nuevo);
		}
	}
}
