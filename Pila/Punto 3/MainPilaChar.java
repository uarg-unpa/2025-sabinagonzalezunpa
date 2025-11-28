package Punto 3;

public class MainPilaChar {
    public static void main(String[] args) {
        
        String palabra = "Estamos";
        PilaChar p = new PilaChar();

        for (int i= 0; i < palabra.length(); i++){
            char letra = palabra.charAt(i);
            p.meter(letra);
        }
        while (!p.estaVacia()){
           System.out.print(" " + p.sacar());
        }
    }
}