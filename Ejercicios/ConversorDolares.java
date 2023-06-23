package Clases;

import java.util.Scanner;

public class ConversorDolares {
	private double tasaSoles;
	private double tasaPesos;
	private double tasaQuetzales;
	private Scanner scanner;
	
	public ConversorDolares() {
		this.tasaSoles = 3.62;
		this.tasaPesos = 17.19;
		this.tasaQuetzales = 7.83;
	}
	
	public void menuConversion(double dolares) {
		scanner = new Scanner(System.in);
		double cambio = 0.0;
		while(true) {
			System.out.println("Seleccione el tipo de cambio");
			System.out.println("1) Soles");
			System.out.println("2) Pesos");
			System.out.println("3) Quetzales");
			System.out.println("4) Salir del programa");
			int opt = scanner.nextInt();
			
			switch(opt) {
				case 1:
						cambio = convertirASoles(dolares);
						System.out.println("\n"+dolares + " dolares son "+cambio+" soles\n");
						break;
				case 2:
						cambio = convertirAPesos(dolares);
						System.out.println("\n"+dolares + " dolares son "+cambio+" pesos\n");
						break;
				case 3:
						cambio = convertirAQuetzales(dolares);
						System.out.println("\n"+dolares + " dolares son "+cambio+" quetzales\n");
						break;
				case 4:	
		                System.exit(0);
				default:
		                System.out.println("Opción inválida");
		                break;
			}
		}
	}
	
	public double convertirASoles(double dolares) {
		return dolares*tasaSoles;
	}
	
	public double convertirAPesos(double dolares) {
		return dolares*tasaPesos;
	}
	
	public double convertirAQuetzales(double dolares) {
		return dolares*tasaQuetzales;
	}
}
