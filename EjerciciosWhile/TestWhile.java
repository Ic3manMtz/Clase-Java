package TareasSemana4;

import java.util.Scanner;

public class TestWhile {
	public static void main(String[] args) {
		WhileDoWhile prueba = new WhileDoWhile();
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("Seleccione una de las siguiente opciones:");
			System.out.println("1) Ejercicio 1");
			System.out.println("2) Ejercicio 2");
			System.out.println("3) Ejercicio 3");
			System.out.println("4) Cerrar el programa");
			int opt = scanner.nextInt();
			
			switch(opt) {
				case 1:
					System.out.println("Ejercicio 1");
					prueba.ejercicio1();
					System.out.println();
					break;
				case 2:
					System.out.println("Ejercicio 2");
					prueba.ejercicio2();
					System.out.println();
					break;
				case 3:
					System.out.println("Ejercicio 3");
					prueba.ejercicio3();
					System.out.println();
					break;
				case 4:
					System.exit(0);
				case 5:
					default:
						break;
			}
		}
	}
}
