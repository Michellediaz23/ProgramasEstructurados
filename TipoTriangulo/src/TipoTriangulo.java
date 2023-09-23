import java.util.Scanner;
public class TipoTriangulo {
    public static void main(String[] args) throws Exception{

        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese la longitud del primer lado: ");
        double lado1 = lector.nextDouble();
        System.out.print("Ingrese la longitud del segundo lado: ");
        double lado2 = lector.nextDouble();
        System.out.print("Ingrese la longitud del tercer lado: ");
        double lado3 = lector.nextDouble();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("El triángulo es equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("El triángulo es isósceles.");
            } else {
                System.out.println("El triángulo es escaleno.");
            }
            if (lado1 * lado1 + lado2 * lado2 == lado3 * lado3 || lado1 * lado1 + lado3 * lado3 == lado2 * lado2
                    || lado2 * lado2 + lado3 * lado3 == lado1 * lado1) {
                System.out.println("El triángulo es rectángulo.");
            }
        } else {
            System.out.println("Los lados ingresados no forman un triángulo.");


            lector.close();
        }
    }
}

