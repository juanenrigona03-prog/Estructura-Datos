public class potencia {
    public static int potenciaIterativa(int base, int exponente) {
        int resultado = 1;
        // Calculamos la potencia multiplicando la base por sí misma exponente veces
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }

    public static void main(String[] args) {
        int base = 2;
        int exponente = 3;
        System.out.println(base + " elevado a la " + exponente + " es: " + potenciaIterativa(base, exponente));
    }
}
