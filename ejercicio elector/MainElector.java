import java.util.Scanner;

public class MainElector {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del elector 1:");
        String nombre1 = scanner.nextLine();
        System.out.println("Ingrese el apellido del elector 1:");
        String apellido1 = scanner.nextLine();
        System.out.println("Ingrese la matricula del elector 1:");
        int matricula1 = scanner.nextInt();
        System.out.println("Ingrese la clase del elector 1:");
        int clase1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el domicilio del elector 1:");
        Domicilio domicilio1 = scanner.nextLine();

        Elector e1 = new Elector (nombre1 , apellido1 , matricula1 , clase1 , domicilio1);

        
        System.out.println("Ingrese el nombre del elector 2:");
        String nombre2 = scanner.nextLine();
        System.out.println("Ingrese el apellido del elector 2:");
        String apellido2 = scanner.nextLine();
        System.out.println("Ingrese la matricula del elector 2:");
        int matricula2 = scanner.nextInt();
        System.out.println("Ingrese la clase del elector 2:");
        int clase2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el domicilio del elector 2:");
        Domicilio domicilio2 = scanner.nextLine();

        Elector e2 = new Elector (nombre2 , apellido2 , matricula2 , clase2 , domicilio2);

        
        System.out.println("Ingrese el nombre del elector 3:");
        String nombre3 = scanner.nextLine();
        System.out.println("Ingrese el apellido del elector 3:");
        String apellido3 = scanner.nextLine();
        System.out.println("Ingrese la matricula del elector 3:");
        int matricula3 = scanner.nextInt();
        System.out.println("Ingrese la clase del elector 3:");
        int clase3 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el domicilio del elector 3:");
        Domicilio domicilio3 = scanner.nextLine();

        Elector e3 = new Elector (nombre3 , apellido3 , matricula3 , clase3 , domicilio3);

        
        System.out.println("Ingrese el nombre del elector 4:");
        String nombre4 = scanner.nextLine();
        System.out.println("Ingrese el apellido del elector 4:");
        String apellido4 = scanner.nextLine();
        System.out.println("Ingrese la matricula del elector 4:");
        int matricula4 = scanner.nextInt();
        System.out.println("Ingrese la clase del elector 4:");
        int clase4 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el domicilio del elector 4:");
        Domicilio domicilio4 = scanner.nextLine();

        Elector e4 = new Elector (nombre4 , apellido4 , matricula4 , clase4 , domicilio4);

        
        System.out.println("Ingrese el nombre del elector 5:");
        String nombre5 = scanner.nextLine();
        System.out.println("Ingrese el apellido del elector 5:");
        String apellido5 = scanner.nextLine();
        System.out.println("Ingrese la matricula del elector 5:");
        int matricula5 = scanner.nextInt();
        System.out.println("Ingrese la clase del elector 5:");
        int clase5 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el domicilio del elector 5:");
        Domicilio domicilio5 = scanner.nextLine();

        Elector e5 = new Elector (nombre5 , apellido5 , matricula5 , clase5 , domicilio5);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);
        System.out.println(e5);

        e1.setApellido("Flores");
        e3.setClase(2000);
        e5.setNombre("Miguel"); 

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);
        System.out.println(e5);

        scanner.close();
    }
    
}