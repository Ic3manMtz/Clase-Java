package Clases;

import java.util.Scanner;

public class ConversorQuetzales {
	private double tasaSoles;
	private double tasaPesos;
	private double tasaDolares;
	private Scanner scanner;
	
	public ConversorQuetzales() {
		this.tasaSoles = 0.46;
		this.tasaPesos = 2.19;
		this.tasaDolares = 0.13;
	}
	
	public void menuConversion(double quetzales) {
		scanner = new Scanner(System.in);
		double cambio = 0.0;
		while(true) {
			System.out.println("Seleccione el tipo de cambio");
			System.out.println("1) Soles");
			System.out.println("2) Pesos");
			System.out.println("3) Dolares");
			System.out.println("4) Salir del programa");
			int opt = scanner.nextInt();
			
			switch(opt) {
				case 1:
						cambio = convertirASoles(quetzales);
						System.out.println("\n"+quetzales + " quetzales son "+cambio+" soles\n");
						break;
				case 2:
						cambio = convertirAPesos(quetzales);
						System.out.println("\n"+quetzales + " quetzales son "+cambio+" pesos\n");
						break;
				case 3:
						cambio = convertirADolares(quetzales);
						System.out.println("\n"+quetzales + " quetzales son "+cambio+" dolares\n");
						break;
				case 4:	
		                System.exit(0);
				default:
		                System.out.println("Opción inválida");
		                break;
			}
		}
	}
	
	public double convertirASoles(double quetzales) {
		return quetzales*tasaSoles;
	}
	
	public double convertirAPesos(double quetzales) {
		return quetzales*tasaPesos;
	}
	
	public double convertirADolares(double quetzales) {
		return quetzales*tasaDolares;
	}
}
