import java.util.Scanner;
public class FacturaCablee {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        int numCuenta, numCanales, numConexiones;
        double importeFacturacion;
        String codigoCliente;

        System.out.print("Inserte el número de cuenta del cliente: ");
        Scanner sc;
        numCuenta = sc.nextInt();

        System.out.print("Inserte el código de cliente (R o r para residencial, N o n para negocios): ");
        codigoCliente = sc.next();

        if (codigoCliente.equalsIgnoreCase("R")) {
            importeFacturacion = 4.50 + 20.50;
            System.out.print("Inserte el número de canales Premium: ");
            numCanales = sc.nextInt();
            importeFacturacion += numCanales * 7.50;
        } else if (codigoCliente.equalsIgnoreCase("N")) {
            importeFacturacion = 15.00 + 75.00;
            System.out.print("Inserte el número de conexiones de servicio básico: ");
            numConexiones = sc.nextInt();
            if (numConexiones > 10) {
                importeFacturacion += (numConexiones - 10) * 5.00;
            }
            System.out.print("Inserte el número de canales Premium: ");
            numCanales = sc.nextInt();
            importeFacturacion += numCanales * 50.00;
        } else {
            System.out.println("Código de cliente inválido.");
            return;
        }

        System.out.println("Número de cuenta: " + numCuenta);
        System.out.printf("Importe de facturación: C$%.2f\n", importeFacturacion);

         lector.close();
    }

}



