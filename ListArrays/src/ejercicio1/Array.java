package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Array {
	private List<Integer> numeros;
	
	public Array() {
		this.numeros=new ArrayList<Integer>();
	}
	
	public void agregarNumero(int numero) {
		numeros.add(numero);
	}
	
	public int sumarArray() {
		int suma=0;
		for(int n : numeros) {
			suma+=n;
		}
		
		return suma;
	}
	
	@Override
	public String toString() {
		String salida="";
		
		for(int n : numeros) {
			salida+=n + " ";
		}
		
		return salida;
	}
}
