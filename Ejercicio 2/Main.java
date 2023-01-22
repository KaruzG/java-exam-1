import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        mostrarResultado(calcularGasto(pedirInformacion()));
    }

    private static int[] pedirInformacion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dime cuantos litros has consumido: ");
        int litrosConsumidos = scanner.nextInt();
        System.out.print("Dime cuantos KM has recorrido: ");
        int kmRecorridos = scanner.nextInt();

        return new int[] {litrosConsumidos, kmRecorridos};
    }

    private static int calcularGasto(int[] info) {
        return (info[0]/info[1] * 100);
    }

    private static void mostrarResultado(int gasto) {
        if (gasto < 4) System.out.println("Gastas como un mechero!");
        if (gasto >= 4 && gasto < 6) System.out.println("Poco");
        if (gasto >= 6 && gasto < 8) System.out.println("Normal");
        if (gasto >= 8 && gasto < 10) System.out.println("No lo uses demasiado");
        if (gasto >= 10) System.out.println("Tienes un agujero por ahi!");
    }
}