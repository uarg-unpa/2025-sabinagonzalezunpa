package Recursividad;

public class Suma {

    public int sumaRecursividad(int n){
        if(n == 1){
            return 1;
        }else{
            return n + sumaRecursividad(n - 1);
        }
    }
    
}
