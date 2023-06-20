package Clases;

import java.util.*;

public class Persona {
	//Atributos de la clase
	private String nombre;
	private int edad;
	
	public Persona() {
		super();
	}

	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return "Nombre=" + nombre + ", edad=" + edad;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Persona persona = new Persona();
		
		System.out.println("Ingresa el nombre de la persona");
		persona.setNombre(scanner.nextLine());
		
		System.out.println("Ingresa la edad de la persona");
		persona.setEdad(Integer.parseInt(scanner.nextLine()));
		
		System.out.println(persona.toString() + "  Holaaaaa!");
	}

}
