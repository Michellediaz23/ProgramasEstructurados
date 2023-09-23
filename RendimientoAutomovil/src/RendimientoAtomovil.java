import java.util.Scanner;

public class RendimientoAtomovil {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        int km, litros, totalKm = 0, totalLitros = 0, viajes = 0;
        double rendimiento;

        System.out.println("Ingrese los kilómetros recorridos y los litros usados en cada viaje:");
        System.out.println("(Para terminar, ingrese 0 en ambos campos)");

        do {
            System.out.print("Kilómetros recorridos: ");
            Scanner sc;
            km = sc.nextInt();
            System.out.print("Litros usados: ");
            litros = sc.nextInt();

            if (km != 0 && litros != 0) {
                rendimiento = (double) km / litros;
                System.out.printf("Rendimiento del viaje: %.2f km/l%n", rendimiento);

                totalKm += km;
                totalLitros += litros;
                viajes++;
            }
        } while (km != 0 && litros != 0);

        if (viajes > 0) {
            rendimiento = (double) totalKm / totalLitros;
            System.out.printf("Rendimiento total: %.2f km/l%n", rendimiento);
        } else {
            System.out.println("No se ingresaron datos de viajes.");
        }
    }
}

  lector.close();
