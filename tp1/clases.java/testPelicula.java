import java.util.Scanner;
public class testPelicula{

    public static void main(String [] args){
    Scanner scan= new Scanner(System.in);
    
        System.out.println("Ingrese título de la película:");
        String titulo1 = scanner.nextLine();

        System.out.println("Ingrese director de la película:");
        String director1 = scanner.nextLine();

        System.out.println("Ingrese género de la película:");
        String nombreGenero1 = scanner.nextLine();

        System.out.println("Ingrese el añoDePublicacion de la pelicula:");
        int añoDePublicacion1 = scanner.nextLine();

        System.out.println("Ingrese el contenidopelicula de la pelicula:");
        int contenidopelicula1 = scanner.nextLine();

        System.out.println("Ingrese la duracion de la pelicula:");
        int duracion1 = scanner.nextLine();
        scanner.nextLine();

    Pelicula p1 = new Pelicula( " Mi pobre angelito", " Chris Columbus" , "Comedia", 1991 , 20 , 2 );
    Genero g1 = new Genero("");
    
        System.out.println("Ingrese título de la película:");
        String titulo2 = scanner.nextLine();

        System.out.println("Ingrese director de la película:");
        String director2 = scanner.nextLine();

        System.out.println("Ingrese género de la película:");
        String nombreGenero2 = scanner.nextLine();

        System.out.println("Ingrese el añoDePublicacion de la pelicula:");
        int añoDePublicacion2 = scanner.nextLine();

        System.out.println("Ingrese el contenidopelicula de la pelicula:");
        int contenidopelicula2 = scanner.nextLine();

        System.out.println("Ingrese la duracion de la pelicula:");
        int duracion2 = scanner.nextLine();
        scanner.nextLine();

    Pelicula p2 = new Pelicula ( "Top Gun: Maverick" , " Joseph Kosinski" , "Accion", 2022 , 13 , 2 );
    Genero g2 = new Genero("");
 
    System.out.println(p1);
    System.out.println("¿Es para adulto? " + p1.esParaAdulto());
    System.out.println("Duracion en minutos" + p1.calcularDuracionMinutos());

    System.out.println(p2);
    System.out.println("¿ Es para adulto?" + p2.esParaAdulto());
    System.out.println("Duracion en minutos" + p2.calcularDuracionMinutos());

}
} 