import java.util.Scanner;
public class EnvioRosquillas{
    public static void main(String[] args) throws Exception {
        Scanner lector=new Scanner(System.in);
        System.out.print("Ingrese el número total de rosquillas: ");
        Scanner scanner;
        int numRosquillas = scanner.nextInt();

        int numCajas = numRosquillas / 24;
        if (numRosquillas % 24 != 0) {
            numCajas++;
        }
        int numContenedores = numCajas / 75;
        if (numCajas % 75 != 0) {
            numContenedores++;
        }
        int numRosquillasSobrantes = numCajas * 24 - numRosquillas;
        int numCajasSobrantes = numContenedores * 75 - numCajas;
        System.out.println("Número de cajas necesarias: " + numCajas);
        System.out.println("Número de contenedores necesarios: " + numContenedores);

        if (numRosquillasSobrantes > 0) {
            System.out.println("Número de rosquillas sobrantes en la última caja: " + numRosquillasSobrantes);
        }
        if (numCajasSobrantes > 0) {
            System.out.println("Número de cajas sobrantes en el último contenedor: " + numCajasSobrantes);
        }
    }
    }
 
      lector.close();

    

