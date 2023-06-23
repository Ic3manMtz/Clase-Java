package Clases;

import java.util.ArrayList;
import java.util.Scanner;

public class Promedio {
	private ArrayList<Double> numeros;
	private double promedio;

	public Promedio() {
		super();
		numeros = new ArrayList<>();
		promedio = 0.0f;
	}
	
	public void agregarNumero(double numero) {
		numeros.add(numero);
	}
	
	public double obtenerPromedio() {
		for(double numero : numeros) {
			promedio+=numero;
		}
		
		return promedio/numeros.size();
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Promedio promedio = new Promedio();
		
		while(true) {
			System.out.println("Ingrese un numero para la lista de promedio (Para terminar ingrese cualquier letra)");
			if(scanner.hasNextDouble()) {
				promedio.agregarNumero(scanner.nextDouble());
			}else {
				break;
			}
		}
		
		System.out.print("\nEl promedio es: ");
		System.err.println(promedio.obtenerPromedio());
	}
}
