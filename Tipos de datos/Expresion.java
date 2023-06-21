package Clases;

public class Expresion {
	public static void main(String[] args) {
		int resultado = 32 / 4;
		resultado += -16;
		System.out.println("El resultado de la expresión -16 + 32 / 4 es " + resultado);
		
		resultado = 0;
		resultado = 48-7;
		resultado %= 11;
		System.out.println("El resultado de la expresión (48 - 7)% 11 es " + resultado);
		
		resultado = 0;
		resultado = 18+2;
		resultado /= 17 - 12;
		System.out.println("El resultado de la expresión (18 + 2) / (17 - 12)  es " + resultado);
		
		resultado = 0;
		int division = 18/6;
		int multiplicacion = division *3;
		int modulo = 11 % 4;
		int resta = 17 - multiplicacion;
		int suma = resta + modulo;
		resultado = suma;
		System.out.println("El resultado de la expresión 17 - 18 / 6 * 3 + 11% 4 es " + resultado);
	}
}
