package Clases;

import java.util.Scanner;

import PrimerReto.Libro;
import PrimerReto.Usuario;

public class Calculadora {
	private double primerTermino;
	private double segundoTermino;
	
	public Calculadora(double primerTermino, double segundoTermino) {
		super();
		this.primerTermino = primerTermino;
		this.segundoTermino = segundoTermino;
	}

	public void setPrimerTermino(double primerTermino) {
		this.primerTermino = primerTermino;
	}

	public void setSegundoTermino(double segundoTermino) {
		this.segundoTermino = segundoTermino;
	}

	public double getPrimerTermino() {
		return primerTermino;
	}

	public double getSegundoTermino() {
		return segundoTermino;
	}

	public double sumar() {
		return primerTermino + segundoTermino;
	}
	
	public double restar() {
		return primerTermino - segundoTermino;
	}
	
	public double multiplicar() {
		return primerTermino * segundoTermino;
	}
	
	public double dividir() {
		return primerTermino / segundoTermino;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa el valor del primer termino");
		double primerTermino = scanner.nextDouble();
		System.out.println("Ingresa el valor del segundo termino");
		double segundoTermino = scanner.nextDouble();
		
		Calculadora calculadora = new Calculadora(primerTermino, segundoTermino);
		
		while(true) {
            System.out.println("Elige una opción:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            int option = scanner.nextInt();
            
            switch(option) {
	            case 1:
	            	System.out.println("\nLa suma de los terminos "+calculadora.getPrimerTermino()+" y "+calculadora.getSegundoTermino()+" es:");
	            	System.err.println(calculadora.sumar()+"\n");
	            	break;
	            case 2:
	            	System.out.println("\nLa resta de los terminos "+calculadora.getPrimerTermino()+" y "+calculadora.getSegundoTermino()+" es:");
	            	System.err.println(calculadora.restar()+"\n");
	            	break;
	            case 3:
	            	System.out.println("\nLa multiplicacion de los terminos "+calculadora.getPrimerTermino()+" y "+calculadora.getSegundoTermino()+" es:");
	            	System.err.println(calculadora.multiplicar()+"\n");
	            	break;
	            case 4:
	            	while(calculadora.getSegundoTermino() == 0) {
	            		System.err.println("\nEl divisor no puede ser 0, ingrese el segundo termino nuevamente");
	            		double divisor = scanner.nextDouble();
	            		calculadora.setSegundoTermino(divisor);
	            	}
	            	System.out.println("\nLa división de los terminos "+calculadora.getPrimerTermino()+" y "+calculadora.getSegundoTermino()+" es:");
	            	System.err.println(calculadora.dividir()+"\n");
	            	break;
	            case 5:
	                System.exit(0);
	            default:
	                System.err.println("\n\tOpción inválida\n");
	                break;
            }
		}
	}
}
