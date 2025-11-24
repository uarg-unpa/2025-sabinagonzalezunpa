public class SumaEnteros {

    public int sumarPares(int n){
        if(n == 0){                       
            return 0;
        }else{
            if(n % 2 == 0){                   
                return n + sumarPares(n - 2); 
            }else{
                return sumarPares(n - 1);     
            }
        }
    }
}
