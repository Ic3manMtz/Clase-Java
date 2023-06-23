package Clases;

import java.util.Scanner;

public class ConversorPesos {
	private double tasaSoles;
	private double tasaQuetzales;
	private double tasaDolares;
	private Scanner scanner;
	
	public ConversorPesos() {
		this.tasaSoles = 0.21;
		this.tasaQuetzales = 0.46;
		this.tasaDolares = 0.058;
	}
	
	public void menuConversion(double pesos) {
		scanner = new Scanner(System.in);
		double cambio = 0.0;
		while(true) {
			System.out.println("Seleccione el tipo de cambio");
			System.out.println("1) Soles");
			System.out.println("2) Quetzales");
			System.out.println("3) Dolares");
			System.out.println("4) Salir del programa");
			int opt = scanner.nextInt();
			
			switch(opt) {
				case 1:
						cambio = convertirASoles(pesos);
						System.out.println("\n"+pesos + " pesos son "+cambio+" soles\n");
						break;
				case 2:
						cambio = convertirAQuetzales(pesos);
						System.out.println("\n"+pesos + " pesos son "+cambio+" quetzales\n");
						break;
				case 3:
						cambio = convertirADolares(pesos);
						System.out.println("\n"+pesos + " pesos son "+cambio+" dolares\n");
						break;
				case 4:	
		                System.exit(0);
				default:
		                System.out.println("Opción inválida");
		                break;
			}
		}
	}
	
	public double convertirASoles(double pesos) {
		return pesos*tasaSoles;
	}
	
	public double convertirAQuetzales(double pesos) {
		return pesos*tasaQuetzales;
	}
	
	public double convertirADolares(double pesos) {
		return pesos*tasaDolares;
	}
}
