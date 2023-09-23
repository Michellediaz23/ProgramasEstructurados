import java.util.Scanner;
public class MasaCorporal{
    public static void main(String[] args) throws Exception  {    
        Scanner lector = new Scanner(System.in);

        System.out.println("Calcula tu grasa corporal");
        System.out.println("Eres hombre o mujer? ");
        System.out.println("Ingresar 'M' si eres hombre o 'F' si eres mujer");
        char sexo = lector.next().charAt(0);

        double PesoCorporal, MedidaCintura, MedidaCadera, MedidaMuñeca, MedidaAntebrazo;
        double GrasaCorporal, PorcentajeGrasaCorporal;

        if (sexo == 'F' || sexo == 'f') {
            System.out.print("Ingrese su peso corporal kg: \n");
            PesoCorporal = lector.nextDouble();
            System.out.print("Ingrese su medida de la muñeca cm:\n ");
            MedidaMuñeca = lector.nextDouble();
            System.out.print("Ingrese su medida de la cintura cm:\n ");
            MedidaCintura = lector.nextDouble();
            System.out.print("Ingrese su medida de la cadera cm: \n");
            MedidaCadera = lector.nextDouble();
            System.out.print("Ingrese su medida del antebrazo cm:\n ");
            MedidaAntebrazo = lector.nextDouble();

            double A1 = (PesoCorporal * 0.732) + 8.987;
            double A2 = MedidaMuñeca / 3.140;
            double A3 = MedidaCintura * 0.157;
            double A4 = MedidaCadera * 0.249;
            double A5 = MedidaAntebrazo * 0.434;
            double B = A1 + A2 - A3 - A4 + A5;
            GrasaCorporal = PesoCorporal - B;
            PorcentajeGrasaCorporal = (GrasaCorporal * 100) / PesoCorporal;

            System.out.println("Porcentaje de grasa corporal:\n " + PorcentajeGrasaCorporal + "%");
        }
        else if (sexo == 'M' || sexo == 'm') {
            System.out.print("Ingrese su peso corporal kg: \n");
            PesoCorporal = lector.nextDouble();
            System.out.print("Ingrese su medida de la cintura cm: \n");
            MedidaCintura = lector.nextDouble();

            double A1 = (PesoCorporal * 1.082) + 94.42;
            double A2 = MedidaCintura * 4.15;
            double B = A1 - A2;
            GrasaCorporal = PesoCorporal - B;
            PorcentajeGrasaCorporal = (GrasaCorporal * 100) / PesoCorporal;

            System.out.println("Porcentaje de grasa corporal : \n" + PorcentajeGrasaCorporal + "%");

        }
        else {
            System.out.println("Opción no válida. Ingresar corectamente 'M' o 'F' ");
        }

        lector.close();
    }
}