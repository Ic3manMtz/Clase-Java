package Clases;

public class Expresion {
	public static void main(String[] args) {
		int resultado = -16 + 32 / 4;
		System.out.println("El resultado de la expresión -16 + 32 / 4 es " + resultado);
		
		resultado = (48 - 7)% 11;
		System.out.println("El resultado de la expresión (48 - 7)% 11 es " + resultado);
		
		resultado = (18 + 2) / (17 - 12);
		System.out.println("El resultado de la expresión (18 + 2) / (17 - 12)  es " + resultado);
		
		resultado = 17 - 18 / 6 * 3 + 11% 4;
		System.out.println("El resultado de la expresión 17 - 18 / 6 * 3 + 11% 4 es " + resultado);
	}
}
