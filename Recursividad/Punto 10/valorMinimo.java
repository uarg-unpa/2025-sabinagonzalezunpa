public class valorMinimo {

   public static int buscarMenor(int v[], int n){
      if (n == v.length - 1){   
         return v[n];
      }else{  
         int minResto = buscarMenor(v, n + 1);       
         if (v[n] < minResto){      
            return v[n];
         }else{
            return minResto;
         }
      }
   } 
}
