import java.util.Scanner;

public class MainVehiculo {
    public static void main(String[]args){
        Scanner scanner = new Scanner (System.in);

        System.out.println("Ingrese el tipo del vehiculo 1:");
        String tipo1 = scanner.nextLine();
        System.out.println("Ingrese la velocidad maxima del vehiculo 1:");
        int vel1 = scanner.nextInt();
        System.out.println("Ingrese el precio del vehiculo 1:");
        double precio1 = scanner.nextDouble();

        Vehiculo v1 = new Vehiculo (tipo1 , vel1 , precio1);

        scanner.nextLine();
        System.out.println("Ingrese el tipo del vehiculo 2:");
        String tipo2 = scanner.nextLine();
        System.out.println("Ingrese la velocidad maxima del vehiculo 2:");
        int vel2 = scanner.nextInt();
        System.out.println("Ingrese el precio del vehiculo 2:");
        double precio2 = scanner.nextDouble();

        Vehiculo v2 = new Vehiculo (tipo2 , vel2 , precio2);

        scanner.nextLine();

        v1.aplicarDescuento(10);
        System.out.println("El precio del vehiculo 1 con el descuento es:" + v1.getPrecio());

        v2.aumentarVelocidadMaxima(5);

        if (v1.mayorVelocidad(v2)) {
            System.out.println("El vehículo con mayor velocidad es v1");
        } else if (v2.mayorVelocidad(v1)) {
            System.out.println("El vehículo con mayor velocidad es v2");
        } else {
            System.out.println("Ambos vehículos tienen la misma velocidad");
        }

            
        scanner.close();
    }
} 