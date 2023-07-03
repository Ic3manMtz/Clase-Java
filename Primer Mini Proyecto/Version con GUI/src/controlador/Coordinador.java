package controlador;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import modelo.Empleado;
import modelo.Empresa;
import vista.VentanaAumentarSalario;
import vista.VentanaContratar;
import vista.VentanaListar;
import vista.VentanaPrincipal;

public class Coordinador {

	private VentanaPrincipal ventanaPrincipal;
	private VentanaContratar ventanaContratar;
	private VentanaAumentarSalario ventanaAumentarSalario;
	private VentanaListar ventanaListar;
	private Empresa empresa;
	
	public void setVentanaPrincipal(VentanaPrincipal ventanaPrincipal) {
		this.ventanaPrincipal=ventanaPrincipal;
	}

	public void setVentanaContratar(VentanaContratar ventanaContratar) {
		this.ventanaContratar=ventanaContratar;		
	}

	public void setVentanaAumentarSalario(VentanaAumentarSalario ventanaAumentarSalario) {
		this.ventanaAumentarSalario=ventanaAumentarSalario;
	}

	public void setVentanaListar(VentanaListar ventanaListar) {
		this.ventanaListar=ventanaListar;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa=empresa;
	}

	public void iniciarSistema() {
		ventanaPrincipal.setVisible(true);		
	}
	
	public void mostrarVentanaContratar() {
		ventanaContratar.setVisible(true);
	}
	
	
	public void mostrarVentanaAumentaSalario(Empleado empleado) {
		ventanaAumentarSalario.setEmpleado(empleado);
		ventanaAumentarSalario.setVisible(true);
	}

	public void actualizarTabla() {
		ventanaPrincipal.llenarTabla();
	}

	public Empleado buscarEmpleado(Empleado empleado) {
		return empresa.buscarEmpleado(empleado);
	}

	public List<Empleado> getListaEmpleados() {
		return empresa.getEmpleados();
	}

	public void contratarEmpleado(Empleado nuevoEmpleado) {
		if(buscarEmpleado(nuevoEmpleado)==null){
			empresa.contratarEmpleado(nuevoEmpleado);		
			JOptionPane.showMessageDialog(null, "Empleado contratado!");
			actualizarTabla();
		}else {
			JOptionPane.showMessageDialog(null, "El empleado ya está contratado");
		}
	}

	public void despedirEmpleado(Empleado empleado) {
		if(buscarEmpleado(empleado)!=null) {
			empresa.despedirEmpleado(empleado);
			JOptionPane.showMessageDialog(null, "Empleado despedido!");
		}else {
			JOptionPane.showMessageDialog(null, "El empleado no existe");
		}
		
	}

	public void aumentarSalario(Empleado empleado, double porcentajeAumento) {
		empresa.aumentarSalario(empleado, porcentajeAumento);
		JOptionPane.showMessageDialog(null, "Salario aumentado corractamente!");
		ventanaPrincipal.actualizarSalario();
	}
}
