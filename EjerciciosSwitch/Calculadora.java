package TareasSemana4;

import java.util.Scanner;

public class Calculadora {
	private double primerOperando;
	private double segundoOperando;
	private Scanner scanner;
	
	public Calculadora() {
		this.scanner=new Scanner(System.in);		
	}

	public double getPrimerOperando() {
		return primerOperando;
	}

	public void setPrimerOperando(double primerOperando) {
		this.primerOperando = primerOperando;
	}

	public double getSegundoOperando() {
		return segundoOperando;
	}

	public void setSegundoOperando(double segundoOperando) {
		this.segundoOperando = segundoOperando;
	}

	public void menu() {
		int opc;
		while(true) {
			System.out.println("\nSelecciona alguna de las opciones");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicacion");
			System.out.println("4. Division");
			System.out.println("5. Salir");
			opc = scanner.nextInt();
			
			switch(opc) {
			case 1:
				System.out.print("Ingresa el valor del primer sumando...");
				this.primerOperando = scanner.nextDouble();
				
				System.out.print("Ingresa el valor del segundo sumando...");
				this.segundoOperando = scanner.nextDouble();
				sumar();
				break;
			case 2:
				System.out.print("Ingresa el valor del minuendo...");
				this.primerOperando = scanner.nextDouble();
				
				System.out.print("Ingresa el valor del sustraendo...");
				this.segundoOperando = scanner.nextDouble();
				restar();
				break;
			case 3:
				System.out.print("Ingresa el valor del primer factor...");
				this.primerOperando = scanner.nextDouble();
				
				System.out.print("Ingresa el valor del segundo factor...");
				this.segundoOperando = scanner.nextDouble();
				multiplicar();
				break;
			case 4:
				System.out.print("Ingresa el valor del dividendo...");
				this.primerOperando = scanner.nextDouble();
				
				boolean esValido=false;
				do {
					System.out.print("Ingresa el valor del divisor...");
					this.segundoOperando = scanner.nextDouble();
					if(this.segundoOperando!=0) {
						esValido=true;
					}else {
						System.out.println("El valor no puede ser 0. Intente de nuevo");
					}
				}while(!esValido);
				
				dividir();
				break;
			case 5:
				return;
			default:
				System.out.println("\n\tOpción inválida");
			}
		}
	}
	
	private void sumar() {
		double suma=0;
		suma = this.primerOperando + this.segundoOperando;
		System.out.println(" "+this.primerOperando+" + "+this.segundoOperando+" = "+suma);
	}
	
	private void restar() {
		double diferencia=0;
		diferencia = this.primerOperando - this.segundoOperando;
		System.out.println(" "+this.primerOperando+" - "+this.segundoOperando+" = "+diferencia);
	}
	
	private void multiplicar() {
		double producto=0;
		producto = this.primerOperando * this.segundoOperando;
		System.out.println(" "+this.primerOperando+" * "+this.segundoOperando+" = "+producto);
	}
	
	private void dividir() {
		double producto=0;
		producto = this.primerOperando / this.segundoOperando;
		System.out.println(" "+this.primerOperando+" / "+this.segundoOperando+" = "+producto);
	}
}
