package ejercicio2;

import java.util.Scanner;

import ejercicio1.Array;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Lista lista = new Lista();
		while(true) {
			System.out.print("Ingrese una cadena para agregar a la lista, para terminar escriba 'terminar'...");
			String cadena = scanner.nextLine();
			if(cadena.equals("terminar")) {
				break;
			}
			
			lista.agregarCadena(cadena);
		}
		
		System.out.println("\nLista original: ");
		lista.mostrarLista();
		
		lista.eliminarDuplicados();
		System.out.println("\n\nLista sin duplicados: ");
		lista.mostrarListaSinDuplicados();
	}
}
