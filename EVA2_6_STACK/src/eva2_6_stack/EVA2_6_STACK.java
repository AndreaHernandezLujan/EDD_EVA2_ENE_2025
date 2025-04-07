
package eva2_6_stack;


public class EVA2_6_STACK {

    
    public static void main(String[] args) {
    
       MyStack stack = new MyStack();

        // Agregar valores a la pila (push)
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        // Mostrar la pila
        System.out.println("Pila actual:");
        stack.printStack();

        try {
            // Mostrar el valor en la cima sin eliminarlo (peek)
            System.out.println("Peek (cima): " + stack.peek());

            // Sacar un elemento de la pila (pop)
            System.out.println("Pop: " + stack.pop());

            // Mostrar la pila después de un pop
            System.out.println("Pila despues de pop:");
            stack.printStack();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


    
    

