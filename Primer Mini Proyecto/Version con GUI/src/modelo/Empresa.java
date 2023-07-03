package modelo;

import java.util.ArrayList;
import java.util.List;

import controlador.Coordinador;

public class Empresa {
	private List<Empleado> empleados;
	private Coordinador coordinador;
	
	public Empresa() {
		this.empleados=new ArrayList<Empleado>();
	}
	
	public List<Empleado> getEmpleados() {
		return this.empleados;
	}
	
	public Empleado buscarEmpleado(Empleado empleado) {
		for(Empleado e : empleados) {
			if(e.getNombre().equals(empleado.getNombre())) {
				return e;
			}
		}
		return null;
	}
	
	public void contratarEmpleado(Empleado empleado) {
		empleados.add(empleado);
	}
	
	public void despedirEmpleado(Empleado empleado) {
		Empleado despedido = buscarEmpleado(empleado);
		if(despedido == null) {
			return;
		}
		empleados.remove(despedido);
	}
	
	private double convertirPorcentaje(double porcentaje) {
		return porcentaje/100;
	}
	
	public void aumentarSalario(Empleado empleado, double porcentaje) {
		Empleado empleadoEncontrado = buscarEmpleado(empleado);
		if(empleadoEncontrado == null) {
			return;
		}
		
		int indice = empleados.indexOf(empleadoEncontrado);
		Empleado empleadoAux = empleados.get(indice);
		
		double salarioAnterior=empleadoAux.getSalario();
		double salarioNuevo=salarioAnterior*(1+convertirPorcentaje(porcentaje));
		
		salarioNuevo=Math.round(salarioNuevo*100);
		salarioNuevo/=100;
				
		empleadoAux.setSalario(salarioNuevo);
	}
	
	public void mostrarEmpleados() {		
		for(int i=0;i<empleados.size();i++) {
			System.out.println(empleados.get(i).toString());
		}
	}
	
	public void setCoordinador(Coordinador coordinador) {
		this.coordinador=coordinador;
	}
}
