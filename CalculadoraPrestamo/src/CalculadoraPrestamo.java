import java.util.Scanner;
public class CalculadoraPrestamo {
    public static void main(String[] args) throws Exception {
         Scanner lector = new Scanner(System.in);

        System.out.print("Ingresar monto del préstamo: ");
        double montoPrestamo = lector.nextDouble();

        System.out.print("Ingresar tasa de interés anual en porcentaje: ");
        double tasaInteresAnual = lector.nextDouble() /100;

        System.out.print("Ingresar pago mensual: ");
        double pagoMensual = lector.nextDouble();
        
        int meses = 0;
        while (montoPrestamo > 0) {
           
            double interesMensual = (montoPrestamo * tasaInteresAnual) / 12.0;
            if (pagoMensual <= interesMensual) {
                System.out.println("El pago mensual es demasiado bajo. La cantidad del préstamo no se podrá liquidar.");
                break;
            }

            montoPrestamo -= (pagoMensual - interesMensual);
            meses++;

            if (montoPrestamo <= 0) {
                System.out.println("Se liquida el préstamo en " + meses + " meses.");
            }

            lector.close();
        }
    }
}


