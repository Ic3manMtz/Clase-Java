package controlador;

import java.util.List;

import modelo.ListaNotas;
import modelo.Nota;
import vista.VentanaAgregar;
import vista.VentanaEditar;
import vista.VentanaPrincipal;

public class Coordinador {

	private VentanaPrincipal ventanaPrincipal;
	private VentanaAgregar ventanaAgregar;
	private VentanaEditar ventanaEditar;
	
	private ListaNotas listaNotas;
	
	private Nota nota;
	
	public void setVentanaPrincipal(VentanaPrincipal ventanaPrincipal) {
		this.ventanaPrincipal=ventanaPrincipal;
	}
	
	public void setVentanaAgregar(VentanaAgregar ventanaAgregar) {
		this.ventanaAgregar=ventanaAgregar;
	}
	
	public void setVentanaEditar(VentanaEditar ventanaEditar) {
		this.ventanaEditar=ventanaEditar;
	}

	public void setListaNotas(ListaNotas listaNotas) {
		this.listaNotas=listaNotas;
	}

	public void iniciarSistema() {
		ventanaPrincipal.setVisible(true);		
	}

	public void mostrarVentanaAgregar() {
		ventanaAgregar.setVisible(true);
	}
	
	public void mostrarVentanaEditar() {
		int indice = ventanaPrincipal.getIndice();
		
		if(indice!=-1) {
			Nota editar = listaNotas.getListaNotas().get(indice);
			ventanaEditar.editarNota(editar);
			ventanaEditar.setVisible(true);
		}
	}

	public void agregarNota(Nota newNota) {
		listaNotas.agregarNota(newNota);
		ventanaPrincipal.actualizarLista();
	}

	public List<Nota> getLista() {
		return listaNotas.getListaNotas();
	}

	public void editarNota(Nota notaEditada) {
		int indice = ventanaPrincipal.getIndice();
		
		if(indice!=-1) {
			listaNotas.editarNota(indice, notaEditada);		
			ventanaPrincipal.actualizarLista();
		}
	}

	public void eliminarNota() {
		int indice = ventanaPrincipal.getIndice();
		
		if(indice!=-1) {
			listaNotas.eliminarNota(indice);
			ventanaPrincipal.actualizarLista();
		}
		
	}
}
