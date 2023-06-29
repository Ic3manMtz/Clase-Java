package TareasSemana4;

import java.util.Scanner;

public class TestEjerciciosSwitch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opc;
		
		while(true) {
			System.out.println("\nSelecciona alguna de las opciones");
			System.out.println("1. Convertir un día de la semana");
			System.out.println("2. Calculadora");
			System.out.println("3. Menu Comida");
			System.out.println("4: Salir");
			opc = scanner.nextInt();
			
			switch(opc) {
			case 1:
				ConversorDias conversor = new ConversorDias();
				System.out.print("Ingrese el número del día...");
				int dia = scanner.nextInt();
				System.out.println("\n\t"+conversor.convertirDia(dia)+" es el dia de la semana");
				break;
			case 2:
				Calculadora calculadora = new Calculadora();
				calculadora.menu();
				break;
			case 3:
				Comidas comidas = new Comidas();
				comidas.menu();
				break;
			case 4:
				System.exit(opc);
			default:
				System.out.println("Opción inválida");
			}
		}
	}
}
