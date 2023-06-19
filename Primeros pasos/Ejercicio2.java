import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean repetir = true;

        while (repetir) {
            System.out.print("Ingrese la longitud del lado base del rectángulo: ");
            double base = scanner.nextDouble();

            System.out.print("Ingrese la longitud del lado altura del rectángulo: ");
            double altura = scanner.nextDouble();

            double area = calcularAreaRectangulo(base, altura);
            System.out.println("El área del rectángulo es: " + area);

            System.out.print("¿Desea calcular el área de otro rectángulo? (S/N): ");
            String opcion = scanner.next();

            if (opcion.equalsIgnoreCase("N")) {
                repetir = false;
            }
        }
        
        System.out.println("Gracias por usar la calculadora de áreas de rectángulos. ¡Hasta luego!");
    }

    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }
}
