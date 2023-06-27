package TareasSemana4;

import java.util.Scanner;

public class EjerciciosFor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("Seleccione una de las siguiente opciones:");
			System.out.println("1) Mostrar tabla del 7");
			System.out.println("2) Mostrar los números pares del 1 al 30");
			System.out.println("3) Suma de los primeros 100 número naturales");
			System.out.println("4) Cerrar el programa");
			int opt = scanner.nextInt();
			
			switch(opt) {
				case 1:
					int N = 7;
					System.out.println("Tabla del 7 con un For");
					for(int i=0;i<=10;i++) {
						int multiplicacion = i*N;
			            System.out.println(N+" x "+i+" = "+multiplicacion);
					}
					System.out.println("");
					break;
				case 2:
					System.out.println("\nNúmeros pares del 1 al 30");
					for(int i=1;i<30;i++) {
						if(i%2==0) {
							System.out.println(i);
						}
					}
					System.out.println("");
					break;
				case 3:
					System.out.print("\nLos primeros 100 números naturales son de 1 al 100 ");
					int suma=0;
					for(int i=1;i<=100;i++) {
						suma+=i;
					}
					System.out.println("y la suma de todos es: "+suma+"\n");
					break;
				case 4:
					System.exit(0);
				case 5:
					default:
						break;
			}
		}
	}
}
