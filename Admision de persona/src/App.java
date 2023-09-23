import java.util.Scanner;
public class admisiondePersona{

 public static void main(String[] args) throws Exception {
    Scanner lector=new Scanner(System.in);

    System.out.print("Edad:");
    byte edad =lector .nextByte();

    System.out.print("sexo (f/m):");
    char sexo= lector .next().charAt(0);
     if (edad < 18) {
            System.out.println("usted es menor de edad no puede entrar.");
        } else if (sexo.equals("F") && edad >= 18) {
            if (edad >= 20) {
                System.out.println("usted puede entrar y consumir bebidas alcohólicas.");
            } else {
                System.out.println("usted puede entrar pero no puedes consumir bebidas alcohólicas.");
            }
        } else if (sexo.equals("M") && edad >= 18) {
            System.out.print("¿usted porta armas? (Si/N0): ");
            String armas = scanner.nextLine().toUpperCase();
            
            if (armas.equals("S")) {
                System.out.println("usted no puedes ingresar al local.");
            } else {
    
            System.out.println("Datos ingresados incorrectos.");
        }
        
            lector.close();
        }
        
         
  }

}
