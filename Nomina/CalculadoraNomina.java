package Nomina;

import java.util.Scanner;

public class CalculadoraNomina {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese el nombre del empleado...");
		Empleado empleado = new Empleado(scanner.nextLine());
		
		System.out.print("Ingrese el puesto del empleado...");
		empleado.setPuesto(scanner.nextLine());
		System.out.print("Ingrese las horas de trabajo normal del empleado...");
		empleado.setHorasNormales(scanner.nextInt());
		
		System.out.print("Ingrese las horas extras del empleado...");
		empleado.setHorasExtra(scanner.nextInt());
		
		Sueldo sueldo = new Sueldo();
		System.out.print("Tu sueldo bruto es: ");
		System.err.println(sueldo.mostrarSueldoBruto(empleado.getHorasNormales(),empleado.getHorasExtra()));
		
		System.out.print("Tu sueldo neto es: ");
		System.err.println(sueldo.mostrarSueldoNeto(empleado.getHorasNormales(),empleado.getHorasExtra()));
	}
}
