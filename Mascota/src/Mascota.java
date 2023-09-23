import java.util.Scanner;
public class Mascota{

    public static Scanner lector;

    public static void main(String[] args) throws Exception {
         try (Scanner lector = new Scanner(System.in)) {
            System.out.println("Ingrese su tipo de residencia:");
            System.out.println("1. Apartamento");
            System.out.println("2. Casa");
            System.out.println("3. Dormitorio");
            int tipoResidencia = lector.nextInt();

            System.out.println("Ingrese la cantidad de horas que pasa en casa durante el día promedio:");
            int Horas = lector.nextInt();
            int categoriaHora = obtenerCategoriaHora(Horas);
            String recomendacion = obtenerRecomendacion(tipoResidencia, categoriaHora);
            System.out.println("La recomendacion de la mascota es: " + recomendacion);
        }
        }

    public static int obtenerCategoriaHora(int horasEnCasa) {
        if (horasEnCasa >= 18) {
            return 2;
        } else if (horasEnCasa >= 10) {
            return 3;
        } else if (horasEnCasa >= 8) {
            return 4;
        } else if (horasEnCasa >= 6) {
            return 1;
        } else {
            return 5;
        }
    }

    public static String obtenerRecomendacion(int tipoResidencia, int categoriaHora) {
        if (tipoResidencia == 2) { 
            if (categoriaHora == 2) {
                return "Cerdo barrigón";
            } else if (categoriaHora == 3) {
                return "Perro";
            } else {
                return "Serpiente";
            }
        } else if (tipoResidencia == 1) { 
            if (categoriaHora >= 3) {
                return "Gato";
            } else {
                return "Hamster";
            }
        } else { 
            if (categoriaHora >= 4) {
                return "Pez";
            } else {
                return "Granja de hormigas";

                lector.close();
            }

            
        }
    }

}






