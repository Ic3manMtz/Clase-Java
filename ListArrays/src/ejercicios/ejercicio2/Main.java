package ejercicios.ejercicio2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Array arreglo = new Array();
		
		for(int i=0;i<5;i++) {
			System.out.print("Ingrese el numero "+(i+1)+" de /5...");
			if(scanner.hasNextInt()) {
				int numero = scanner.nextInt();
				arreglo.agregarNumero(i, numero);
			}
		}
		
		System.out.println("\nArreglo antes de ser ordenado");
		arreglo.mostrar();
		
		System.out.println("\n\nArreglo ordenado");
		arreglo.ordenar();
		arreglo.mostrar();
	}
}
