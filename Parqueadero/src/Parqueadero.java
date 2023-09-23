import java.util.Scanner;
public class Parqueadero{
    public static void main(String[] args) throws Exception {
       Scanner lector= new Scanner(System.in);
        double totalRecibosAyer = 0;

        while (true) {
            System.out.print("Ingrese las horas de estacionamiento (o -1 para salir): ");
            double horas = lector.nextDouble();

            if (horas == -1) {
                break;
            }

            double cargo = calcularCargo(horas);
            System.out.printf("El cargo por estacionamiento es: C$%.2f%n", cargo);

            totalRecibosAyer += cargo;
        }

        System.out.printf("El total de los recibos de ayer es: C$%.2f%n", totalRecibosAyer);
    }

    public static double calcularCargo(double horas) {
        double cargo = 0;

        if (horas <= 3) {
            cargo = 2;
        } else if (horas <= 24) {
            cargo = 2 + 0.5 * Math.ceil(horas - 3);
            if (cargo > 10) {
                cargo = 10;
            }
        } else {
            cargo = 10;
        }

        return cargo;
    }
}


lector.close();
