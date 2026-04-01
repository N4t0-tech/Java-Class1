import java.util.Scanner;

public class BoletaScaner {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        teclado.nextLine(); // Limpiar el buffer del teclado
        System.out.println("========================");
        System.out.println("== Almacen Javalimos ===");
        System.out.println("========================");
        // ==========
        // PRDUCTOS
        // ==========
        // ========== Producto 1 ==========
        System.out.print("\nIngrese el nombre del producto 1: ");
        String producto1 = teclado.next();

        System.out.print("Ingrese el precio unitario del producto 1: ");
        int precio1 = teclado.nextInt();

        System.out.print("Ingrese la cantidad del producto 1: ");
        int cantidad1 = teclado.nextInt();

        // ========== Producto 2 ==========

        System.out.print("Ingrese el nombre del producto 2: ");
        String producto2 = teclado.next();

        System.out.print("Ingrese el precio unitario del producto 2: ");
        int precio2 = teclado.nextInt();

        System.out.print("Ingrese la cantidad del producto 2: ");
        int cantidad2 = teclado.nextInt();

        // calculos 

        int total1 = precio1 * cantidad1;
        int total2 = precio2 * cantidad2;

        int subtotal = total1 + total2;

        double iva = (int)(subtotal * 0.19); // IVA del 19%
    

        double totalPagar = subtotal + iva;

        // === imprimir ===
        System.out.println("detalle de la boleta:");
        System.out.println("Producto: " + producto1);
        System.out.println("Precio unitario: $" + precio1);
        System.out.println("Cantidad: " + cantidad1);
        System.out.println("Total: $" + total1);
        System.out.println("================================");
        System.out.println("\nProducto: " + producto2);
        System.out.println("Precio unitario: $" + precio2);
        System.out.println("Cantidad: " + cantidad2);
        System.out.println("Total: $" + total2);
        System.out.println("================================");
        System.out.println("\nSubtotal: $" + subtotal);
        System.out.println("IVA (19%): $" + iva);
        System.out.println("Total a pagar: $" + totalPagar);


    }
}
