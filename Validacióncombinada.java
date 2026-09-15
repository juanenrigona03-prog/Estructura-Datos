import java.util.Scanner;
public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);
int numero;

while (true) {
  System.out.print("Ingresa un número entero (1-10): ");
  if (teclado.hasNextInt()) {
    numero = teclado.nextInt();
    if (numero >= 1 && numero <= 10) {
      break;
    }
    System.out.println("El número debe estar entre 1 y 10.");
  } else {
    System.out.println("Debes ingresar un número entero.");
    teclado.next();
  }
}
System.out.println("Número válido: " + numero);
teclado.close();
}