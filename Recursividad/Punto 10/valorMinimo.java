public class valorMinimo {

     public int buscarMenor(int v[], int n, int menor){
   
      if (n < 0){   
         return menor;
      }else{         
         if (v[n] < menor)         
            return buscarMenor(v, n-1 ,v[n]);
         else
            return buscarMenor(v, n-1 ,menor);
      }
   } 
    
}
