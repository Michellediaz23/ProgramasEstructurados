import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class    McDonald {
    public static void main(String[] args) throws Exception {
    Scanner lector =new Scanner(System.in);

        Map<String, List<Platillo>> menu = new HashMap<>();
        menu.put("Hamburguesas", List.of(
                new Platillo("Big Mac", 5.99),
                new Platillo("Cuarto de libra con queso", 4.99),
                new Platillo("McRoyal Deluxe", 6.99) ));
        menu.put("Papas fritas", List.of(
                new Platillo("Papas fritas pequeñas", 1.99),
                new Platillo("Papas fritas medianas", 2.99),
                new Platillo("Papas fritas grandes", 3.99) ));
        menu.put("Bebidas", List.of(
                new Platillo("Refresco pequeño", 1.49),
                new Platillo("Refresco mediano", 1.99),
                new Platillo("Refresco grande", 2.49),
                new Platillo("Agua", 0.99) ));
        menu.put("Postres", List.of(
                new Platillo("McFlurry Oreo", 2.99),
                new Platillo("Sundae de caramelo", 1.49),
                new Platillo("Pie de manzana", 0.99) ));

        System.out.println("Bienvenido a McDonald's");
        System.out.println("Seleccione los platillos que desee:");

        List<Platillo> orden = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (String categoria : menu.keySet()) {
            System.out.println(categoria + ":");
            List<Platillo> platillos = menu.get(categoria);
            for (Platillo platillo : platillos) {
                System.out.println(platillo.getNombre() + " - $" + platillo.getPrecio());
            }
            System.out.println("Seleccione un platillo (o presione Enter para continuar):");
            String seleccion = scanner.nextLine();
            while (!seleccion.isEmpty()) {
                Platillo platillo = platillos.stream()
                        .filter(p -> p.getNombre().equals(seleccion))
                        .findFirst()
                        .orElse(null);
                if (platillo != null) {
                    orden.add(platillo);
                    System.out.println("Agregado " + platillo.getNombre() + " a la orden");
                } else {
                    System.out.println("Platillo no encontrado");
                }
                System.out.println("Seleccione otro platillo (o presione Enter para continuar):");
                seleccion = scanner.nextLine();
            }
        }

        System.out.println("Detalle de la orden:");
        double total = 0;
        for (Platillo platillo : orden) {
            System.out.println(platillo.getNombre() + " - $" + platillo.getPrecio());
            total += platillo.getPrecio();
        }
        System.out.println("Total a pagar: $" + total);
    }

    static class Platillo {
        private final String nombre;
        private final double precio;

        public Platillo(String nombre, double precio) {
            this.nombre = nombre;
            this.precio = precio;
        }

        public String getNombre() {
            return nombre;
        }

        public double getPrecio() {
            return precio;
        }
    }
}

lector .close();
