public class PilaCima {
    private char[] elementos; 
    private int cima;       
    private final int maxpila = 10; 
    
    public PilaCima(){
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
public char elementoCima(){
    char x;
    if(!this.estaVacia()){
        x = this.sacar();
        this.meter(x);
        return x;
    }
}
}