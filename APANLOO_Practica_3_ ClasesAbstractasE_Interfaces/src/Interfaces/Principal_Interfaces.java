package Interfaces;

public class Principal_Interfaces {

	public static void main(String[] args) {
		
		Ingeniero ing= new Ingeniero("Ingeniero 1", 23, 9000);
		Antropologo antro= new Antropologo("Antropologo 1", 22, 6000); 
		
		System.out.println("Ingeniero: \nNombre: " + ing.getNombre() + "\nEdad: " + ing.getEdad() + "\nSalario: " + ing.getSalario());
		
		System.out.println("\nAntropologo: \nNombre: " + antro.getNombre() + "\nEdad: " + antro.getEdad() + "\nSalario: " + antro.getSalario());
		
		//Comparada con el proyecto previo (Package "Abstractas"), la salida de este proyecto es la misma. 
		
		//Si se pueden declarar varialbes en la interface pero son static y final entonces se tienen que inicializar en la interface. Esto no nos sirve
		//de mucho para nuestro proyecto ya que necesitamos que el nombre, la edad y el salario de cada trabajador sea diferente. 
		
		//La interface es considerada una clase abstracta por lo que no se puede instanciar. 
	}
}
