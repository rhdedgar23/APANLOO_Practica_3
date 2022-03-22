package Interfaces_2;

public class Ingeniero implements Trabajable, Salariable {

	String nombre;
	int edad;
	double salario;
	
	public Ingeniero(String nombre, int edad, double salario) {
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
	
	public double getSalario() {
		return salario;
	}
}
