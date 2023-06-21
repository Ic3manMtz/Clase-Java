package Clases;

import java.util.Scanner;

public class Producto {
	private int entero1;
	private int entero2;
	private int entero3;
	
	public void setEntero1(int entero1) {
		this.entero1 = entero1;
	}
	public void setEntero2(int entero2) {
		this.entero2 = entero2;
	}
	public void setEntero3(int entero3) {
		this.entero3 = entero3;
	}
	
	public int getEntero1() {
		return entero1;
	}
	public int getEntero2() {
		return entero2;
	}
	public int getEntero3() {
		return entero3;
	}
	public int multiplicar() {
		return entero1 * entero2 * entero3;
	}
	
	public static void main(String[] args) {
		Producto producto = new Producto();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingrese el primer entero");
		producto.setEntero1(Integer.parseInt(input.nextLine()));
		
		System.out.println("Ingrese el segundo entero");
		producto.setEntero2(Integer.parseInt(input.nextLine()));
		
		System.out.println("Ingrese el tercer entero");
		producto.setEntero3(Integer.parseInt(input.nextLine()));
		
		
		System.out.println("El producto es " + producto.multiplicar());
	}
}
