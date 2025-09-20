package Pilas;

public class PilaTp {
    private char[] elementos; 
    private int cima;       
    private final int max; 
    
    public Pilatp(int capacidad){
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
}