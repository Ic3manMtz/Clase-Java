package ejercicio2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lista {
	private List<String> lista;
	private Set<String> listaSinDuplicados;
	
	public Lista() {
		this.lista=new ArrayList<String>();
	}
	
	public void agregarCadena(String cadena) {
		this.lista.add(cadena);
	}
	
	public void mostrarLista() {
		for(String cadena:lista) {
			System.out.print(cadena+" ");
		}
	}
	
	public void eliminarDuplicados() {
		listaSinDuplicados = new HashSet<>(lista);	
	}
	
	public void mostrarListaSinDuplicados() {
		for(String cadena:listaSinDuplicados) {
			System.out.print(cadena+" ");
		}
	}
}
