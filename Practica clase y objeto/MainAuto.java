import java.util.Scanner;

public class MainAuto {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la marca del auto 1:");
        String marca1 = scanner.nextLine();
        System.out.println("Ingrese el modelo del auto 1:");
        String modelo1 = scanner.nextLine();
        System.out.println("Ingrese el anio del auto 1:");
        int anio1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese la velocidad maxima del auto 1:");
        int velocidadMax1 = scanner.nextInt();
        scanner.nextLine();

        Auto a1 = new Auto(marca1, modelo1, anio1, velocidadMax1);

        System.out.println("Ingrese la marca del auto 2:");
        String marca2 = scanner.nextLine();
        System.out.println("Ingrese el modelo del auto 2:");
        String modelo2 = scanner.nextLine();
        System.out.println("Ingrese el anio del auto 2:");
        int anio2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese la velocidad maxima del auto 2:");
        int velocidadMax2 = scanner.nextInt();
        scanner.nextLine();

        Auto a2 = new Auto(marca2, modelo2, anio2, velocidadMax2);

        System.out.println("Ingrese la marca del auto 3:");
        String marca3 = scanner.nextLine();
        System.out.println("Ingrese el modelo del auto 3:");
        String modelo3 = scanner.nextLine();
        System.out.println("Ingrese el anio del auto 3:");
        int anio3 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese la velocidad maxima del auto 3:");
        int velocidadMax3 = scanner.nextInt();
        scanner.nextLine();

        Auto a3 = new Auto(marca3, modelo3, anio3, velocidadMax3);

        Auto masRapido;

        if (a1.getVelocidadMax() >= a2.getVelocidadMax() && a1.getVelocidadMax() >= a3.getVelocidadMax()) {
            masRapido = a1;
        } else if (a2.getVelocidadMax() >= a1.getVelocidadMax() && a2.getVelocidadMax() >= a3.getVelocidadMax()) {
            masRapido = a2;
        } else {
            masRapido = a3;
        }
        System.out.println("El auto mas rapido es:" + masRapido);

        if(a1.esAutoClasico()){
            System.out.println("El auto 1 es clasico");
        }
        if(a2.esAutoClasico()){
            System.out.println("El auto 2 es clasico");
        }
        if(a3.esAutoClasico()){
            System.out.println("El auto 3 es clasico");
        }
        scanner.close();
    }
}
