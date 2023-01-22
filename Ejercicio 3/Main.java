import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        jugador jugador1, jugador2;
        String nombre;
        int goles;

        // Creamos los jugadores con input
        System.out.print("Nombre J1: ");
        nombre = scanner.next();
        System.out.print("Goles J1: ");
        goles = scanner.nextInt();
        jugador1 = new jugador(nombre, goles);
        System.out.print("Nombre J2: ");
        nombre = scanner.next();
        System.out.print("Goles J2: ");
        goles = scanner.nextInt();
        jugador2 = new jugador(nombre, goles);

        // Imprimir
        jugador1.imprimir();
        jugador2.imprimir();

        // Comparar
        System.out.println("La diferencia de goles es: " + jugador1.diferenciaGoles(jugador2.getGoles()));

    }
}