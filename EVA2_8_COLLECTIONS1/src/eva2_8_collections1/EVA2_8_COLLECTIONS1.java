
package eva2_8_collections1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;


public class EVA2_8_COLLECTIONS1 {

    public static void main(String[] args) {
        LinkedList<Integer> miLista = new LinkedList(); //Listas, es una clase de Java
        miLista.add(100);//0
        miLista.add(200);//1
        miLista.add(300);//2
        miLista.add(400);//3
        miLista.add(500);//4
        miLista.add(600);//5
        System.out.println(miLista);
        miLista.remove(3);
        System.out.println(miLista);
        miLista.add(2,999999);
        System.out.println(miLista);
        
        
        System.out.println("");
        
        System.out.println("ArrayList"); //ArrayList arreglos dinamicos, es una clase de Java
        ArrayList<String> miArrayList = new ArrayList();
        miArrayList.add("Hola");
        miArrayList.add(" ");
        miArrayList.add("mundo");
        miArrayList.add(" ");
        miArrayList.add("Cruel");
        miArrayList.add(" ");
        miArrayList.add("!!");
        System.out.println(miArrayList);
        for (int i = 0; i < miArrayList.size(); i++) {
            System.out.println("[" + miArrayList.get(i) + "]");
            
        }
        
        //QUEUES es una interfaz
        System.out.println("");
        System.out.println("QUEUES");
        Queue<Integer> myQueue = new LinkedList(); //Polimorformismo es una lista enlazada que se va a comportar como un Queue
        myQueue.add(100);
        myQueue.add(200);
        myQueue.add(300);
        myQueue.add(400);
        myQueue.add(500);
        System.out.println(myQueue.peek());
        System.out.println(myQueue);
        System.out.println(myQueue.poll());
        System.out.println(myQueue);
        
        System.out.println("");
        //Stack
        System.out.println("Stack");
        Stack<Integer> stack = new Stack();
        stack.push(100);
        stack.push(200);
        stack.push(300);
        stack.push(400);
        stack.push(500);
        System.out.println("CIMA:" + stack.peek());
        System.out.println(stack);
        System.out.println("CIMA: " + stack.pop());
        System.out.println(stack);
        
        
        System.out.println("");
        //CONJUNTOS
        //SET
        HashSet<String> Conjunto = new HashSet();
        Conjunto.add("Rojo");
        Conjunto.add("Azul");
        Conjunto.add("Verde");
        Conjunto.add("Amarillo");
        Conjunto.add("Amarrillo");
        Conjunto.add("Amarillo"); //NO ACEPTA TERMINOS REPETIDOS
        System.out.println(Conjunto);
        
        
        System.out.println("");
        //MAPAS (MAPS)
        Map<String, Integer> map = new HashMap();
        map.put("LUNES", 1);
        map.put("MARTES", 2);
        map.put("MIERCOLES", 3);
        map.put("JUEVES", 4);
        map.put("VIERNES", 5);
        map.put("SABADO", 6);
        map.put("DOMINGO", 7);
        System.out.println(map.get("LUNES"));
        System.out.println(map);
    }
    
}
