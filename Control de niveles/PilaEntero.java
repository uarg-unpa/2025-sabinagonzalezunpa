package Control de niveles;

public class PilaEntero {
    
	int [] elementos;
	int cima;
    final int maxpila=30;
	
	public PilaEntero() { 
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
	public int peek() {
        if (!estaVacia()) {          // si la pila tiene elementos
            return elementos[cima];  // devuelve el elemento en la cima
        }else{
            return -1; // o lanzar excepción
        }
    }
    public int contarX(int x){             //(int nivelBuscado)
        PilaEntero aux = new PilaEntero();
        int contador = 0;

        while(!this.estaVacia()){
            int elem = this.sacar();    //int nivelActual = sacar()
            if(elem == x){              //if(nivelActual == nivelBuscado)
                contador ++;
            }
            aux.meter(elem);            //aux.meter(nivelActual)
        }
        while(!aux.estaVacia()){
            this.meter(aux.sacar());
        }
        return contador;
    }
}
