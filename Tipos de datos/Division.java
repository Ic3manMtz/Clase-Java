package Clases;

import java.util.Scanner;

public class Division {
	private int dividendo;
	private int divisor;
	
	public void setDividendo(int dividendo) {
		this.dividendo = dividendo;
	}

	public void setDivisor(int divisor) {
		this.divisor = divisor;
	}

	public int getDividendo() {
		return dividendo;
	}

	public int getDivisor() {
		return divisor;
	}

	public int obtenerCociente() {
		return dividendo / divisor;
	}
	
	public int obtenerResto() {
		return dividendo % divisor;
	}
	
	public float obtenerReal() {
		return (float)dividendo / divisor;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Division division = new Division();
		
		System.out.println("Ingrese el primer número");
		division.setDividendo(Integer.parseInt(input.nextLine()));
		
		System.out.println("Ingrese el segundo número");
		division.setDivisor(Integer.parseInt(input.nextLine()));
		
		
		System.out.println("Para los números "+division.getDividendo()+" y "+division.getDivisor());
		System.out.println("Cociente = "+division.obtenerCociente());
		System.out.println("Resto = "+division.obtenerResto());
		System.out.println("Respuesta real = "+division.obtenerReal());
	}
}
