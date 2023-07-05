package ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Contenedor {
	private List<Persona> personas;
	
	public Contenedor() {
		this.personas=new ArrayList<>();
	}
	
	public void agregarElemento(Persona elemento) {
		personas.add(elemento);
	}
	
	@Override
	public String toString() {
		return personas.toString();
	}
	
	public void filtrarMayores30() {
		personas.stream().filter(persona->persona.getEdad()<30).forEach(elemento -> System.out.print(elemento+" "));
	}
}
