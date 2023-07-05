package modelo;

import java.util.ArrayList;
import java.util.List;

import controlador.Coordinador;

public class ListaNotas {
	
	private Coordinador coordinador;
	private List<Nota> notas;
	
	public ListaNotas() {
		this.notas=new ArrayList<Nota>();
	}
	
	public List<Nota> getListaNotas() {
		return this.notas;
	}

	public void setCoordinador(Coordinador coordinador2) {
		this.coordinador=coordinador;		
	}

	public void agregarNota(Nota newNota) {
		notas.add(newNota);		
	} 
	
	public void editarNota(int indice, Nota notaEditada) {
		notas.set(indice, notaEditada);
	}

	public void eliminarNota(int indice) {
		notas.remove(indice);		
	}
}
