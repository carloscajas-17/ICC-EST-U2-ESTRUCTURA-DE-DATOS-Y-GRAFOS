package Controllers;

import java.util.EmptyStackException;

import Materia.Models.NodeGeneric;

public class ColaG<T> {

    private int size;
    private NodeGeneric<T> primero;
    private NodeGeneric<T> ultimo ;
    
    public ColaG() {
        this.size = 0;
        this.primero = null;
        this.ultimo = null;
    }
    public void add(T value){
        NodeGeneric<T> newNode = new NodeGeneric<>(value);
        if (this.size == 0) {
            this.primero = newNode;
            this.ultimo = newNode;
        } else {
            this.primero = newNode;
            this.ultimo.setNext(newNode);
        }


    }
    public T remove(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        T value = primero.getValue();
        primero = primero.getNext();
        return value;
    }
    public T peek(){
        if ( isEmpty()){
            throw new EmptyStackException();
        }
        return primero.getValue();
    }
    public boolean isEmpty(){
        return primero ==  null;

    }
     

    public int size(){
        int count = 0;
        NodeGeneric<T> current  = primero;
        while ( current != null){
            count ++;
            current = current.getNext();
            
            
        }
        return count;
        
    }

    public void printColaG(){
        NodeGeneric<T> aux= primero;
        while( aux != null){
            System.out.print(aux.getValue() + " ");
            aux = aux.getNext();
        }
        System.out.println();
    }
    
}
