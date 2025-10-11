import java.util.Scanner;

public class MainProducto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del producto 1:");
        String nombre1 = scanner.nextLine();
        System.out.println("Ingrese el precio del producto 1:");
        double precio1 = scanner.nextDouble();
        System.out.println("Ingrese la cantidad en stock del producto 1:");
        int stock1 = scanner.nextInt();

        Producto p1 = new Producto (nombre1 , precio1 , stock1);

        scanner.nextLine();
        

        System.out.println("Ingrese el nombre del producto 2:");
        String nombre2 = scanner.nextLine();
        System.out.println("Ingrese el precio del producto 2:");
        double precio2 = scanner.nextDouble();
        System.out.println("Ingrese la cantidad en stock del producto 2:");
        int stock2 = scanner.nextInt();

        Producto p2 = new Producto (nombre2 , precio2 , stock2);

        scanner.nextLine();

        System.out.println("Ingrese la cantidad a vender del producto 1:");
        int cantidad = scanner.nextInt();

        if (p1.hayStock(cantidad)){
            p1.vender(cantidad);
            System.out.println("Se vendió la cantidad: " + cantidad);
        } else {
            System.out.println("No se pudo vender la cantidad por falta de stock.");
        }
        p2.aumentarStock(10);

        if(p1.tieneMasStockQue(p2)){
            System.out.println("El producto con mas stock es: " + p1.getNombre());
        }else{
            if(p2.tieneMasStockQue(p1)){
                System.out.println("El producto con mas stock es: " + p2.getNombre());
            }else{
                System.out.println("Ambos productos tienen el mismo stock");
            }
        }
        scanner.close(); 
    }
}
