package proyecto;

import java.util.Random;
import java.util.Scanner;

public class Menu {
	
	private static int width;
	private static Empresa empresa;
	private static Scanner scanner;
	
	public Menu() {
		this.empresa = new Empresa();
		this.scanner = new Scanner(System.in);
	}
	
	public void empezar() throws InterruptedException{
		width=20;
		int opcion=0;
		
		do {
			System.out.println();
			System.out.println(formatoMensaje(width,"Menu"));
			System.out.println("1. Contratar empleado");
			System.out.println("2. Despedir empleado");
			System.out.println("3. Aumentar salario");
			System.out.println("4. Listar empleados");
			System.out.println("5. Salir");
			opcion=(int)validarEntrada("Entero");
			opciones(opcion);
		}while(opcion != 5);
	
	}
	
	private static void opciones(int opcion) throws InterruptedException{
		String nombre;
		int edad;
		double salario;
		switch(opcion) {
			case 1:
				System.out.println(formatoMensaje(35,"Contratación de empleados\n"));
				System.out.println(formatoMensaje(width, "Ingrese los datos del nuevo empleado"));
				
				System.out.print("\nNombre...");
				nombre=(String)validarEntrada("string");
				
				System.out.print("Edad...");
				edad=(int)validarEntrada("entero");
				
				System.out.print("Salario...");
				salario=(double)validarEntrada("double");
				
				
				barraProgreso("Contratando empleado");
				
				Empleado nuevoEmpleado = new Empleado(nombre,edad,salario);
				empresa.contratarEmpleado(nuevoEmpleado);
				break;
			case 2:
				System.out.println(formatoMensaje(35,"Despido de empleados\n"));
				System.out.println(formatoMensaje(width, "Ingrese el nombre del empleado"));
				
				System.out.print("\nNombre...");
				nombre=(String)validarEntrada("string");
				
				barraProgreso("Despiendo empleado");
				
				Empleado empleadoDespedido = new Empleado(nombre);
				empresa.despedirEmpleado(empleadoDespedido);
				break;
			case 3:
				System.out.println(formatoMensaje(35,"Aumento de salario\n"));
				System.out.println(formatoMensaje(width, "Ingrese los datos del empleado"));
				
				System.out.print("Nombre...");
				nombre=(String)validarEntrada("string");
				
				System.out.print("Porcentaje de aumento...");
				salario=(double)validarEntrada("double");
				
				barraProgreso("Aumentando salario del empleado");
				
				Empleado empleado = new Empleado(nombre);
				empresa.aumentarSalario(empleado, salario);
				break;
			case 4:
				System.out.println(formatoMensaje(10,"Lista de empleados"));
				empresa.mostrarEmpleados();
				break;
			case 5:
				System.exit(opcion);
				break;
			default:
				System.out.println("Opción inválida");
		}
	}
	
	private static String formatoMensaje (int width, String s) {
	    return String.format("%-" + width  + "s", String.format("%" + (s.length() + (width - s.length()) / 2) + "s", s));
	}
	
	private static Object validarEntrada(String tipoDato) {
		Object entradaObjeto=null;
		boolean esValido=false;
		
		do {
			String entradaCadena=scanner.nextLine();
			
			switch(tipoDato.toLowerCase()) {
				case "entero":
					try {
						entradaObjeto=Integer.parseInt(entradaCadena);
						esValido=true;
					}catch(NumberFormatException e){
						System.out.println(formatoMensaje(width,"Entrada inválida. Por favor intente de nuevo"));
					}
					break;
				case "string":
					entradaObjeto=entradaCadena;
					esValido=true;
					break;
				case "double":
					try{
						entradaObjeto=Double.parseDouble(entradaCadena);
						esValido=true;
					}catch(NumberFormatException e) {
						System.out.println(formatoMensaje(width,"Entrada inválida. Por favor intente de nuevo"));
					}
					break;
				default:
					System.out.println(formatoMensaje(width,"Tipo de dato inválido, por favor use 'entero', 'string' o 'double'"));
			}
		}while(!esValido);
		return entradaObjeto;
	}
	
	public static void barraProgreso(String mensaje) throws InterruptedException {
		Random random = new Random();
		System.out.println();
		for (int i = 0; i <= 100; i+=10) {
            System.out.print(mensaje+": " + i + "%");
            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("\r");
        }
	}
}
