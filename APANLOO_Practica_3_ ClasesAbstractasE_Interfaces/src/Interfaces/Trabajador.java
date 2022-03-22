package Interfaces;

public class Trabajador {
	
	private String nombre;
	private int edad;
	double salario;
	
	public Trabajador(String nombre, int edad, double salario) {
		this.nombre= nombre;
		this.edad= edad;
		this.salario= salario;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getEdad() {
		return edad;
	}
}
