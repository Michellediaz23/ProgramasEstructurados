import java.util.Scanner;
public class GeometriaVectorial {

    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("¿Los vectores son en 2D o en 3D?");
            System.out.println("1. 2D");
            System.out.println("2. 3D");
            int dimension = lector.nextInt();
            double[] vector1 = new double[dimension];
            double[] vector2 = new double[dimension];
            System.out.println("Introduce las coordenadas del primer vector:");
            for (int i = 0; i < dimension; i++) {
                vector1[i] = lector.nextDouble();
            }
            System.out.println("Introduce las coordenadas del segundo vector:");
            for (int i = 0; i < dimension; i++) {
                vector2[i] = lector.nextDouble();
            }
            System.out.println("¿Qué operación deseas realizar?");
            System.out.println("1. Suma de vectores");
            System.out.println("2. Resta de vectores");
            System.out.println("3. Opuesto de un vector");
            System.out.println("4. Producto de un escalar por un vector");
            System.out.println("5. Producto punto o producto escalar entre vectores");
            System.out.println("6. Determinar si son vectores paralelos");
            System.out.println("7. Determinar si son vectores ortogonales");
            System.out.println("8. Determinar la proyección de un vector sobre otro vector");
            System.out.println("9. Producto vectorial o producto cruz");
            int operacion = lector.nextInt();
            switch (operacion) {
                case 1:
                    double[] suma = new double[dimension];
                    for (int i = 0; i < dimension; i++) {
                        suma[i] = vector1[i] + vector2[i];
                    }
                    System.out.println("La suma de los vectores es: (" + suma[0] + ", " + suma[1] + ")");
                    break;
                case 2:
                    double[] resta = new double[dimension];
                    for (int i = 0; i < dimension; i++) {
                        resta[i] = vector1[i] - vector2[i];
                    }
                    System.out.println("La resta de los vectores es: (" + resta[0] + ", " + resta[1] + ")");
                    break;
                case 3:
                    double[] opuesto = new double[dimension];
                    for (int i = 0; i < dimension; i++) {
                        opuesto[i] = -vector1[i];
                    }
                    System.out.println("El opuesto del vector es: (" + opuesto[0] + ", " + opuesto[1] + ")");
                    break;
                case 4:
                    System.out.println("Introduce el escalar:");
                    double escalar = lector.nextDouble();
                    double[] productoEscalar = new double[dimension];
                    for (int i = 0; i < dimension; i++) {
                        productoEscalar[i] = escalar * vector1[i];
                    }
                    System.out.println("El producto del escalar por el vector es: (" + productoEscalar[0] + ", " + productoEscalar[1] + ")");
                    break;
                case 5:
                    double productoPunto = 0;
                    for (int i = 0; i < dimension; i++) {
                        productoPunto += vector1[i] * vector2[i];
                    }
                    System.out.println("El producto punto entre los vectores es: " + productoPunto);
                    break;
                case 6:
                    boolean paralelos = true;
                    for (int i = 0; i < dimension; i++) {
                        if (vector1[i] / vector2[i] != vector1[0] / vector2[0]) {
                            paralelos = false;
                            break;
                        }
                    }
                    if (paralelos) {
                        System.out.println("Los vectores son paralelos");
                    } else {
                        System.out.println("Los vectores no son paralelos");
                    }
                    break;
                case 7:
                    boolean ortogonales = true;
                    for (int i = 0; i < dimension; i++) {
                        if (vector1[i] * vector2[i] != 0) {
                            ortogonales = false;
                            break;
                        }
                    }
                    if (ortogonales) {
                        System.out.println("Los vectores son ortogonales");
                    } else {
                        System.out.println("Los vectores no son ortogonales");
                    }
                    break;
                case 8:
                    double productoPunto2 = 0;
                    double modulo2 = 0;
                    for (int i = 0; i < dimension; i++) {
                        productoPunto2 += vector1[i] * vector2[i];
                        modulo2 += vector2[i] * vector2[i];
                    }
                    double[] proyeccion = new double[dimension];
                    for (int i = 0; i < dimension; i++) {
                        proyeccion[i] = (productoPunto2 / modulo2) * vector2[i];
                    }
                    System.out.println("La proyección del vector sobre el otro vector es: (" + proyeccion[0] + ", " + proyeccion[1] + ")");
                    break;
                case 9:
                    if (dimension == 2) {
                        double productoCruz = vector1[0] * vector2[1] - vector1[1] * vector2[0];
                        System.out.println("El producto cruz entre los vectores es: " + productoCruz);
                    } else {
                        double[] productoCruz = new double[dimension];
                        productoCruz[0] = vector1[1] * vector2[2] - vector1[2] * vector2[1];
                        productoCruz[1] = vector1[2] * vector2[0] - vector1[0] * vector2[2];
                        productoCruz[2] = vector1[0] * vector2[1] - vector1[1] * vector2[0];
                        System.out.println("la dimension del vector es  (2/3):");
                        int Dimension=lector.nextInt();

                    }
                }
                       System.out.println("¿Desea seguir usando la aplicacion si/no ?");
                       String repuesta=lector.next();
                       if(repuesta.equalsIgnoreCase("N")){
                        boolean continua = false;
                       }

                lector.close();
            }
        }
    }


