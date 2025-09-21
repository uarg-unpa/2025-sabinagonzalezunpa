package Pilas;

public class PilaTp {
    private char[] elementos; 
    private int cima;       
    private final int max; 
    
    public PilaTp(int capacidad){
        max= capacidad; 
        elementos =new char[max];
        cima = -1; 
}
public boolean estaVacia(){
    if(cima == -1){
        return true;
    }else{
        return false;
    }
}
public boolean estaLlena(){
    if(cima == max -1){
        return true;
    }else{
        return false;
    }
}
public boolean meter(char elem){
    if(cima < max - 1){
        cima = cima + 1;
        elementos[cima] = elem;
        return true;
    }else{
        return false;
    }
}
public char sacar(){
    if(cima >= 0){
        char elem = elementos[cima];
        cima= cima -1;
        return elem;
    }
}
}