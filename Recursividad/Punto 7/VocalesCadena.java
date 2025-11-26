public class VocalesCadena {
    
    public static int VocalesEnCadena(String cd, int i){
        if(i == cd.length()){  //cd.length() == 0
            return 0;
        }else{ //cd.charAt(0)
            if(cd.charAt(i) == 'a'|| cd.charAt(i) == 'e' || cd.charAt(i) == 'i' || cd.charAt(i) == 'o' || cd.charAt(i) == 'u' || cd.charAt(i) == 'A' || cd.charAt(i) == 'E' || cd.charAt(i) == 'I' || cd.charAt(i) == 'O' || cd.charAt(i) == 'U'){
                return 1 + VocalesEnCadena(cd, i + 1);   //1 + cd.subString(1);
            }else{
                return VocalesEnCadena(cd, i + 1);
            }
        } 
    }
}
