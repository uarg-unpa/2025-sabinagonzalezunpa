import java.util.Scanner;

public class MainPc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la marca de la pc 1:");
        String marca1 = scanner.nextLine();
        System.out.println("Ingrese el procesador de la pc 1:");
        String procesador1 = scanner.nextLine();
        System.out.println("Ingrese el precio de la pc 1:");
        double precio1 = scanner.nextDouble();
        System.out.println("Ingrese la ram de la pc 1:");
        int ram1 = scanner.nextInt();

        Pc p1 = new Pc (marca1 , procesador1 , precio1, ram1 );

        scanner.nextLine();

        System.out.println("Ingrese la marca de la pc 2:");
        String marca2 = scanner.nextLine();
        System.out.println("Ingrese el procesador de la pc 2:");
        String procesador2 = scanner.nextLine();
        System.out.println("Ingrese el precio de la pc 2:");
        double precio2 = scanner.nextDouble();
        System.out.println("Ingrese la ram de la pc 2:");
        int ram2 = scanner.nextInt();

        Pc p2 = new Pc (marca2 , procesador2 , precio2, ram2);

        scanner.nextLine();

        p1.aplicarDescuento(10);
        System.out.println("El nuevo precio de la pc 1 con el descuento es de:" + p1.getPrecio());

        p2.actualizarRam(16);
        System.out.println("La ram actualizada de la pc 2 es:" + p2.getRam());

        if(p1.mayorRam(p2)){
            System.out.println("La pc con mayor ram es la pc 1");
        }else if(p2.mayorRam(p1)){
            System.out.println("La pc con mayor ram es la pc 2");
        }else{
            System.out.println("La dos pc tiene la misma cantidad de ram");
        }
        scanner.close();
    } 
}