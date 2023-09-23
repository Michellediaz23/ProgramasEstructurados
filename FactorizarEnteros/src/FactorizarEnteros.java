import java.util.Scanner;
public class FactorizarEnteros {
    public static void main(String[] args) throws Exception  {
        try (Scanner lector = new Scanner(System.in)) {
            System.out.print("Ingrese un número entero positivo: ");
            int n = lector.nextInt();
            
            if (n <= 0) {
                System.out.println("Por favor, ingrese un número entero positivo.");
                return;
            }
            
            System.out.println("Los factores primos de " + n + " son:");
            calcularPosibleFactores(n);
        }
    }
    
    public static void calcularPosibleFactores(int n) {
        int divisor = 2;
        
        while (n > 1) {
            if (n % divisor == 0) {
                System.out.println(divisor);
                n /= divisor;
            } 
            else
            {
                divisor++;
            }

            
        }
        
        lector.close();
    }

}
