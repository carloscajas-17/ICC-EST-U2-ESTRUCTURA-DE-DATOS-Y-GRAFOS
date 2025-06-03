package Materia.Models;



public class Node{
    private int value;
    private Node next;

    public Node(int value) {
        this.value=value;
        this.next=null; //// NULO ES NAD APOR ESO S EPONER YA QUE AL PONER CWEOR SE DA UN VALOR 
    }
    


    @Override
    public String toString() {
        return "Node [value=" + value + ", next=" + next + "]"; // EL NEXT ES EL SIGUIENTE NODO VA EN SECUENCIA AL USAR EL NEXT POR INTERMAENTE TIENE SU TO STRING  Y SE IMPRIME TODO
    }



    public int getValue() {
        return value;
    }



    public void setValue(int value) {
        this.value = value;
    }



    public Node getNext() {
        return next;
    }



    public void setNext(Node next) {
        this.next = next;
    }
   

}