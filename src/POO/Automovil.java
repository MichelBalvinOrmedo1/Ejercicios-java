package POO;

public class Automovil {
	// VARIABLES DE CLASE
	   private String marca;
	   private String modelo;
	   private String color;
	   private String velocidadMaxima;

	   // CONSTRUCTOR QUE INICIALIZA LAS VARIABLES DE CLASE
	   public Automovil(String marca, String modelo, String color, String velocidadMaxima) {
	      this.marca = marca;
	      this.modelo = modelo;
	      this.color = color;
	      this.velocidadMaxima = velocidadMaxima;
	   }

	   // METODOS GETTER Y SETTER PARA PODER RECUPERAR O CAMBIAR
	   // LOS DATOS DE LAS VARIABLES DE CLASE

	   public String getMarca() {
	      return marca;
	   }

	   public void setMarca(String marca) {
	      this.marca = marca;
	   }

	   public String getModelo() {
	      return modelo;
	   }

	   public void setModelo(String modelo) {
	      this.modelo = modelo;
	   }

	   public String getColor() {
	      return color;
	   }

	   public void setColor(String color) {
	      this.color = color;
	   }

	   public String getVelocidadMaxima() {
	      return velocidadMaxima;
	   }

	   public void setVelocidadMaxima(String velocidadMaxima) {
	      this.velocidadMaxima = velocidadMaxima;
	   }
	   
}
