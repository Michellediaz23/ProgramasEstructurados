import java.util.Scanner;
public class Calendario { 

    public static void main(String[] args) throws Exception {
        Scanner lector=new Scanner(System.in);
        int anio;

        do {
            System.out.print("Ingrese un año entre 1994 y 1999: ");
            Scanner sc;
            anio = sc.nextInt();
        } while (anio < 1994 || anio > 1999); {

        int diasMes[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0)) {
            diasMes[1] = 29; 
        }

        int diaSemana = 0;
        for (int mes = 0; mes < 12; mes++) {
            System.out.println("\n" + (mes + 1) + "/" + anio);
            System.out.println("D  L  M  M  J  V  S");


            for (int i = 0; i < diaSemana; i++) {
                System.out.print("   ");
            }

            for (int dia = 1; dia <= diasMes[mes]; dia++) {
                System.out.printf("%2d ", dia);

         
                if (++diaSemana == 7) {
                    System.out.println();
                    diaSemana = 0;
                }
            }
        }
    }



     
      lector.close();
    }

 }

