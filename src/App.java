import java.util.Scanner;

import Controllers.Cola;
import Controllers.ColaG;
import Controllers.Stack;
import Controllers.StackG;
import Ejercicio_01_sign.SingValidator;
import Ejercicio_02_sorting.StackSorter;
import Materia.Models.Persona;
import java.util.Scanner;



public class App {
  public static void main(String[] args) throws Exception {
       /* 

       // PILA


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


      
      /*
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

        colaP.findByName("David");
        //Persona pEliminada = colaP.remove();
        Persona pEliminada = colaP.removeByName("David");
        if (pEliminada != null) {
          System.out.println("pEliminada => " + pEliminada.getNombre());
        } else {
          System.out.println("pEliminada => null (si no encontró)");
      }
        */

        // Método main para pruebas rápidas





    Scanner scanner = new Scanner(System.in);

        // === VALIDACIÓN DE SIGNOS ===
        System.out.println("===== VALIDADOR DE SIGNOS =====");
        System.out.print("Ingresa una cadena con signos (), [], {}: ");
        String entradaSignos = scanner.nextLine();

        boolean resultado = SingValidator.isValid(entradaSignos);
        if (resultado) {
            System.out.println("True--> La cadena es válida.");
        } else {
            System.out.println("False --> La cadena no es válida.");
        }

        // === ORDENAMIENTO DE PILA ===
        Stack pila = new Stack();
        System.out.println("\n===== ORDENADOR DE PILA =====");
        System.out.println("Ingresa números enteros uno por uno-manera ordenada .");
        System.out.println("Escribe 'fin' para terminar e iniciar la ordenación.");

        while (true) {
            System.out.print("Número: ");
            String entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("fin")) {
                break;
            }

            try {
                int numero = Integer.parseInt(entrada);
                pila.push(numero);
            } catch (NumberFormatException e) {
                System.out.println("ERROR --> Ingresa un número válido o escribe 'fin'.");
            }
        }

        System.out.println("\nPila antes de ordenar: " + pila);

        StackSorter sorter = new StackSorter();
        sorter.sortStack(pila);

        System.out.println("Pila después de ordenar: " + pila);

        scanner.close();
    }
}


       




      


       
        


    

