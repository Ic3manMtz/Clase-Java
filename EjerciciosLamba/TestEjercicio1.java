package ejercicios;

import java.util.Scanner;

public class TestEjercicio1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Contenedor contenedor = new Contenedor();
		
		while(true) {
			Persona nuevaPersona = new Persona();
			System.out.print("Ingrese el nombre de la persona...");
			if(scanner.hasNext()) {
				nuevaPersona.setNombre(scanner.nextLine());
			}
			
			System.out.print("Ingrese la edad de la persona...");
			if(scanner.hasNext()) {
				nuevaPersona.setEdad(scanner.nextLine());
			}
			
			contenedor.agregarElemento(nuevaPersona);
			System.out.println("¿Desea agregar otra persona a la lista? Si/No");
			String respuesta = scanner.nextLine();
			if(respuesta.equalsIgnoreCase("no")) {
				break;
			}
		}
		
		System.out.println("\nElementos dentro del contenedor");
		System.out.println(contenedor.toString());
		
		System.out.println("\n\nContenedor con el filtro 'personas mayores de 30 años'");
		contenedor.filtrarMayores30();
	}
}
