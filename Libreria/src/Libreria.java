import java.text.DecimalFormat;
import java.util.Scanner;

public class Libreria {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        int articulo[];
        int cantidad;
        double pagoTotal = 0;

        double valorArticulo, total = 0, porcentajeExtra = 0;
        System.out.println("Ingrese la cantidad de articulos vendidos");

        do {
            while (!lector.hasNextInt()) {
                lector.next();
                System.out.println("Digite nuevamente la cantidad de articulos vendidos");
            }
            cantidad = lector.nextInt();
            articulo = new int[cantidad];
        } while (cantidad <= 0);

        System.out.println("Ingrese el numero del articulo vendido: ");

        for (int i = 0; i < articulo.length; i++) {
            do {
                System.out.println("Ingrese el numero del articulo vendido: " + (i + 1));
                while (!lector.hasNextInt()) {
                    lector.next();
                    System.out.println("Digite nuevamente el articulo");
                }
                articulo[i] = lector.nextInt();
            } while (articulo[i] <= 0 || articulo[i] > 4);
        }

        for (int i = 0; i < articulo.length; i++) {
            while (articulo[i] != 0) {
                if (articulo[i] == 1) {
                    valorArticulo = 239.99;
                    total += valorArticulo;
                    articulo[i] = 0;
                }

                if (articulo[i] == 2) {
                    valorArticulo = 129.75;
                    total += valorArticulo;
                    articulo[i] = 0;
                }
                if (articulo[i] == 3) {
                    valorArticulo = 99.95;
                    total += valorArticulo;
                    articulo[i] = 0;
                }

                if (articulo[i] == 4) {
                    valorArticulo = 350.89;
                    total += valorArticulo;
                    articulo[i] = 0;
                }

            }
        }
        porcentajeExtra = total * 0.09;
        pagoTotal = (200 + porcentajeExtra);
        System.out.println("El total de la venta es: " + df.format(pagoTotal));

        lector.close();
    }

}
    

