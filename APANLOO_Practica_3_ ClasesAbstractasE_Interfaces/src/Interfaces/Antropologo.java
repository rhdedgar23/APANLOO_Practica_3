package Interfaces;

public class Antropologo extends Trabajador implements Salariable{
	
	public Antropologo(String nombre, int edad, double salario) {
		super(nombre, edad, salario);
	}
	
	public double getSalario() {
		return salario;
	}
}
