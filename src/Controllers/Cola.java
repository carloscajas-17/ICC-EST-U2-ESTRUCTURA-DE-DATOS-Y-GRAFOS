package Controllers;

import java.util.EmptyStackException;

import Materia.Models.Node;

public class Cola {
    private Node primero;
    private Node ultimo;
    public  int size;


    public Cola() {
        this.primero=null;
        this.ultimo=null;
        this.size=0;
    }






    public void add(int value) {
        Node newNode = new Node(value);
        if(isEmpty()){
            this.primero = newNode;
            this.ultimo = newNode;
            

        }else{
            this.ultimo.setNext(newNode);
            this.ultimo= newNode;


        }
        size ++;
        
    }
    public int remove(){
        if(isEmpty()){
            throw new EmptyStackException();

        }
        int value= primero.getValue();
        primero=primero.getNext();//apunta al sigueinete 
        size --;
        return value;


    }
    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return primero.getValue();
    }


    public boolean isEmpty(){
        return primero== null;
        /*int [ ] arreglo = new int[]{1,2};
        ArrayList list = new ArrayList<Integer>() 
        arrelgo. 
        */
    }

    
    public void printCola(){
        Node aux = primero;
        while(aux != null){
            System.out.println(aux.getValue());
            aux = aux.getNext();
            
        }
        System.out.println();


    }
    


    

    
}
