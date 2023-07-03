package modelo;

public class Empleado {
	private int idEmpleado;
	private String nombre;
	private int edad;
	private double salario;
	private static int contadorEmpleados;
	
	private Empleado() {	
		this.idEmpleado=++Empleado.contadorEmpleados;
	}
	
	public Empleado(String nombre) {
		this.nombre=nombre;
	}
	
	public Empleado(String nombre, int edad, double salario) {
		this();
		this.nombre=nombre;
		this.edad=edad;
		this.salario=salario;
	}
	
	public int getIdEmpleado() {
		return this.idEmpleado;
	}

	public String getNombre() {
		return this.nombre;
	}

	public int getEdad() {
		return this.edad;
	}

	public double getSalario() {
		return this.salario;
	}
	
	public void setSalario(double salario) {
		this.salario=salario;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n idEmpleado=").append(idEmpleado);
		builder.append("\n nombre=").append(nombre);
		builder.append("\n edad=").append(edad);
		builder.append("\n salario=").append(salario);
		return builder.toString();
	}
	
	
}
