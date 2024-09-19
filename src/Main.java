public class Main {
    public static void main(String[] args) {
        //Utilizamos Sout para que nos coloque el esqueleto de "Println"
        System.out.println("Bienvenido(a) a Screen Match");
        System.out.println("Pelicula: Matrix");
        //Tipos de datos primitivos
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnPlan = true;
        double notaDeLaPelicula = 8.2;

        double media = (8.2 + 6.0 + 9.0) / 3;
        System.out.println(media);
        //Prueba del metodo String y concatenamos una variable
        String sinopsis = """
                Mtriz es una paradoja.
                La mejor pelicula del fin del milenio.
                Fué lanzada en: %s
                Calificación: %.1f
                """. formatted(fechaDeLanzamiento, notaDeLaPelicula);
        // %d = numeros enteros %s = para Strings %f = para dooubles se le agrega "." y los decimales que se requieren
        System.out.println(sinopsis);
        int clsifacacion = (int) (media / 2);
        //casteo explisito para convertir a enteros
        System.out.println(clsifacacion);
        //*************************   Practica  ***********************************
        int gradosCelcius = 10;
        float gradosFahrenheit = (float) ((gradosCelcius * 1.8) + 32);
        System.out.println("La conversión de Grados Celcius a Grados Fahrenheit es: " + gradosFahrenheit);
        //¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨ FIN DE LA PRACTICA """""""""""""""""""""""""""""
    }

}