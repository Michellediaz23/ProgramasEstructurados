import java.util.Scanner;
public class SepararDigitos {      
    public static void main(String[] args) throws Exception {
      Scanner lector= new Scanner(System.in);
       
       System.out.print("Inserte un número entero: ");
        Scanner sc;
        int num = sc.nextInt();
        String numStr = Integer.toString(num);
        int suma = 0;
        
        for (int i = 0; i < numStr.length(); i++) {
            char c = numStr.charAt(i);
            int digito = Character.getNumericValue(c);
            System.out.print(digito + " ");
            suma += digito;
        }
        System.out.println("\nLa suma de los dígitos es: " + suma);
    }



}
  
lector.close();