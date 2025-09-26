public class PilaCopia {

    private int [] elementos;
    private int cima;
    private final int maxpila = 15;
    
    public PilaCopia(){
        elementos = new int [maxpila];
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
    public int sacar(){
    int aux = - 1 ;
    if(!this.estaVacia()){
        aux = elementos[cima];
        cima = cima - 1;       
}
    return aux;
}
}
