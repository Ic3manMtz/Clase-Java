package TareasSemana4;

import java.util.*;
import java.util.Scanner;

public class WhileDoWhile {
	private Scanner scanner;
	private List<Integer> numeros;
	
	public WhileDoWhile() {
		this.scanner = new Scanner(System.in);
		this.numeros = new ArrayList<>();
	}
	
	private void mostrarLista() {
		for(int numero : numeros) {
			System.out.print(numero+" ");
		}
	}
	
	public void ejercicio1() {
		int num;
		
		do {
			System.out.println("Ingrese un número para guardar en el arreglo\n\tPara terminar ingrese un número negativo");
			num = scanner.nextInt();
			if(num < 0)
				break;
			numeros.add(num);
		}while(num>0);
		
		System.out.println("Datos ingresados");
		this.mostrarLista();
	}
	
	public void ejercicio2() {
		long numero;
		System.out.print("Ingresa un número entero (de preferencia muy largo)...");
		numero = scanner.nextLong();
		
		long numeroRestante=numero, numeroASumar=0;
		int suma=0;
		while(numeroRestante!=0) {
			numeroASumar=numeroRestante%10;
			suma+=numeroASumar;
			numeroRestante/=10;
		}
		
		System.out.println("La suma de todos los dígitos de "+numero+" es "+suma);
	}
	
	public void ejercicio3() {
		int numero, i=1;
		long factorial=1;
		System.out.print("Ingresa el número...");
		numero=scanner.nextInt();
		
		do {
			factorial*=i++;
		}while(i <= numero);
		
		System.out.println("El factorial de "+numero+" es "+factorial);
	}
}
