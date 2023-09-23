import java. util.Scanner;
public class AdivinaElNumero{
public static void main(String[] args) throws Exception {
        Scanner lector=new Scanner(System.in);
         boolean jugarDeNuevo = true;

         
        while (jugarDeNuevo) {
            int numeroAdivinar = (int) (Math.random()*50) + 1;
            int intentos = 0;
            boolean adivinado = false;

            System.out.println("adivina un numero entre 1 y 50.");
        
            while (intentos < 5 && !adivinado) {
                System.out.print("Intento #" + (intentos + 1) + ": ");
                int intento = scanner.nextInt();
                scanner.nextLine();

                if (intento == numeroAdivinar) {
                    System.out.println("¡Felicidades! ¡Adivinaste el número  correcto!");
                    adivinado = true;
                } else if (intento < numeroAdivinar) {
                    System.out.println("numero muy alto Intente de nuevo.");
                } else {
                    System.out.println("numero muy bajo Intente de nuevo.");
                }

                intentos++;
            }

            if (!adivinado) {
                System.out.println("lo lamento ya no tienes intentos. El número correcto  era: " + numeroAdivinar);
            }

            System.out.print("¿usted quiere volver a jugar? (si/no): ");
            String respuesta = scanner.nextLine();

            if (!respuesta.equalsIgnoreCase("s")) {
                jugarDeNuevo = false;
            }
        }

        System.out.println("Gracias por jugar. ¡Hasta pronto!");
        

       lector.close();
    }
}
