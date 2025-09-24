package Pilas;

public class PilaTp {
    private char[] elementos; 
    private char cima;       
    private final char maxpila = 10; 
    
    public PilaTp(){
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
        cima++;
        elementos[cima] = elem;
    }
}
public char sacar(){
    char aux = ' ';
    if(!this.estaVacia()){
        aux = elementos[cima];
        cima--;       
}
    return aux;
}
}