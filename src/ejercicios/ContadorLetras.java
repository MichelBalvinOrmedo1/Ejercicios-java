package ejercicios;



public class ContadorLetras {
	private String cadena;
	private char letra;
	
	public ContadorLetras(String cadena, char letra) {
		this.cadena = cadena;
		this.letra = letra;
	}
	public int letras() {
		int cantidad =0;
		for(int i=0; i< this.cadena.length(); i++) {
			/*usamos el charAt: charAt es un método de la clase String en Java 
			que se utiliza para obtener el carácter que se encuentra en una posición 
			específica de una cadena. El método toma un argumento de tipo int que representa la 
			posición del carácter deseado en la cadena.*/
			if(this.cadena.charAt(i) == this.letra) {
				cantidad ++;
			}
		}
		
		return cantidad;
	}
}
