package Semana4;

import java.util.Scanner;

public class TestParImpar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese un número para saber si es par o impar");
		VerificarParImpar verificar = new VerificarParImpar(scanner.nextDouble());
		if(verificar.esPar()) {
			System.out.println("El numero es par");
		}else if(verificar.esImpar()) {
			System.out.println("El numero es impar");
		}
	}
}
