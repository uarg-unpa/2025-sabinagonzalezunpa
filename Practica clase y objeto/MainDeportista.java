import java.util.Scanner;

public class MainDeportista {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del deportista 1:");
        String nombre1 = scanner.nextLine();
        System.out.println("Ingrese la edad del deportista 1:");
        int edad1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el deporte del deportista 1:");
        String deporte1 = scanner.nextLine();
        System.out.println("Ingrese los puntos del deportista 1:");
        int puntos1 = scanner.nextInt();
        scanner.nextLine();

        Deportista d1 = new Deportista(nombre1, edad1, deporte1, puntos1);

        
        System.out.println("Ingrese el nombre del deportista 2:");
        String nombre2 = scanner.nextLine();
        System.out.println("Ingrese la edad del deportista 2:");
        int edad2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el deporte del deportista 2:");
        String deporte2 = scanner.nextLine();
        System.out.println("Ingrese los puntos del deportista 2:");
        int puntos2 = scanner.nextInt();
        scanner.nextLine();

        Deportista d2 = new Deportista(nombre2, edad2, deporte2, puntos2);

        System.out.println("Deportista 1:" + d1.getNombre() + "Edad:" + d1.getEdad() + "Deporte:" + d1.getDeporte() + "Puntos:" + d1.getPuntos());
        System.out.println("Deportista 2:" + d2.getNombre() + "Edad:" + d2.getEdad() + "Deporte:" + d2.getDeporte() + "Puntos:" + d2.getPuntos());

        if(d1.getPuntos() > d2.getPuntos()){
            System.out.println("El deportista 1 tiene mas puntos");
        }else if(d2.getPuntos() > d1.getPuntos()){
            System.out.println("El deportista 2 tiene mas puntos");
        }else{
            System.out.println("Ambos deportistas tiene la misma cantidad de puntos");
        }

        int contador = 0;
        if(d1.esMayorDeEdad()){
            contador ++;
        }
        if(d2.esMayorDeEdad()){
            contador ++;
        }
        System.out.println("Los que son mayores de edad son:" + contador);

        scanner.close();
    }
}
