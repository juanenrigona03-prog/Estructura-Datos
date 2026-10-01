public class sumaN {
    public static class SumaRecursiva {
        public static int sumar(int numero) {
            if (numero == 1) {
                return 1;
            }

            return numero + sumar(numero - 1);
        }
    }

    public static void main(String[] args) {
        int numero = 5;
        int resultado = SumaRecursiva.sumar(numero);

        System.out.println("La suma del 1 al " + numero + " es: " + resultado);
    }
}
   


