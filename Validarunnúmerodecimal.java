import java.util.Scanner;

public class Validarunnúmerodecimal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double numero;

        while (true) {
            System.out.print("Ingresa un número decimal: ");
            if (teclado.hasNextDouble()) {
                numero = teclado.nextDouble();
                break;
            }
            System.out.println("Error: debes ingresar un número.");
            teclado.next();
        }
        System.out.println("Número ingresado: " + numero);
    }
}
