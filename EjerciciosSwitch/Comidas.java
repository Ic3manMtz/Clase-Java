package TareasSemana4;

import java.util.Scanner;

public class Comidas {
	private Scanner scanner;

	public Comidas() {
		this.scanner=new Scanner(System.in);
	}
	
	public void menu() {
		int opc;
		while(true) {
			System.out.println("\nSelecciona alguna de las opciones");
			System.out.println("1. Sopa de fideos");
			System.out.println("2. Arroz");
			System.out.println("3. Pollo con mole");
			System.out.println("4. Carne de cerdo entomatada");
			System.out.println("5. Arroz con leche");
			System.out.println("6. Salir");
			opc = scanner.nextInt();
			
			switch(opc) {
			case 1:
				System.out.print("\n\tElegiste la sopa de fideos");
				break;
			case 2:
				System.out.print("\n\tElegiste el arroz");
				break;
			case 3:
				System.out.print("\n\tElegiste el pollo con mole");
				break;
			case 4:
				System.out.print("\n\tElegiste la carne de cerdo entomatada");
				break;
			case 5:
				System.out.println("\n\tElegiste el arroz con leche");
				break;
			case 6:
				return;
			default:
				System.out.println("\n\tOpción inválida");
			}
		}
	}
}
