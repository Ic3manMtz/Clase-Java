package ejercicios;

public class Persona<T> {
	private T nombre;
	private T edad;
	
	public Persona() {
		
	}
	
	public Persona(T nombre, T edad) {
		this.nombre=nombre;
		this.edad=edad;
	}

	public String getNombre() {
		return this.nombre.toString();
	}

	public void setNombre(T nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return Integer.parseInt((String) this.edad);
	}

	public void setEdad(T edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(" Nombre=").append(nombre);
		builder.append(", edad=").append(edad);
		return builder.toString();
	}
	
	
}
