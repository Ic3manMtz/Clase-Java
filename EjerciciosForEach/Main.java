package ejercicios;

import java.util.Scanner;

public class Main {	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Ejercicio objeto = new Ejercicio();
		
		while(true) {
			System.out.println("\n\nElige una opcion");
			System.out.println("1. Lista de numeros");
			System.out.println("2. Lista de palabras");
			System.out.println("3. Lista de cadenas");
			System.out.println("4. Salir");
			int opt = scanner.nextInt();
			scanner.nextLine();
			switch(opt) {
				case 1: numeros(objeto, scanner);
					break;
				case 2: palabras(objeto, scanner);
					break;
				case 3: cadenas(objeto, scanner);
					break;
				case 4: System.exit(4);
				default: System.out.println("Opcion incorrecta intenta de nuevo");
					break;
			}
		}
	}



	private static void cadenas(Ejercicio objeto, Scanner scanner) {
		while(true) {
			System.out.print("Ingresa una cadena, para terminar teclea 'terminar'...");
			String entrada = scanner.nextLine();
			if(entrada.equals("terminar")) {
				break;
			}
			objeto.agregarCadena(entrada);
		}
		
		System.out.println("\nCadenas originales ingresados");
		objeto.mostrarCadenas();
		
		System.out.println("\nPalabras convertidas a mayusculas");
		objeto.convertirCadenasAMayusculas();
	}



	private static void palabras(Ejercicio objeto, Scanner scanner) {
		while(true) {
			System.out.print("Ingresa una palabra, para terminar teclea 'terminar'...");
			String entrada = scanner.nextLine();
			if(entrada.equals("terminar")) {
				break;
			}
			objeto.agregarPalabra(entrada);
		}
		
		System.out.println("\nPalabras originales ingresados\n");
		objeto.mostrarPalabras();
		
		System.out.println("\nPalabras mayores a 4 caracteres filtradas");
		objeto.filtrarPalabras();
	}



	private static void numeros(Ejercicio objeto, Scanner scanner) {
		while(true) {
			System.out.print("Ingresa un número, para terminar ingresa -1...");
			int entrada = scanner.nextInt();
			if(entrada==-1) {
				break;
			}
			objeto.agregarNumero(entrada);
		}
		System.out.println("\nNumeros originales ingresados");
		objeto.mostrarNumeros();
		
		System.out.println("\nNumeros pares filtrados");
		objeto.filtrarNumerosPares();
	}
}
