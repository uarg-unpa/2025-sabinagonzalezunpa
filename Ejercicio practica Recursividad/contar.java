public class contar {

    public static int contarA(String s){
        if(s.length() == 0){
            return 0;
        }else{
            if(s.charAt(0) == 'a' || s.charAt(0) =='A'){
                return 1 + contarA(s.substring(1));
            }else{
                return contarA(s.substring(1));
            }
        }
    }
    
}
