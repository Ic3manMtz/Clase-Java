package proyecto;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private List<Empleado> empleados;
	
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
		if(buscarEmpleado(empleado) == null) {
			empleados.add(empleado);
			System.out.println("Empleado contratado!");
			return;
		}
		System.out.println("El empleado ya existe");		
	}
	
	public void despedirEmpleado(Empleado empleado) {
		Empleado despedido = buscarEmpleado(empleado);
		if(despedido == null) {
			System.out.println("Empleado inexistente");
			return;
		}
		empleados.remove(despedido);
		System.out.println("Empleado despedido!");
	}
	
	private double convertirPorcentaje(double porcentaje) {
		return porcentaje/100;
	}
	
	public void aumentarSalario(Empleado empleado, double porcentaje) {
		Empleado empleadoEncontrado = buscarEmpleado(empleado);
		if(empleadoEncontrado == null) {
			System.out.println("Empleado inexistente");
			return;
		}
		
		int indice = empleados.indexOf(empleadoEncontrado);
		Empleado empleadoAux = empleados.get(indice);
		
		double salarioAnterior=empleadoAux.getSalario();
		double salarioNuevo=salarioAnterior*(1+convertirPorcentaje(porcentaje));
		
		salarioNuevo=Math.round(salarioNuevo*100);
		salarioNuevo/=100;
				
		empleadoAux.setSalario(salarioNuevo);
		
		System.out.println("Salario aumentado existosamente");
		System.out.println(empleadoAux.toString());
	}
	
	public void mostrarEmpleados() {
		if(empleados.isEmpty()) {
			System.out.println("No hay empleados contratados");
			return;
		}
		for(int i=0;i<empleados.size();i++) {
			System.out.println(empleados.get(i).toString());
		}
	}
}
