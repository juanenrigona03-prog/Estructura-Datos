import java.util.Scanner;

public class Validaunnúmeroentero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        while (true) {
            System.out.print("Ingresa un número entero: ");
            if (teclado.hasNextInt()) {
                numero = teclado.nextInt();
                break;
            }
            System.out.println("Error: debes ingresar un número entero.");
            teclado.next(); // Descarta la entrada incorrecta
        }

        System.out.println("Número ingresado: " + numero);
    }
}

