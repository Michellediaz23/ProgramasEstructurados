import java.util.Scanner;
public class EnmarcadoFotografias {
    public static void main(String[] args) throws Exception {
        Scanner lector=new Scanner(System.in);

        System.out.print("Inserte la longitud de la fotografía en pulgadas: ");
        Scanner sc;
        double longitud = sc.nextDouble();
        System.out.print("Inserte el ancho de la fotografía en pulgadas: ");
        double ancho = sc.nextDouble();

        System.out.print("Seleccione el tipo de marco (1 para regular, 2 para lujoso): ");
        int tipoMarco = sc.nextInt();

        System.out.print("Seleccione el color del marco (1 para blanco, 2 para otro color): ");
        int colorMarco = sc.nextInt();

        System.out.print("¿usted quiere agregar coronas? (1 para sí, 0 para no): ");
        int agregarCoronas = sc.nextInt();
        int numCoronas = 0;
        if (agregarCoronas == 1) {
            System.out.print("Inserte el número de coronas: ");
            numCoronas = sc.nextInt();
        }
        double costoPorPulgada;
        if (tipoMarco == 1) {
            costoPorPulgada = 0.15;
        } else {
            costoPorPulgada = 0.25;
        }
        double perimetro = 2 * (longitud + ancho);
        double costoMarco = costoPorPulgada * perimetro + 0.1 * perimetro;

        double area = longitud * ancho;
        double costoCarton = 0.02 * area;
        double costoVidrio = 0.07 * area;

        double costoCoronas = numCoronas * 0.35;

        double costoTotal = costoMarco + costoCarton + costoVidrio + costoCoronas;

        System.out.printf("El costo total de enmarcar la fotografía es U$%.2f\n", costoTotal);

        lector. close();
    }
}
