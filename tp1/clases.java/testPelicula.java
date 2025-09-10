public class testPelicula{

    public static void main(String [] args){
    Pelicula p1 = new Pelicula( " Mi pobre angelito", " Chris Columbus" , "Comedia", 1991 , 20 , 2 );
    Pelicula p2 = new Pelicula ( "Top Gun: Maverick" , " Joseph Kosinski" , "Accion", 2022 , 13 , 2 );
 
    System.out.println("Pelicula 1: " + p1.mostrarPelicula());
    System.out.println("Pelicula 2:" + p2.mostrarPelicula());
}

} 