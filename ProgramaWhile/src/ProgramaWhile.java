import java.util.Scanner;
public class ProgramaWhile{
    public static void main(String[] args) throws Exception {
        Scanner lector=new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        Scanner sc;
        int num1 = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = sc.nextInt();
        int i = num1;
        int sumaPares = 0;
        int sumaImparesCuadrados = 0;
        while (i <= num2) {
            if (i % 2 != 0) {
                System.out.println("Número impar: " + i);
                sumaImparesCuadrados = i * i;
            } else {
                System.out.println("Número par: " + i);
                sumaPares += i;
            }
            System.out.println("Cuadrado: " + i * i);
            if (esPerfecto(i)) {
                System.out.println("Número perfecto: " + i);
            }
            if (esPrimo(i)) {
                System.out.println("Número primo: " + i);
            }
            i++;
        }
        System.out.println("Suma de los números pares: " + sumaPares);
        System.out.println("Suma de los cuadrados de los números impares: " + sumaImparesCuadrados);
    }

    public static boolean esPerfecto(int num) {
        int suma = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                suma += i;
            }
        }
        return suma == num;
    }

    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;


       lector.close();
    }


 }


 
        