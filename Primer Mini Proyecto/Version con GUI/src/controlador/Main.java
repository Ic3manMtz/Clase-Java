package controlador;

import modelo.*;
import vista.*;


public class Main {
	public static void main(String[] args) {
		new Main().iniciar();
	}
	
	private void iniciar() {
		//Instancias de las clases que necesito que sean únicas
		VentanaPrincipal ventanaPrincipal=new VentanaPrincipal();
		VentanaContratar ventanaContratar=new VentanaContratar();
		VentanaAumentarSalario ventanaAumentarSalario=new VentanaAumentarSalario();
		VentanaListar ventanaListar=new VentanaListar();
		Empresa empresa=new Empresa();
		Coordinador coordinador=new Coordinador();
		
		//Se establecen las relaciones entre las clases
		ventanaPrincipal.setCoordinador(coordinador);
		ventanaContratar.setCoordinador(coordinador);
		ventanaAumentarSalario.setCoordinador(coordinador);
		ventanaListar.setCoordinador(coordinador);
		empresa.setCoordinador(coordinador);
		
		//Se establecen las relaciones con la clase coordinador
		coordinador.setVentanaPrincipal(ventanaPrincipal);
		coordinador.setVentanaContratar(ventanaContratar);
		coordinador.setVentanaAumentarSalario(ventanaAumentarSalario);
		coordinador.setVentanaListar(ventanaListar);
		coordinador.setEmpresa(empresa);
		
		coordinador.iniciarSistema();
	}
}