import java.util.Scanner;

public class Validarunrangodevalores {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int calificacion;

        while (true) {
            System.out.print("Ingresa una calificación (0-100): ");
            if (teclado.hasNextInt()) {
                calificacion = teclado.nextInt();
                if (calificacion >= 0 && calificacion <= 100) {
                    break;
                }
                System.out.println("La calificación debe estar entre 0 y 100.");
            } else {
                System.out.println("Debes ingresar un número entero.");
                teclado.next();
            }
        }
        System.out.println("Calificación ingresada: " + calificacion);
        teclado.close();
    }
}
