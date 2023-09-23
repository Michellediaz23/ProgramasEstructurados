import java.util.Scanner;
public class FacturaTelefonica{
    public static void main(String[] args) throws Exception {
        Scanner lector=new Scanner(System.in);
        System.out.print("Inserte el número de cuenta: ");
        int numeroCuenta = input.nextInt();

        System.out.print("Inserte el código de servicio (r/R para regular, p/P para premium): ");
        char codigoServicio = input.next().charAt(0);

        System.out.print("Inserte la cantidad de minutos utilizados: ");
        int minutosUtilizados = input.nextInt();

        double cantidadAPagar = 0;

        if (codigoServicio == 'r' || codigoServicio == 'R') {
            if (minutosUtilizados > 50) {
                cantidadAPagar = 10 + 0.20 * (minutosUtilizados - 50);
            } else {
                cantidadAPagar = 10;
            }
        } else if (codigoServicio == 'p' || codigoServicio == 'P') {
            System.out.print("Inserte la cantidad de minutos que fueron utilizados durante el día: ");
            int minutosDia = input.nextInt();

            System.out.print("Inserte la cantidad de minutos que fueron utilizados durante la noche: ");
            int minutosNoche = input.nextInt();

            if (minutosDia > 75) {
                cantidadAPagar += 25 + 0.10 * (minutosDia - 75);
            } else {
                cantidadAPagar += 25;
            }

            if (minutosNoche > 100) {
                cantidadAPagar += 0.05 * (minutosNoche - 100);
            }
        } else {
            System.out.println("Error: código de servicio inválido.");
            System.exit(0);
        }


        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Tipo de servicio: " + codigoServicio);
        System.out.println("Minutos utilizados: " + minutosUtilizados);
        System.out.println("Cantidad a pagar: $" + cantidadAPagar);
    }
        

       lector.close();
     

   }
   
 }
}

