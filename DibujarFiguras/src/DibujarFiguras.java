import java.util.Scanner;

public class DibujarFiguras {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Seleccione la figura geométrica que desea imprimir:");
            System.out.println("1. Triángulo rectángulo");
            System.out.println("2. Triángulo equilátero");
            System.out.println("3. Cuadrado");
            System.out.println("4. Rectángulo");
            System.out.println("5. Paralelogramo");
            System.out.println("6. Rombo");
            System.out.println("7. Círculo");
            System.out.println("8. Trapecio");
            System.out.println("9. Pentágono");
            System.out.println("10. Elipse");
            System.out.println("0. Salir");
            opcion = lector.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la base del triángulo rectángulo:");
                    int base = lector.nextInt();
                    System.out.println("Ingrese la altura del triángulo rectángulo:");
                    int altura = lector.nextInt();
                
                    break;
                case 2:
                    System.out.println("Ingrese la longitud del lado del triángulo equilátero:");
                    int lado = lector.nextInt();
            
                    break;
                case 3:
                    System.out.println("Ingrese la longitud del lado del cuadrado:");
                    int ladoCuadrado = lector.nextInt();
                
                    break;
                case 4:
                    System.out.println("Ingrese la base del rectángulo:");
                    int baseRectangulo = lector.nextInt();
                    System.out.println("Ingrese la altura del rectángulo:");
                    int alturaRectangulo = lector.nextInt();
                    
                    break;
                case 5:
                    System.out.println("Ingrese la base del paralelogramo:");
                    int baseParalelogramo = lector.nextInt();
                    System.out.println("Ingrese la altura del paralelogramo:");
                    int alturaParalelogramo = lector.nextInt();
                    
                    break;
                case 6:
                    System.out.println("Ingrese la longitud de la diagonal mayor del rombo:");
                    int diagonalMayor = lector.nextInt();
                    System.out.println("Ingrese la longitud de la diagonal menor del rombo:");
                    int diagonalMenor = lector.nextInt();
                
                    break;
                case 7:
                    System.out.println("Ingrese el radio del círculo:");
                    int radio = lector.nextInt();
            
                    break;
                case 8:
                    System.out.println("Ingrese la base mayor del trapecio:");
                    int baseMayor = lector.nextInt();
                    System.out.println("Ingrese la base menor del trapecio:");
                    int baseMenor = lector.nextInt();
                    System.out.println("Ingrese la altura del trapecio:");
                    int alturaTrapecio = lector.nextInt();
                
                    break;
                case 9:
                    System.out.println("Ingrese la longitud del lado del pentágono:");
                    int ladoPentagono = lector.nextInt();
                    
                    break;
                case 10:
                    System.out.println("Ingrese el semieje mayor de la elipse:");
                    int semiejeMayor = lector.nextInt();
                    System.out.println("Ingrese el semieje menor de la elipse:");
                    int semiejeMenor = lector.nextInt();
            
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 0);
    }  
}


public static void dibujarTrianguloRectangulo() {
    Scanner lector = new Scanner(System.in);
    System.out.println("Ingrese la altura del triángulo:");
    int altura = lector.nextInt();
    for (int i = 1; i <= altura; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

public static void dibujarTrianguloEquilatero() {
    Scanner lector= new Scanner(System.in);
    System.out.println("Ingrese la altura del triángulo:");
    int altura = lector.nextInt();
    for (int i = 1; i <= altura; i++) {
        for (int j = altura - i; j >= 1; j--) {
            System.out.print(" ");
        }
        for (int j = 1; j <= i * 2 - 1; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

public static void dibujarCuadrado() {
    Scanner lector= new Scanner(System.in);
    System.out.println("Ingrese el tamaño del cuadrado:");
    int tamano = lector.nextInt();
    for (int i = 1; i <= tamano; i++) {
        for (int j = 1; j <= tamano; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

public static void dibujarRectangulo() {
    Scanner lector = new Scanner(System.in);
    System.out.println("Ingrese el ancho del rectángulo:");
    int ancho = lector.nextInt();
    System.out.println("Ingrese la altura del rectángulo:");
    int altura = lector.nextInt();
    for (int i = 1; i <= altura; i++) {
        for (int j = 1; j <= ancho; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

public static void dibujarParalelogramo() {
    Scanner lector= new Scanner(System.in);
    System.out.println("Ingrese la altura del paralelogramo:");
    int altura = lector.nextInt();
    for (int i = 1; i <= altura; i++) {
        for (int j = altura - i; j >= 1; j--) {
            System.out.print(" ");
        }
        for (int j = 1; j <= altura; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

public static void dibujarRombo() {
    Scanner lector= new Scanner(System.in);
    System.out.println("Ingrese la altura del rombo:");
    int altura = lector.nextInt();
    for (int i = 1; i <= altura; i++) {
        for (int j = altura - i; j >= 1; j--) {
            System.out.print(" ");
        }
        for (int j = 1; j <= i * 2 - 1; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
    for (int i = altura - 1; i >= 1; i--) {
        for (int j = altura - i; j >= 1; j--) {
            System.out.print(" ");
        }
        for (int j = 1; j <= i * 2 - 1; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

public static void dibujarCirculo() {
    Scanner lector = new Scanner(System.in);
    System.out.println("Ingrese el radio del círculo:");
    int radio = lector.nextInt();
    for (int i = -radio; i <= radio; i++) {
        for (int j = -radio; j <= radio; j++) {
            if (i * i + j * j <= radio * radio) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
public static void dibujarTrapecio() {
    Scanner lector = new Scanner(System.in);
    System.out.println("Ingrese la altura del trapecio:");
    int altura = lector.nextInt();
    System.out.println("Ingrese la base menor del trapecio:");
    int baseMenor = lector.nextInt();
    System.out.println("Ingrese la base mayor del trapecio:");
    int baseMayor = lector.nextInt();
    for (int i = 1; i <= altura  ;i  )

}

public static void dibujarPentagono() {
    Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del pentágono:");
        int tamanoPentagono = lector.nextInt();
         double angulo = 108;
        double radio = tamanoPentagono / (2 * Math.sin(Math.toRadians(angulo / 2)));
                for (int i = 0; i < tamanoPentagono; i++) {
                    for (int j = 0; j < tamanoPentagono; j++) {
                        if (Math.abs(j - tamanoPentagono / 2) + Math.abs(i - tamanoPentagono / 2) <= radio) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
}
            public static void dibujarEclise() {
             Scanner lector = new Scanner(System.in);
                System.out.println("Ingrese el tamaño de la elipse:");
                int tamanoElipse = lector.nextInt();
                double a = tamanoElipse / 2;
                double b = tamanoElipse / 4;
                for (int i = 0; i < tamanoElipse; i++) {
                    for (int j = 0; j < tamanoElipse; j++) {
                        double x = (j - tamanoElipse / 2) * 2 * a / tamanoElipse;
                        double y = (i - tamanoElipse / 2) * 2 * b / tamanoElipse;
                        if (x * x / (a * a) + y * y / (b * b) <= 1) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                System.out.println("Opción inválida");
                break;

                lector.close();
        }
    
    }




