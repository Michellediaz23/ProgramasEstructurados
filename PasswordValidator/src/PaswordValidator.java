import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PaswordValidator {
    public static void main(String[] args) throws Exception {
        Scanner lector= new Scanner (System.in);
    
        Pattern pattern = Pattern.compile("(?=.*[a-zA-Z])(?=.*\\d).{6,10}");
        String password;
        Scanner scanner;
        do {
            System.out.print("Ingrese su contraseña: ");
            password = scanner.nextLine();

            Matcher matcher = pattern.matcher(password);
            if (!matcher.matches()) {
                System.out.println("La contraseña debe tener entre 6 y 10 caracteres y contener al menos una letra y un dígito.");
            }
        } while (!pattern.matcher(password).matches());

        String confirmPassword;
        do {
            System.out.print("Ingrese su contraseña nuevamente: ");
            confirmPassword = scanner.nextLine();

            if (!confirmPassword.equals(password)) {
                System.out.println("Las contraseñas no coinciden.");
            }
        } while (!confirmPassword.equals(password));

        System.out.println("Contraseña válida.");

        lector.close();
    }
}


        
