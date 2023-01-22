import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = generarRandom();
        int numIntentos = 0;
        int[] intentos = new int[5];

        System.out.println("¿Que numero piensas que es?");
        int respuesta = scanner.nextInt();
        intentos[numIntentos] = respuesta;

        while (respuesta != numero) { // LOOP PREGUNTA

            if (respuesta < numero) {
                System.out.println("Mayor a " + respuesta + "!");
            } else {
                System.out.println("Menor a " + respuesta + "!");
            }

            numIntentos++;

            if (numIntentos == 5) {
                System.out.println("Has fallado demasiadas veces");
                System.exit(0);
            }

            respuesta = scanner.nextInt();
            intentos[numIntentos] = respuesta;

        }

        // LO ADIVINA
        System.out.println("Muy bien! \n El numero era: " + numero + "!");
        System.out.println("Has necesitado " + numIntentos + " intentos!");
        System.out.println("Tus respuestas han sido:");

        for(int i = 0; i <= numIntentos; ++i) {
            System.out.println("· " + intentos[i]);
        }
    }

    public static int generarRandom() {
        int randomNum = ThreadLocalRandom.current().nextInt(0, 100);
        System.out.println(randomNum);
        return randomNum;
    }
}