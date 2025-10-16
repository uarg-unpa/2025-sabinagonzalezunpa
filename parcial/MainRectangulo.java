import java.util.Scanner;

public class MainRectangulo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la base del rectangulo 1:");
        double base1 = scanner.nextDouble();
        System.out.println("Ingrese la altura del rectangulo 1:");
        double altura1 = scanner.nextDouble();

        Rectangulo R1 = new Rectangulo (base1 , altura1 );

        scanner.nextLine();

        System.out.println("Ingrese la base del rectangulo 2:");
        double base2 = scanner.nextDouble();
        System.out.println("Ingrese la altura del rectangulo 2:");
        double altura2 = scanner.nextDouble();

        Rectangulo R2 = new Rectangulo (base2 , altura2 );

        scanner.nextLine();

        System.out.println("El area del rectanglo 1 es:" + R1.calcularArea());
        System.out.println("El perimetro del rectangulo 2 es:" + R2.calcularPerimetro());

        if(R1.esMayorElArea(R2)){
            System.out.println("El rectangulo con mayor area es el rectangulo 1");
        }else if(R2.esMayorElArea(R1)){
            System.out.println("El rectangulo con mayor area es el rectangulo 2");
        }else{
            System.out.println("Ambos rectangulos tienen la misma area");
        }
        scanner.close();
    }
}