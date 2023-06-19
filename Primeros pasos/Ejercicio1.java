import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("Seleccione la conversión que desea realizar:");
            System.out.println("1. Celsius a Fahrenheit");
            System.out.println("2. Fahrenheit a Celsius");
            System.out.println("3. Salir");
            System.out.print("Ingrese el número de la conversión: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la temperatura en Celsius: ");
                    double temperaturaCelsius = scanner.nextDouble();
                    double resultadoFahrenheit = celsiusAFahrenheit(temperaturaCelsius);
                    System.out.println("Temperatura en Fahrenheit: " + resultadoFahrenheit);
                    break;
                case 2:
                    System.out.print("Ingrese la temperatura en Fahrenheit: ");
                    double temperaturaFahrenheit = scanner.nextDouble();
                    double resultadoCelsius = fahrenheitACelsius(temperaturaFahrenheit);
                    System.out.println("Temperatura en Celsius: " + resultadoCelsius);
                    break;
                case 3:
                    salir = true;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
            System.out.println();
        }
    }

    public static double celsiusAFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
