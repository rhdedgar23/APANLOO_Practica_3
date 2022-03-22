package Abstractas;

public class Ingeniero extends Trabajador {
	
	double salario;
	
	public static void main(String[] args) {
		//No se pueden instanciar la clase Trabajador desde una de sus subclases
		//Trabajador trabajador= new Trabajador("Trabajador 1", 25, 6900); 
	}
	
	public Ingeniero(String nombre, int edad, double salario) {
		super(nombre, edad);
		this.salario= salario;
	}
	
	public double getSalario() {
		return salario;
	}
}
