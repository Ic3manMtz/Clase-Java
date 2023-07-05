package ejercicios;

import java.util.Scanner;

public class TestEjercicio2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Lista lista = new Lista();
		
		while(true) {
			System.out.print("Ingrese un número, para terminar teclee 'terminar'...");
			if(scanner.hasNext()) {
				var elemento = scanner.nextLine();
				if(elemento.equals("terminar")) {
					break;
				}
				
				lista.agregarNumero(elemento);
			}
		}
		
		System.out.println("\nLista de numeros ingresada");
		lista.mostrarNumeros();
		
		System.out.println("\n\nEl promedio de la lista es "+lista.calcularPromedio());
	}
}
