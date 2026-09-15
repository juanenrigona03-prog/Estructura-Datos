import java.util.Scanner;
public  static void main(String[] args) {
Scanner teclado = new Scanner(System.in);
String nombre;

System.out.print("Ingresa tu nombre: ");
nombre = teclado.nextLine();

while (nombre.trim().isEmpty()) {
  System.out.println("El nombre no puede estar vacío.");
  System.out.print("Ingresa tu nombre: ");
  nombre = teclado.nextLine();
}
System.out.println("Hola, " + nombre);
teclado.close();
}