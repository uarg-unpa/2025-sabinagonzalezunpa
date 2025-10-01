public class MainPilaOperaciones { 
    public static void main(String[] args) {
        PilaOperaciones pilap = new PilaOperaciones();
        PilaOperaciones auxpila = new PilaOperaciones();

        
        char X;
        while (!pilap.estaVacia()) {
            X = pilap.sacar();
            if(!auxpila.estaLlena()){
                auxpila.meter(X);
            }
        while (!auxpila.estaVacia()) {
            if(!pilap.estaLlena()){
                X= auxpila.sacar();
                pilap.meter(X);
            }
        }   
    }
}