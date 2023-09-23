import java.util.Scanner;
public class LimiteCredito {
    public static void main(String[] args) throws Exception {
        Scanner lector =new Scanner(System.in);
   int cuenta, saldoInicial, cargos, creditos, limiteCredito, nuevoSaldo;
        
        System.out.print("Ingrese el número de cuenta: ");
        Scanner input;
        cuenta = input.nextInt();
        System.out.print("Ingrese el saldo inicial: ");
        saldoInicial = input.nextInt();
        System.out.print("Ingrese el total de cargos: ");
        cargos = input.nextInt();
        System.out.print("Ingrese el total de créditos: ");
        creditos = input.nextInt();
        System.out.print("Ingrese el límite de crédito permitido: ");
        limiteCredito = input.nextInt();
        
        nuevoSaldo = saldoInicial + cargos - creditos;
        System.out.printf("El nuevo saldo es: %d\n", nuevoSaldo);
        
        if (nuevoSaldo > limiteCredito) {
            System.out.println("Se excedió el límite de su crédito");
        }
    }
}
    }
}
