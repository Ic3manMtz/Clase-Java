package TareasSemana4;

import java.util.Scanner;

public class ConversorDias {
	private Scanner scanner;

	public ConversorDias() {
		this.scanner=new Scanner(System.in);
	}
	
	public String convertirDia(int dia) {
		switch(dia) {
		case 1:
			return "Lunes";
		case 2:
			return "Martes";
		case 3:
			return "Miercoles";
		case 4:
			return "Jueves";
		case 5:
			return "Viernes";
		case 6:
			return "Sabado";
		case 7:
			return "Domigo";
		default:
			return "Numero inválido";
		}
	}
}
