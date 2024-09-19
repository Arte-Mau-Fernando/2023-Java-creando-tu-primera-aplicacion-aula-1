public class Decisiones {

    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnPlan = true;
        double notaDeLaPelicula = 8.2;
        String tipoDePlan = "Plus";

        if (fechaDeLanzamiento >= 2022){
            System.out.println("Peliculas más Populares");
        }
        else {
            System.out.println("Peliculas retro que aún vale la pena ver");
        }
        if (incluidoEnPlan && tipoDePlan.equals("Plus")){
            System.out.println("Disfrute de su pelicula");
        }
        else {
            System.out.println("Pelicula no disponible para su plan actual");
        }
    }
}
