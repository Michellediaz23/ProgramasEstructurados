import java.util.Scanner;
public class SueldoEmpleado {
    public static void main(String[] args) throws Exception {
        Scanner lector= new Scanner(System.in);
        int numEmpleados = 3;
        double tarifaNormal = 100.0;
        double tarifaExtra = 150.0;

        for (int i = 1; i <= numEmpleados; i++) {
            System.out.println("Empleado " + i);
            System.out.print("Horas trabajadas: ");
            Scanner entrada;
            double horasTrabajadas = entrada.nextDouble();
            System.out.print("Tarifa por hora: ");
            double tarifaHora = entrada.nextDouble();

            double sueldoBruto;
            if (horasTrabajadas <= 40) {
                sueldoBruto = horasTrabajadas * tarifaHora;
            } else {
                double horasExtra = horasTrabajadas - 40;
                sueldoBruto = 40 * tarifaHora + horasExtra * tarifaExtra;
            }

            System.out.println("Sueldo bruto: " + sueldoBruto + " córdobas");
     
     
            
        }

         lector.close();

    }
}
        

