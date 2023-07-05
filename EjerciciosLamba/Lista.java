package ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Lista<T> {
	private List<T> numeros;
		
	public Lista() {
		this.numeros=new ArrayList<>();
	}
		
	public void agregarNumero(T numero) {
		numeros.add(numero);
	}
		
	public void mostrarNumeros() {
		for(T numero:numeros) {
			System.out.print(numero.toString() + " ");
		}
	}

	public double calcularPromedio() {
		int suma = numeros.stream().mapToInt(number -> Integer.parseInt((String) number)).sum();
		
		int tamaño = numeros.size();
		return suma/tamaño;
	}
}