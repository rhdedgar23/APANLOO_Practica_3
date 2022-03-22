package Abstractas;

public abstract class Trabajador {
	
	private String nombre;
	private int edad;
	
	public static void main(String[] args) {
		//No se pueden instanciar la clase Trabajador desde una de sus subclases
		//Trabajador trabajador= new Trabajador("Trabajador 1", 25, 6900);
	}
	
	public Trabajador(String nombre, int edad) {
		this.nombre= nombre;
		this.edad= edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public abstract double getSalario();
}
