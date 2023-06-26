package Semana4;

import java.util.Scanner;

public class TestVerificarNumero {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un número...");
		
		VerificarNumero verificar = new VerificarNumero(scanner.nextDouble());
		
		if(verificar.esPositivo()) {
			System.out.println("El numero es positivo");
		}else if(verificar.esNegativo()) {
			System.out.println("El numero es negativo");
		}else if(verificar.esCero()) {
			System.out.println("El numero es cero");
		}
	}
}
