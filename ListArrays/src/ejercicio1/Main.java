package ejercicio1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Array array = new Array();
		while(true) {
			System.out.print("Ingrese un número al array, para terminar escriba 'terminar'...");
			if(!scanner.hasNextInt()) {
				break;
			}
			
			int numero = scanner.nextInt();
			array.agregarNumero(numero);
		}
		
		System.out.println("\n"+array.toString());
		System.out.println("\nLa suma de los numeros de Array es: "+array.sumarArray());
	}
}
