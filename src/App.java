import Controllers.Cola;
import Controllers.ColaG;
import Controllers.Stack;
import Controllers.StackG;
import Materia.Models.Persona;



public class App {
    public static void main(String[] args) throws Exception {
       /* 
       Stack stack = new Stack();
        stack.push(10);
        stack.push(-1);
        stack.push(5);
        stack.push(8);
        System.out.println("Tam ="+stack.size());
        stack.printStack();
        stack.pop();
        //stack.peek();
        System.out.println("Tamm ="+stack.size());
        stack.printStack();    
        */
      
      
      
      
        //COLA


      /* 
      Cola.cola= new Cola();
      cola.add(5);
      cola.add(7);
      cola.add(10);
      System.out.println("tam ="+ cola.size);
      cola.pritnCola();
      cola.remove();
      System.out.println("tam = "+cola.size);
      cola.printCola();
      */


      Cola cola = new Cola();
        cola.add(5);
        cola.add(7);
        cola.add(10);
        System.out.println("Tam: " + cola.size);
        cola.printCola();
        cola.remove();
        System.out.println("Tam: " + cola.size);
        cola.printCola();
        System.out.println("COLA GENERICA");
        Persona p1 = new Persona("Pablo");
        Persona p2 = new Persona("Juan");
        Persona p3 = new Persona("María");
        ColaG<Persona> colaP = new ColaG<>();
        colaP.add(p1);
        colaP.add(p2);
        colaP.add(p3);
        System.out.println("Tamaño de la cola: " + colaP.size());
        colaP.printColaG();
        System.out.println("Tiene a la persona -> " + colaP.remove());
        System.out.println(colaP.size());
        colaP.printColaG();






      


       
        


    }
}
