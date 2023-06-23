package Clases;

import java.util.Scanner;

public class TestPrecio {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresa el precio para calcularlo con IVA");
		Precio precio = new Precio(scanner.nextDouble());
		
		System.out.println("El precio con IVA es de "+precio.agregarIva());
	}
}
