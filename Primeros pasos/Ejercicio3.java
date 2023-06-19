import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean repetir = true;

        while (repetir) {
            System.out.print("Ingrese el radio del círculo: ");
            double radio = scanner.nextDouble();

            double area = calcularAreaCirculo(radio);
            System.out.println("El área del círculo es: " + area);

            System.out.print("¿Desea calcular el área de otro círculo? (S/N): ");
            String opcion = scanner.next();

            if (opcion.equalsIgnoreCase("N")) {
                repetir = false;
            }
        }

        System.out.println("Gracias por usar la calculadora de áreas de círculos. ¡Hasta luego!");
    }

    public static double calcularAreaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }
}
