import java.util.Scanner;

public class RegistroVentas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        double[][] ventas = new double[4][3];

        
        System.out.println("=== INGRESO DE VENTAS ===");
        for (int sucursal = 0; sucursal <= 3; sucursal++) {
            for (int producto = 0; producto <= 2; producto++) {
                System.out.print("Ventas Sucursal " + sucursal + ", Producto " + producto + ": ");
                ventas[sucursal][producto] = scanner.nextDouble();
            }
        }

        
        System.out.println("\n=== TOTAL POR SUCURSAL ===");
        for (int sucursal = 0; sucursal <= 3; sucursal++) {
            double totalSucursal = 0;
            for (int producto = 0; producto <= 2; producto++) {
                totalSucursal += ventas[sucursal][producto];
            }
            System.out.println("Sucursal " + sucursal + ": " + totalSucursal);
        }

        
        System.out.println("\n=== TOTAL POR PRODUCTO ===");
        for (int producto = 0; producto <= 2; producto++) {
            double totalProducto = 0;
            for (int sucursal = 0; sucursal <= 3; sucursal++) {
                totalProducto += ventas[sucursal][producto];
            }
            System.out.println("Producto " + producto + ": " + totalProducto);
        }

        
        double maxVenta = ventas[0][0];
        int sucMax = 0;
        int prodMax = 0;

        for (int sucursal = 0; sucursal <= 3; sucursal++) {
            for (int producto = 0; producto <= 2; producto++) {
                if (ventas[sucursal][producto] > maxVenta) {
                    maxVenta = ventas[sucursal][producto];
                    sucMax = sucursal;
                    prodMax = producto;
                }
            }
        }

        System.out.println("\n=== VENTA MÁS ALTA ===");
        System.out.println("Monto máximo: " + maxVenta);
        System.out.println("Sucursal: " + sucMax);
        System.out.println("Producto: " + prodMax);

        scanner.close();
    }
}