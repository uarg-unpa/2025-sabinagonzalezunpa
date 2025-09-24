package Pila;

public class Pila5 {
    private char[] elementos; 
    private int cima;       
    private final int maxpila = 10; 
    
    public Pila5(){
        elementos = new char[maxpila];
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
    if(cima == maxpila -1){
        return true;
    }else{
        return false;
    }
}
public void meter(char elem){
    if(!this.estaLlena()){
        cima = cima + 1;
        elementos[cima] = elem;
    }
}
public char sacar(){
    char aux = ' ' ;
    if(!this.estaVacia()){
        aux = elementos[cima];
        cima = cima - 1;       
}
    return aux;
}
public char elementosCima(){
    
}