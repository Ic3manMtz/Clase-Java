package Clases;

import java.util.Scanner;

public class ConversorSoles {
	private double tasaPesos;
	private double tasaDolares;
	private double tasaQuetzales;
	private Scanner scanner;
	
	public ConversorSoles() {
		this.tasaPesos = 4.7;
		this.tasaDolares = 0.27;
		this.tasaQuetzales = 2.15;
	}
	
	public void menuConversion(double soles) {
		scanner = new Scanner(System.in);
		double cambio = 0.0;
		while(true) {
			System.out.println("Seleccione el tipo de cambio");
			System.out.println("1) Pesos");
			System.out.println("2) Dolares");
			System.out.println("3) Quetzales");
			System.out.println("4) Salir del programa");
			int opt = scanner.nextInt();
			
			switch(opt) {
				case 1:
						cambio = convertirAPesos(soles);
						System.out.println("\n"+soles + " soles son "+cambio+" pesos\n");
						break;
				case 2:
						cambio = convertirADolares(soles);
						System.out.println("\n"+soles + " soles son "+cambio+" dolares\n");
						break;
				case 3:
						cambio = convertirAQuetzales(soles);
						System.out.println("\n"+soles + " soles son "+cambio+" quetzales\n");
						break;
				case 4:	
		                System.exit(0);
				default:
		                System.out.println("Opción inválida");
		                break;
			}
		}
	}
	
	public double convertirAPesos(double soles) {
		return soles*tasaPesos;
	}
	
	public double convertirADolares(double soles) {
		return soles*tasaDolares;
	}
	
	public double convertirAQuetzales(double soles) {
		return soles*tasaQuetzales;
	}
}
