package ejercicios.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	private List<String> nombres;
	
	public Lista() {
		this.nombres=new ArrayList<String>();
	}
	
	public void agregarNombre(String nombre) {
		if(!nombres.contains(nombre)) {
			nombres.add(nombre);
		}
	}
	
	public void mostrarNombres() {
		for(String nombre:nombres) {
			System.out.println(nombre);
		}
	}
}
