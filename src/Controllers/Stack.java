package Controllers;
import java.util.EmptyStackException;
// import 

import Materia.Models.Node;
public class Stack {
    // Stack class with push, pop, peek, isEmpty, and size methods

    private Node top;  // No se ahce un lista porq esod el prviate ya es una lista 

    public Stack() {
        this.top =null;
        
    }
    

    // METODO QUE INGRESE UN VALOR UN VALOR INT 
    public void push( int getValue){

        Node newNode= new Node(getValue);    // ESTO ES INSTANCIAR
        newNode.setNext(top);                   // top---es nulo ,el primero que llega su next es nulo --por el anteiror de del nodo 1 es nulo
        top= newNode;                            //Metodo Generico 
 



    }
    public int  pop(){                                                   // es int por que saca elementos  no se usa void 
        if (isEmpty()){
           throw new EmptyStackException();     
          //Sirve para detener el programa o advertir al programador de que se está intentando operar con una pila vacía (por ejemplo, hacer pop() o peek() cuando no hay nada).
          //EmptyStackException es una clase de Java que se encuentra en el paquete java.util.
         
        }

        int value= top.getValue();    // acceder al vlaor de top ya que es un top null , peor tiee¡ne un vlaor intermanete ya hehco 
        top = top.getNext();    // ya elimina al ultimo 
        return value;
    }


        //public boolean isEmpty(){
           // if( top == null){
           //     return true;

           // }else{
            //    return false;
            //}
        //}

        public int peek(){
            if (isEmpty())
                throw new EmptyStackException();    
            return top.getValue();
             
                  
        }
        public boolean isEmpty(){
            return top == null;
        }
        public void printStack(){
               Node current = top;
                while (current != null) {
                    System.out.println(current.getValue());
                     current = current.getNext();

        }
        System.out.println();



    }
    public int size(){
        int count = 0;
        Node current = top;
        while (current != null) {
            count++;
            current = current.getNext();
            System.out.println(count);
        }
        return count;
        

       


    }

    

}
