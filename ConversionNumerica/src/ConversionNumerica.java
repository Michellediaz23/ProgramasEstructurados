import java.util.Scanner;
public class ConversionNumerica {
    public static void main(String[] args) throws Exception {
                Scanner lector = new Scanner(System.in);
                int baseOrigen, baseDestino, numeroDecimal;
                String numeroOrigen, numeroDestino;
        
                System.out.println("Ingrese la base numérica de origen:");
                System.out.println("1. Binario");
                System.out.println("2. Octal");
                System.out.println("3. Decimal");
                System.out.println("4. Hexadecimal");
                baseOrigen = lector.nextInt();
        
            
                System.out.println("Ingrese la base numérica de destino:");
                System.out.println("1. Binario");
                System.out.println("2. Octal");
                System.out.println("3. Decimal");
                System.out.println("4. Hexadecimal");
                baseDestino = lector.nextInt();
        
            
                System.out.println("Ingrese el número a convertir:");
                numeroOrigen = lector.next();
        
                switch (baseOrigen) {
                    case 1:
                        numeroDecimal = Integer.parseInt(numeroOrigen, 2);
                        System.out.println("Número ingresado en binario: " + numeroOrigen);
                        break;
                    case 2:
                        numeroDecimal = Integer.parseInt(numeroOrigen, 8);
                        System.out.println("Número ingresado en octal: " + numeroOrigen);
                        break;
                    case 3:
                        numeroDecimal = Integer.parseInt(numeroOrigen);
                        System.out.println("Número ingresado en decimal: " + numeroOrigen);
                        break;
                    case 4:
                        numeroDecimal = Integer.parseInt(numeroOrigen, 16);
                        System.out.println("Número ingresado en hexadecimal: " + numeroOrigen);
                        break;
                    default:
                        System.out.println("Opción inválida.");
                        return;
                }

                switch (baseDestino) {
                    case 1:
                        numeroDestino = Integer.toBinaryString(numeroDecimal);
                        System.out.println("Número convertido a binario: " + numeroDestino);
                        break;
                    case 2:
                        numeroDestino = Integer.toOctalString(numeroDecimal);
                        System.out.println("Número convertido a octal: " + numeroDestino);
                        break;
                    case 3:
                        numeroDestino = Integer.toString(numeroDecimal);
                        System.out.println("Número convertido a decimal: " + numeroDestino);
                        break;
                    case 4:
                        numeroDestino = Integer.toHexString(numeroDecimal);
                        System.out.println("Número convertido a hexadecimal: " + numeroDestino);
                        break;
                    default:
                        System.out.println("Opción inválida.");
                        return;

                        lector.close();
                }
  
            }

        }
