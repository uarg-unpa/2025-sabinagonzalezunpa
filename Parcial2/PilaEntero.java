package Parcial2;

public class PilaEntero {

    final int maxpila=30;
	int [] elementos;
	int cima;
	
	public PilaEntero() { //PilaInt
		elementos = new int[maxpila];
		cima = -1;
	}
	
	public boolean estaVacia() {
		return (cima == -1);
	}
	
	public boolean estaLlena() {
		return (cima == maxpila-1);
	}
	
	public void meter(int e) {     
		   cima = cima+1;	
         elementos[cima]=e;           			
	}
	
	public int sacar() {		      
		int aux = elementos[cima];
		cima = cima - 1;    
		return aux;
	}    
    //contar pares de ambas y comparo si uno es mayor, verdadero sino falso

    

    
    public boolean masElementosPares(PilaEntero p2){
        
        PilaEntero aux1 = new PilaEntero();
        PilaEntero aux2 = new PilaEntero();
        int cont1 = 0;
        int cont2 = 0;

        while(!this.estaVacia()){
            int e1 = this.sacar();
            if(e1 %2 == 0){
                cont1 ++;
            }
            aux1.meter(e1);
        }
        while(!p2.estaVacia()){
            int e2 = p2.sacar();
            if( e2 %2 == 0){
                cont2 ++;
            }
            aux2.meter(e2);
        }
        while(!aux1.estaVacia()){
            this.meter(aux1.sacar());
        }
        while(!aux2.estaVacia()){
            p2.meter(aux2.sacar());
        }

        if( cont1 > cont2 ){
            return true;
        }else{
            return false;
        }
    }
}

