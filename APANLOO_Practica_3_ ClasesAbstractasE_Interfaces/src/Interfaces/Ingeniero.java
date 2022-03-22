package Interfaces;

public class Ingeniero extends Trabajador implements Salariable {
	
	public Ingeniero(String nombre, int edad, double salario) {
		super(nombre, edad, salario);
	}
	
	public double getSalario() {
		return salario;
	}
}
