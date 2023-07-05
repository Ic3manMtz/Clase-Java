package ejercicios.ejercicio2;

import java.util.Arrays;

public class Array {
	private int[] numeros;
	
	public Array() {
		this.numeros= new int[5];
	}
	
	public void agregarNumero(int indice,int numero) {
		this.numeros[indice]=numero;
	}
	
	public void ordenar() {
		Arrays.sort(numeros);
	}
	
	public void mostrar() {
		for(int n:numeros) {
			System.out.print(n+" ");
		}
	}
}
