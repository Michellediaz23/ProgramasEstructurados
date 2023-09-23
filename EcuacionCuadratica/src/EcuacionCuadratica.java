import java.util.Scanner;
public class EcuacionCuadratica {
    public static void main(String[] args) throws Exception {
        Scanner lector=new Scanner(System.in);
        
        System.out.print("Ingrese el valor de a: ");
        Scanner input;
        double a = input.nextDouble();
        System.out.print("Ingrese el valor de b: ");
        double b = input.nextDouble();
        System.out.print("Ingrese el valor de c: ");
        double c = input.nextDouble();
        double discriminante = b * b - 4 * a * c;
       
        if (discriminante > 0) {
            double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Las raíces son " + raiz1 + " y " + raiz2);
        } else if (discriminante == 0) {
            double raiz = -b / (2 * a);
            System.out.println("La raíz es " + raiz);
        } else {
            double parteReal = -b / (2 * a);
            double parteImaginaria = Math.sqrt(-discriminante) / (2 * a);
            System.out.println("Las raíces son " + parteReal + " + " + parteImaginaria + "i y " + parteReal + " - " + parteImaginaria + "i");
        }
    }
}

Lector .close ();
    

