package ejercicios.ejercicio1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Lista lista = new Lista();
		
		while(true) {
			System.out.print("Escribe un nombre para agregarlo a la lista, para terminar escribe 'terminar'...");
			String entrada = scanner.nextLine(); 
			if(entrada.equals("terminar")) {
				break;
			}
			lista.agregarNombre(entrada);
		}
		
		lista.mostrarNombres();
	}
}
