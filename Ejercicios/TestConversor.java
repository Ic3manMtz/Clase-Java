package Clases;

import java.util.Scanner;

public class TestConversor {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("Seleccione la moneda que trae a cambiar");
			System.out.println("1) Soles");
			System.out.println("2) Pesos");
			System.out.println("3) Quetzales");
			System.out.println("4) Dolares");
			System.out.println("5) Salir del programa");
			int opt = scanner.nextInt();
			
			switch(opt) {
				case 1:
						ConversorSoles convSoles = new ConversorSoles();
						System.out.println("Cuantos soles deseas cambiar?");
						convSoles.menuConversion(scanner.nextDouble());
						break;
				case 2:
						ConversorPesos convPesos = new ConversorPesos();
						System.out.println("Cuantos pesos deseas cambiar?");
						convPesos.menuConversion(scanner.nextDouble());
						break;
				case 3:
						ConversorQuetzales convQuet = new ConversorQuetzales();
						System.out.println("Cuantos quetzales deseas cambiar?");
						convQuet.menuConversion(scanner.nextDouble());
						break;
				case 4:	
						ConversorDolares conDls = new ConversorDolares();
						System.out.println("Cuantos dolares deseas cambiar?");
						conDls.menuConversion(scanner.nextDouble());
						break;
				 case 5:
		                System.exit(0);
				 default:
		                System.out.println("Opción inválida");
		                break;
			}
		}
	}
}
