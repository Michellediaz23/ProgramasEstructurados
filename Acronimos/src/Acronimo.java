import java.util.Scanner;
public class Acronimo {
    public static void main(String[] args) throws Exception {
    Scanner lector= new Scanner(System.in);
        
    System.out.println("Ingrese tres palabras:");
        String palabras = lector.nextLine();
        String[] palabrasSeparadas = palabras.split(" ");
        String acronimo = "";
        for (String palabra : palabrasSeparadas) {
            acronimo += palabra.charAt(0);
        }
        acronimo = acronimo.toUpperCase();
        System.out.println("El acrónimo es: " + acronimo);

        lector.close();
    }


}


