
package eva2_7_arbol_binario;


public class EVA2_7_ARBOL_BINARIO {

   
    public static void main(String[] args) {
        // TODO code application logic here
      Arbol1B arbol1B = new Arbol1B();
      arbol1B.add(13);
      arbol1B.add(10);
      arbol1B.add(18);
      arbol1B.add(2);
      arbol1B.add(11);
      arbol1B.add(17);
      arbol1B.add(20);
      arbol1B.add(16);
      
      // Imprimir los recorridos
        System.out.println("Recorrido INORDEN:");
        arbol1B.inorder();

        System.out.println("Recorrido PREORDEN:");
        arbol1B.preorder();

        System.out.println("Recorrido POSTORDEN:");
        arbol1B.postorden();
    
    }
    
}
