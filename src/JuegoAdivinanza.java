import javax.sound.midi.Soundbank;
import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanza {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroSecreto = new Random().nextInt(100);
        int numeroUsuario = 0;
        int intentos;

        System.out.println(numeroSecreto);
        System.out.println("Ingrsa un numero entero del 0 al 100 para adivinar el numero sercreto");
        for (intentos = 0; intentos < 5; intentos++) {
            numeroUsuario = teclado.nextInt();
            if (numeroUsuario == numeroSecreto){
                System.out.println("Asertastes, ¡Felicidades! El numero Secreto es: " + numeroSecreto);
                break;
            } else if (numeroUsuario < numeroSecreto) {
                System.out.println("El numero ingresado es menor al numero Secreto");
            }
            else {
                System.out.println("El numero ingresado es mayor al numero Secreto");
            }
        }
        if (intentos == 5){
            System.out.println("Lo siento, no lograste acertar el numero Secreto:  " + numeroSecreto);
        }
    }
}
