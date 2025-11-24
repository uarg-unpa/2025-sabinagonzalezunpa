public class VocalesCadena {
    
    public int VocalesEnCadena(String cd, int i, int cont){
        if(i == cd.length()){
            return cont;
        }else{
            if(cd.charAt(i) == 'a'|| cd.charAt(i) == 'e' || cd.charAt(i) == 'i' || cd.charAt(i) == 'o' || cd.charAt(i) == 'u' || cd.charAt(i) == 'A' || cd.charAt(i) == 'E' || cd.charAt(i) == 'I' || cd.charAt(i) == 'O' || cd.charAt(i) == 'U'){
                return VocalesEnCadena(cd, i + 1, cont + 1);
            }else{
                return VocalesCadena(cd, i + 1, cont);
            }
        }

    
}
