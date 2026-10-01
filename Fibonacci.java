public class Fibonacci {


    public static int fibonacci(int numero) {

        if (numero == 0) {
            return 0;
        }

        if (numero == 1) {
            return 1;
        }

        return fibonacci(numero - 1) + fibonacci(numero - 2);
    }

    public static void main(String[] args) {

        int numero = 7;

        int resultado = fibonacci(numero);

        System.out.println("El número Fibonacci de " + numero + " es: " + resultado);
    }
}

