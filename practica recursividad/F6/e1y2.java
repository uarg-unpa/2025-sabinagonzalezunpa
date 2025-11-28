package F6;

public class e1y2 {

    //Dado una cadena de caracteres (String), diseñar tres algoritmos recursivos que calculen:
    //a) La cantidad de vocales en la cadena.

    public static int cantidadVocales(String s){
        if (s.length() == 0){
            return 0;
        }else{
            if(s.charAt(0) == 'a' || s.charAt(0) == 'e' || s.charAt(0) == 'i' || s.charAt(0) == 'o' || s.charAt(0) == 'u' || s.charAt(0) == 'A' || s.charAt(0) == 'E' || s.charAt(0) == 'I' || s.charAt(0) == 'O' || s.charAt(0) == 'U'){
                return 1 + cantidadVocales(s.substring(1));
            }else{
                return cantidadVocales(s.substring(1));
            }
        }
    } 

    //b) La cantidad de espacios en blanco en la cadena.

    public static int espaciosVacios(String s){
        if(s.length() == 0){
            return 0;
        }else{
            if(s.charAt(0) == ' '){
                return 1 + espaciosVacios(s.substring(1));
            }else{
                return espaciosVacios(s.substring(1));
            }
        }
    }

    //c) La cantidad de caracteres que tiene la cadena. 

    public static int caracteres(String s){
        if(s.length() == 0){
            return 0;
        }else{
            return 1 + caracteres(s.substring(1));
        }
    }
}
