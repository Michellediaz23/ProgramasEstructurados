import java.util.Scanner;

public class CuentaBancaria {
    public static void main(String[] args) throws Exception {
                Scanner lector = new Scanner(System.in);
                int numCuenta, saldoMinimo;
                char tipoCuenta;
                double saldoActual, saldoNuevo;
                
                System.out.print("Ingrese el número de cuenta: ");
                Scanner sc;
                numCuenta = sc.nextInt();
                System.out.print("Ingrese el tipo de cuenta (s para ahorros, c para cheques): ");
                tipoCuenta = sc.next().charAt(0);
                System.out.print("Ingrese el saldo mínimo: ");
                saldoMinimo = sc.nextInt();
                System.out.print("Ingrese el saldo actual: ");
                saldoActual = sc.nextDouble();
                
                if (saldoActual < saldoMinimo) {
                    if (tipoCuenta == 's' || tipoCuenta == 'S') {
                        saldoNuevo = saldoActual - 10;
                        System.out.println("Número de cuenta: " + numCuenta);
                        System.out.println("Tipo de cuenta: Ahorros");
                        System.out.println("Saldo actual: U$" + saldoActual);
                        System.out.println("Saldo nuevo: U$" + saldoNuevo);
                    } else if (tipoCuenta == 'c' || tipoCuenta == 'C') {
                        saldoNuevo = saldoActual - 25;
                        System.out.println("Número de cuenta: " + numCuenta);
                        System.out.println("Tipo de cuenta: Cheques");
                        System.out.println("Saldo actual: U$" + saldoActual);
                        System.out.println("Saldo nuevo: U$" + saldoNuevo);
                    } else {
                        System.out.println("Tipo de cuenta inválido");
                    }
                } else {
                    if (tipoCuenta == 's' || tipoCuenta == 'S') {
                        saldoNuevo = saldoActual * 1.04;
                        System.out.println("Número de cuenta: " + numCuenta);
                        System.out.println("Tipo de cuenta: Ahorros");
                        System.out.println("Saldo actual: U$" + saldoActual);
                        System.out.println("Saldo nuevo: U$" + saldoNuevo);
                    } else if (tipoCuenta == 'c' || tipoCuenta == 'C') {
                        if (saldoActual <= saldoMinimo + 5000) {
                            saldoNuevo = saldoActual * 1.03;
                        } else {
                            saldoNuevo = saldoActual * 1.05;
                        }
                        System.out.println("Número de cuenta: " + numCuenta);
                        System.out.println("Tipo de cuenta: Cheques");
                        System.out.println("Saldo actual: U$" + saldoActual);
                        System.out.println("Saldo nuevo: U$" + saldoNuevo);
                    } else {
                        System.out.println("Tipo de cuenta inválido");
                    }
                }
            }
        }
lector.close();

