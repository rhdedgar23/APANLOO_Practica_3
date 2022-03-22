package Abstractas;

public class Principal {

	public static void main(String[] args) {
		
		Ingeniero ing= new Ingeniero("Ingeniero 1", 23, 9000);
		Antropologo antro= new Antropologo("Antropologo 1", 22, 6000);
		
		//No se pueden crear objetos de una clase abstracta desde el metodo main de esta
		//clase principal
		//Trabajador trabajador= new Trabajador("Trabajador 1", 20, 5000);
		//A pesar de que la clase Trabajador tiene constructores (lo cual esta permitido), 
		//este constructor nunca se usa ya que no se puede instanciar una clase abstracta
		//Como no se 
		
		System.out.println("Ingeniero: \nNombre: " + ing.getNombre() + "\nEdad: " + ing.getEdad() + "\nSalario: " + ing.getSalario());
		
		System.out.println("\nAntropologo: \nNombre: " + antro.getNombre() + "\nEdad: " + antro.getEdad() + "\nSalario: " + antro.getSalario());
		
		//Como la clase Trabajador es una clase abstracta, no se pueden accesar sus metodos
		//excepto cuando sean de tipo "static" pero en este caso tenemos el metodo abstracto
		//"public abstract double getSalario();"
		
		//Si omitimos el metodo abstracto getSalario() de la clase abstracta y corremos el programa de nuevo, no pasa nada. La salida sigue siendo 
		//la misma. 
		
		//Una clase abstracta no podria funcionar como una clase concreta ya que no se puede instanciar. 
		//Pero una clase concreta si podria funcionar como una clase abstracta (simplemente no se instancia)
	}
}
