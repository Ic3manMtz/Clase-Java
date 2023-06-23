package Clases;

import java.util.Scanner;

public class Circulo {
	private double radio;

	public Circulo(double radio) {
		super();
		this.radio = radio;
	}
	
	public double getRadio() {
		return radio;
	}



	public double calcularArea() {
		return Math.PI * Math.pow(radio, 2);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese el radio del círculo...");
		double radio = scanner.nextDouble();
		
		Circulo circulo = new Circulo(radio);
		
		System.out.print("\nEl area del circulo con radio "+circulo.getRadio()+" es: ");
		System.err.println(circulo.calcularArea());
	}
}
