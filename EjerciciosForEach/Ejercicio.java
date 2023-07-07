package ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio {
	private List<Integer> numeros;
	private List<String> palabras;
	private List<String> cadenas;
	
	public Ejercicio() {
		this.numeros=new ArrayList<>();
		this.palabras=new ArrayList<>();
		this.cadenas=new ArrayList<>();
	}
	
	public void agregarNumero(int numero) {
		this.numeros.add(numero);
	}
	
	public void mostrarNumeros() {
		numeros.forEach(numero -> System.out.print(numero + ", "));
	}
	
	public void filtrarNumerosPares() {
		numeros.stream().filter(numero -> numero%2==0).forEach(numero -> System.out.print(numero+", "));
		System.out.println();
	}
	
	public void agregarPalabra(String palabra) {
		this.palabras.add(palabra);
	}
	
	public void mostrarPalabras() {
		palabras.forEach(palabra -> System.out.print(palabra+", "));
	}
	
	public void filtrarPalabras() {
		int count=0;
				
		count = (int) palabras.stream().filter(palabra -> palabra.length()>4).count();
		
		System.out.println("\n\tHay "+count+" palabras con más de 4 caracteres\n");
	}
	
	public void agregarCadena(String cadena) {
		this.cadenas.add(cadena);
	}
	
	public void mostrarCadenas() {
		cadenas.stream().forEach(cadena -> System.out.print(cadena+", "));
	}
	
	public void convertirCadenasAMayusculas() {
		cadenas.stream().map(String::toUpperCase).forEach(nombre -> System.out.print(nombre+", "));
		System.out.println();
	}
}
