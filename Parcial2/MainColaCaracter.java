package Parcial2;

import Clases.PilaChar;

public class MainColaCaracter {
    public static void main(String [] args){

        PilaChar p1 = new PilaChar();
        PilaChar aux1 = new PilaChar();
        PilaChar p2 = new PilaChar();
        PilaChar aux2 = new PilaChar();
        ColaChar Q1 = new ColaChar();


        while(!p1.estaVacia() && !p2.estaVacia()){
            char e1 = p1.sacar();

            if (!Q1.estaLlena()){
                Q1.encolar(e1);
            }
            aux1.meter(e1);

            char e2 = p2.sacar();
            
            if (!Q1.estaLlena()){
                Q1.encolar(e2);
            }
            aux2.meter(e2);
        }

        while(!aux1.estaVacia()){
            p1.meter(aux1.sacar());
        }
        while(!aux2.estaVacia()){
            p2.meter(aux2.sacar());
        }
        
}
}
