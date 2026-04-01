public class Boleta {
    public static void main(String[] args) {
        System.out.println("== Una boleta simple ===");
        // ==========
        // PRDUCTOS
        // ==========
        String producto1 = "Pan";
        int precio1 = 1000;
        int cantidad1 = 2;

        String producto2 = "Leche";
        int precio2 = 1500;
        int cantidad2 = 3;

        // calculos 

        int total1 = precio1 * cantidad1;
        int total2 = precio2 * cantidad2;

        int subtotal = total1 + total2;

        double iva = (int)(subtotal * 0.19); // IVA del 19%
    

        double totalPagar = subtotal + iva;

        // imprimir 
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
