import java.util.Scanner;


public class calculadora {

    // Método para sumar
    public static double sumar(double a, double b) {
        return a + b;
    }

    // Método para restar
    public static double restar(double a, double b) {
        return a - b;
    }

    // Método para multiplicar
    public static double multiplicar(double a, double b) {
        return a * b;
    }

    // Método para dividir
    public static double dividir(double a, double b) {
        return a / b;
    }

    // Método para ejecutar la calculadora
    public static void ejecutar() {
        try (Scanner teclado = new Scanner(System.in)) {

            System.out.print("Ingresa el primer número: ");
            double num1 = teclado.nextDouble();

            System.out.print("Ingresa el segundo número: ");
            double num2 = teclado.nextDouble();

            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");

            System.out.print("Elige una opción: ");
            int opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Resultado: " + sumar(num1, num2));
                    break;

                case 2:
                    System.out.println("Resultado: " + restar(num1, num2));
                    break;

                case 3:
                    System.out.println("Resultado: " + multiplicar(num1, num2));
                    break;

                case 4:
                    if (num2 != 0) {
                        System.out.println("Resultado: " + dividir(num1, num2));
                    } else {
                        System.out.println("No se puede dividir entre cero");
                    }
                    break;

                default:
                    System.out.println("Opción incorrecta");
            }
        }
    }

    public static void main(String[] args) {
        ejecutar();
    }
}


