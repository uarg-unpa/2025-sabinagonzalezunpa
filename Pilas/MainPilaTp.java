package Pilas;

public class MainPilaTp {
    public static void main(String[] args) {
        
        String palabra = "Estamos";
        PilaTp p = new PilaTp();

        for (int i= 0; i < palabra.length(); i++){
            char letra = palabra.charAt(i);
            p.meter(letra);
        }
        while (!p.estaVacia()){
           System.out.print(" " + p.sacar());
        }
    }
}
