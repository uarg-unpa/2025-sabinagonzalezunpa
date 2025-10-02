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
    
    int i = 1;
    int N = 5;
    while (!pilap.estaVacia() && i <= N){
        X = pilap.sacar();
        i++;
    }
    while (!pilap.estaVacia() && i <= N){
        X = pilap.sacar();
        auxpila.meter(X);
        i++;
    }
    while (!auxpila.estaVacia()){
        pilap.meter(auxpila.sacar());
    }

    while (!pilap.estaVacia()){
        X = pilap.sacar();
    }

    while (!pilap.estaVacia()){
        X = pilap.sacar();
        auxpila.meter(X);
    }
    while (!auxpila.estaVacia()){
        pilap.meter(auxpila.sacar());
    }
}
}