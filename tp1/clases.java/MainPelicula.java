import java.util.Scanner;
public class MainPelicula{

    public static void main(String [] args){
    Scanner scanner= new Scanner(System.in);

    Genero g1 = new Genero("Comedia" , 13);
    Pelicula p1 = new Pelicula( " Mi pobre angelito", " Chris Columbus" , "Comedia", 1991 , 20 , 2 );
    
        System.out.println("Ingrese título de la película:");
        String titulo1 = scanner.nextLine();

        System.out.println("Ingrese director de la película:");
        String director1 = scanner.nextLine();

        System.out.println("Ingrese género de la película:");
        Genero genero1 = scanner.nextLine();

        System.out.println("Ingrese el añoDePublicacion de la pelicula:");
        int añoDePublicacion1 = scanner.nextInt();

        System.out.println("Ingrese el contenidopelicula de la pelicula:");
        int contenidopelicula1 = scanner.nextInt();

        System.out.println("Ingrese la duracion de la pelicula:");
        int duracion1 = scanner.nextInt();
        scanner.nextLine();

        Genero g2 = new Genero("Terror" , 23);
        Pelicula p2 = new Pelicula ( "Top Gun: Maverick" , " Joseph Kosinski" , "Accion", 2022 , 13 , 2 );
    
        System.out.println("Ingrese título de la película:");
        String titulo2 = scanner.nextLine();

        System.out.println("Ingrese director de la película:");
        String director2 = scanner.nextLine();

        System.out.println("Ingrese género de la película:");
        Genero genero2 = scanner.nextLine();

        System.out.println("Ingrese el añoDePublicacion de la pelicula:");
        int añoDePublicacion2 = scanner.nextInt();

        System.out.println("Ingrese el contenidopelicula de la pelicula:");
        int contenidopelicula2 = scanner.nextInt();

        System.out.println("Ingrese la duracion de la pelicula:");
        int duracion2 = scanner.nextInt();
        scanner.nextLine();

 
    System.out.println(p1);
    System.out.println("¿Es para adulto? " + p1.esParaAdulto());
    System.out.println("Duracion en minutos" + p1.calcularDuracionMinutos());

    System.out.println(p2);
    System.out.println("¿ Es para adulto?" + p2.esParaAdulto());
    System.out.println("Duracion en minutos" + p2.calcularDuracionMinutos());
}
} 