package Interfaces_2;

public class Principal_Interfaces_2 {

	public static void main(String[] args) {
		
		Ingeniero ing= new Ingeniero("Ingeniero 1", 23, 9000);
		Antropologo antro= new Antropologo("Antropologo 1", 22, 6000); 
		
		System.out.println("Ingeniero: \nNombre: " + ing.getNombre() + "\nEdad: " + ing.getEdad() + "\nSalario: " + ing.getSalario());
		
		System.out.println("\nAntropologo: \nNombre: " + antro.getNombre() + "\nEdad: " + antro.getEdad() + "\nSalario: " + antro.getSalario());
		
	}
}
