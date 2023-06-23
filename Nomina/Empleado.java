package Nomina;

public class Empleado {
	private String nombre;
	private String puesto;
	private int horasNormales;
	private int horasExtra;
	
	public Empleado() {
		
	}
	
	public Empleado(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	
	public int getHorasNormales() {
		return horasNormales;
	}

	public void setHorasNormales(int horasNormales) {
		this.horasNormales = horasNormales;
	}

	public int getHorasExtra() {
		return horasExtra;
	}

	public void setHorasExtra(int horasExtra) {
		this.horasExtra = horasExtra;
	}
}
