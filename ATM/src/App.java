public class ATM {
    public static void main(String[] args) throws Exception {
        Scanner lector= new Scanner(System.in);
        System.out.println("Cajero Automatico con cuentas en cordoba y dolares");
        byte n=lector.nextByte();
        double saldoCordobas = 30000.0;
        double saldoDolares= 200.0;


        while(continuar){
            System.out.println("Bienvenido al ATM");
            System.out.println("1. Cuenta en córdobas");
            System.out.println("2. Cuenta en dólares");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción porfavor : ");
            int opcion = scanner.nextInt();


              switch ( MenuDeOpcion) {
                case 1:
                    System.out.println("Cuenta en córdobas");
                    System.out.println("Saldo actual: " + saldoCordobas + " córdobas");
                    System.out.println("1. Retirar");
                    System.out.println("2. Depositar");
                    System.out.print("Seleccione una opción porfavor : ");
                    int opcionCordobas = scanner.nextInt();
                    
                    switch (opcionCordobas) {
                        case 1:
                            System.out.print("inserte la cantidad a retirar: ");
                            double montoRetiroCordobas = scanner.nextDouble();
                            
                            if (montoRetiroCordobas <= saldoCordobas) {
                                saldoCordobas -= montoRetiroCordobas;
                                System.out.println("Retiro correcto. Saldo actual: " + saldoCordobas + " córdobas");
                            } else {
                                System.out.println("No hay saldo en su cuenta en córdobas");
                            }
                            break;
                            
                        case 2:
                            System.out.print("Ingrese la cantidad a depositar: ");
                            double montoDepositoCordobas = scanner.nextDouble();
                            
                            saldoCordobas += montoDepositoCordobas;
                            System.out.println("Deposito ha sido  exitoso. Saldo actual: " + saldoCordobas + " córdobas");
                            break;
                            
                        default:
                            System.out.println("Opción inválida");
                            break
                        case 2:
                            System.out.println("Cuenta en dólares");
                            System.out.println("Saldo actual: " + saldoDolares + " dólares");
                            System.out.println("1. Retirar");
                            System.out.println("2. Depositar");
                            System.out.print("Seleccione una opción porfavor: ");
                            int opcionDolares = scanner.nextInt();
                            
                            switch (opcionDolares) {
                                case 1:
                                    System.out.print("inserte la cantidad  a retirar: ");
                                    double montoRetiroDolares = scanner.nextDouble();
                                    
                                    if (montoRetiroDolares <= saldoDolares) {
                                        saldoDolares -= montoRetiroDolares;
                                        System.out.println("el deposito ha sido exitoso. Saldo actual: " + saldoDolares + " dólares");
                                    } else {
                                        System.out.println("No hay  saldo en su cuenta en dólares");
                                    }
                                    break;
                                    
                                case 2:
                                    System.out.print("Inserte la cantidad a depositar: ");
                                    double montoDepositoDolares = scanner.nextDouble();
                                    
                                    saldoDolares += montoDepositoDolares;
                                    System.out.println("el deposito ha sido existoso .Saldo actual: " + saldoDolares + " dólares");
                                    break;
                                    
                                default:
                                    System.out.println("Opción inválida");
                                    break;
                            }
                            break;
                            
                        case 3:
                            continuar = false;
                            break;
                            
                        default:
                            System.out.println("Opción inválida");
                            break;
                    }
                    break;
            
            if (continuar) {
                System.out.print("¿usted desea seguir usando el ATM? (si/no): ");
                String respuesta = scanner.next();
                
                if (respuesta.equalsIgnoreCase("n")) {
                    continuar = false;
                }
            }
        }
        
        System.out.print("¿usted quiere imprimir el saldo actual en ambas cuentas? (si/no): ");
        String imprimirSaldo = scanner.next();
        
        if (imprimirSaldo.equalsIgnoreCase("s")) {
            System.out.println("Saldo en córdobas: " + saldoCordobas +" córdobas");
        } else {
            System.out.println("Gracias por utilizar el ATM. ¡hasta la proxima!");
        }
    }
}

}

