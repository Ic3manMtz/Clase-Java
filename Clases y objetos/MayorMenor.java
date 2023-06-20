package Clases;

import java.util.Scanner;

public class MayorMenor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresa el primer valor");
		int valor1 = scanner.nextInt();
		
		System.out.println("Ingresa el segundo valor");
		int valor2 = scanner.nextInt();
		
		System.out.println("Ingresa el tercer valor");
		int valor3 = scanner.nextInt();
		
		int mayor = encontrarMayor(valor1, valor2, valor3);
		int menor = encontrarMenor(valor1, valor2, valor3);
		
		System.out.println("El mayor de los valores es: " + mayor);
		System.out.println("El menor de los valores es: " + menor);
	}
	
	public static int encontrarMayor(int a, int b, int c) {
		int mayor =  a;
		
		if(b > mayor)
			mayor = b;
		
		if(c > mayor)
			mayor = c;
		
		return mayor;
	}	
	
	public static int encontrarMenor(int a, int b, int c) {
		int menor =  a;
		
		if(b < menor)
			menor = b;
		
		if(c < menor)
			menor = c;
		
		return menor;
	}
}
