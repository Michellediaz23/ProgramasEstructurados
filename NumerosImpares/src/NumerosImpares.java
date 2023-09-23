import java.util.Scanner;
public class NumerosImpares {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        System.out.print("Inserte el primer número: ");
        int num1 = lector.nextInt();
        System.out.print("Inserte el segundo número: ");
        int num2 = lector.nextInt();

        System.out.println("Números impares entre " + num1 + " y " + num2 + ":");
        for (int i = num1; i <= num2; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        int sum = 0;
        for (int i = num1; i <= num2; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("La suma de los números pares entre " + num1 + " y " + num2 + " es: " + sum);
        System.out.println("Números y sus cuadrados entre " + num1 + " y " + num2 + ":");
        for (int i = num1; i <= num2; i++) {
            System.out.println(i + " - " + (i * i));
        }
        int sumSquares = 0;
        for (int i = num1; i <= num2; i++) {
            if (i % 2 != 0) {
                sumSquares += (i * i);
            }
        }
        System.out.println("La suma de los cuadrados de los números impares entre " + num1 + " y " + num2 + " es: " + sumSquares);

        System.out.println("Números perfectos entre " + num1 + " y " + num2 + ":");
        for (int i = num1; i <= num2; i++) {
            if (isPerfect(i)) {
                System.out.println(i);
            }
        }

        
        System.out.println("Números primos entre " + num1 + " y " + num2 + ":");
        for (int i = num1; i <= num2; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            
        
        return true;
    

    }

}


}

}

lector.close();