public class recogerstringalreves {
    public static String alReves(String texto) {

        if (texto.length() == 0) {
            return "";
        }

        return alReves(texto.substring(1)) + texto.charAt(0);
    }

    public static void main(String[] args) {

        String texto = "Hola";

        String resultado = alReves(texto);

        System.out.println("Texto original: " + texto);
        System.out.println("Texto al revés: " + resultado);
    }
}
