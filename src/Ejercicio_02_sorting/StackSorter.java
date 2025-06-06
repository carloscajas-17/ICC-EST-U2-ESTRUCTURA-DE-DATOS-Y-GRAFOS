package Ejercicio_02_sorting;

import Controllers.Stack;

public class StackSorter {

    public void sortStack(Stack original) {
        Stack auxiliar = new Stack();

        while (!original.isEmpty()) {
            int temporal = original.pop(); 

            
            while (!auxiliar.isEmpty() && auxiliar.peek() > temporal) {
                original.push(auxiliar.pop()); 
            }

            auxiliar.push(temporal); 
        }

       
        while (!auxiliar.isEmpty()) {
            original.push(auxiliar.pop());
        }
    }
}
