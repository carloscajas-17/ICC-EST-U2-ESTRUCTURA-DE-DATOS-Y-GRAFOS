package Controllers;

import Materia.Models.NodeGeneric;

public class StackG<T> {
    private NodeGeneric<T> top;
    private int size;

    public StackG() {
        this.top = null;
        this.size = 0;
    }

    public void push(T value) {
        NodeGeneric<T> newNode = new NodeGeneric<>(value);
        newNode.setValue(value);
        newNode.setNext(top);
        top = newNode;
        size++;
    }

    public T pop() {
        if (top == null) {
            return null; // No hay elementos
        }
        T value = top.getValue();
        top = top.getNext();
        size--;
        return value;
    }
       

    public T peek() {
        if (top == null) {
            return null; // Pila vacía
        }
        return top.getValue();
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void printStack() {
        NodeGeneric<T> current = top;
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
        System.out.println();
    }

    public int size() {
        return size;
    }
}
