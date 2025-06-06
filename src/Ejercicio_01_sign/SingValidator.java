package Ejercicio_01_sign;
import java.util.Stack;

public class SingValidator {
    public static boolean isValid(String cadena) {
        Stack<Character> pila= new Stack<>();
        for (int i=0;i< cadena.length();i++){
            char character = cadena.charAt(i);
            if(character =='(' || character == '[' || character =='{'){
                pila.push(character);
                
            }else{
                if(pila.isEmpty()){
                    return false;

                }
                
                char top= pila.pop();
                if (( character == ')' && top != '(') ||
                    (character == ']' && top != '[') ||
                    (character =='}' && top !='{')){
                    return false;
                }
            

            
            
            

            }

        }
        return pila.isEmpty();
    }


    

        
}

    //public  boolean isValid(String cadena){
        //cadena = "(), {},[]";


        //chat primero = "(";

        // primero es de  paertura o cierre
        // true
        // si es true agreggoa la pila
        //------pila--->(
        //segundo) es de apertura o cierra
        //false
        // comparo y repgutno es del mismo tipo
        // ---> true retiro de la pila
        //---> falso no es vlaido

    //}

    

