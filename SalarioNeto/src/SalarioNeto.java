import java.text.DecimalFormat;
import java.util.Scanner;

public class SalarioNeto{
    public static void main(String[] args) throws Exception {
        Scanner lector =new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        double salarioMensual = 0.00, salarioAnual, IR, SalarioNeto, Inss, SalarioBruto, porcentajeAntiguedad,
                MontoFinal;
        int antiguedad;

        do {
            System.out.print("Ingrese el salario bruto mensual del empleado: ");
            while (!lector.hasNextDouble()) {
                lector.next();
                System.out.println("Debe ingresar unicamente Numeros");
            }
            salarioMensual = lector.nextDouble();
        } while (salarioMensual <= 0.00);
        do {
            System.out.print("Ingrese los años de antigüedad del empleado: ");
            while (!lector.hasNextInt()) {
                lector.next();
                System.out.println("Debe ingresar unicamente Numeros");
            }
            antiguedad = lector.nextInt();
        } while (antiguedad <= 0);

    
        salarioAnual = salarioMensual * 12;
        porcentajeAntiguedad = calcularPorcentajeAntiguedad(antiguedad);
        SalarioBruto = (salarioAnual * porcentajeAntiguedad) + salarioAnual;
        Inss = SalarioBruto * 0.07;
        SalarioNeto = SalarioBruto - Inss;
        IR = CalcularIR(SalarioNeto);
        MontoFinal = SalarioNeto - IR;

        System.out.println("El IR del empleado es: " + df.format(IR));
        System.out.println("La deduccion del Inss del empleado es: " + df.format(Inss));
        System.out.println("El monto por antiguedad del empleado es:" + df.format(salarioAnual * porcentajeAntiguedad));
        System.out.println("El salario neto anual del empleado es: " + df.format(MontoFinal));
        System.out.println("El salario neto mensual del empleado es: " + df.format(MontoFinal / 12));
        System.out.println("Porcentaje de antiguedad: " + df.format(porcentajeAntiguedad * 100) + "%");

    }


    public static double CalcularIR(double salario) {
        if (salario >= 0.01 && salario <= 100000.00) {
            return .00;
        } else if (salario >= 100000.01 && salario <= 200000.00) {
            return (salario - 100000.00) * 0.15;
        } else if (salario >= 200000.01 && salario <= 350000.00) {
            return 15000.00 + (salario - 200000.00) * 0.20;
        } else if (salario >= 350000.01 && salario <= 500000.00) {
            return 45000.00 + (salario - 350000.00) * 0.25;
        } else if (salario >= 500000.01) {
            return 82500.00 + (salario - 500000.00) * 0.30;
        } else {
            return 0.00;
        }
    }

    public static double calcularPorcentajeAntiguedad(int antiguedad) {
        if (antiguedad == 1) {
            return 0.03;
        } else if (antiguedad >= 2 && antiguedad <= 20) {
            return ((antiguedad * 0.02) + 0.01);
        } else if (antiguedad >= 21 && antiguedad <= 30) {
            return 0.50;
        } else if (antiguedad > 30) {
            return 0.60;
        } else {
            return 0.00;
        }
    }

    lector.close();
}

