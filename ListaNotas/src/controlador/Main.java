package controlador;

import modelo.ListaNotas;
import vista.VentanaAgregar;
import vista.VentanaEditar;
import vista.VentanaPrincipal;

public class Main {
	public static void main(String[] args) {
		new Main().iniciar();
	}
	
	private void iniciar() {
		VentanaPrincipal ventanaPrincipal=new VentanaPrincipal();
		VentanaAgregar ventanaAgregar=new VentanaAgregar();
		VentanaEditar ventanaEditar=new VentanaEditar();
		
		ListaNotas listaNotas=new ListaNotas();
		Coordinador coordinador=new Coordinador();
		
		ventanaPrincipal.setCoordinador(coordinador);
		ventanaAgregar.setCoordinador(coordinador);
		ventanaEditar.setCoordinador(coordinador);
		listaNotas.setCoordinador(coordinador);
		
		coordinador.setVentanaPrincipal(ventanaPrincipal);
		coordinador.setVentanaAgregar(ventanaAgregar);
		coordinador.setVentanaEditar(ventanaEditar);
		coordinador.setListaNotas(listaNotas);
		
		coordinador.iniciarSistema();
	}
}
