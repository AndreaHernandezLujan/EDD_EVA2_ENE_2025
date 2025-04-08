

package eva2_7_arbol_binario;

public class Arbol1B {
    private Nodo root;

    public Arbol1B() {
        root = null; // Árbol vacío
    }
    
    // Método para agregar nodos al árbol
    public void add(int valor) {
        Nodo nuevo = new Nodo(valor);
        if (root == null) {
            root = nuevo;
        } else {
            addRecu(valor, root);
        }
    }
    
    private void addRecu(int valor, Nodo actual) {
        if (valor < actual.getValor()) { // Va a la izquierda
            if (actual.getIzquierda() == null) {
                actual.setIzquierda(new Nodo(valor));
            } else {
                addRecu(valor, actual.getIzquierda());
            }
        } else if (valor > actual.getValor()) { // Va a la derecha
            if (actual.getDerecha() == null) {
                actual.setDerecha(new Nodo(valor));
            } else {
                addRecu(valor, actual.getDerecha());
            }
        }
    }
    
    // Método de recorrido en INORDEN (izquierda - raíz - derecha)
    public void inorder() {
        inorderRec(root);
        System.out.println("");
    }

    private void inorderRec(Nodo actual) {
        if (actual != null) {
            inorderRec(actual.getIzquierda()); // Recorre el lado izquierdo
            System.out.print("[ " + actual.getValor() + " ]"); // Imprime el nodo actual
            inorderRec(actual.getDerecha()); // Recorre el lado derecho
        }
    }

    // Método de recorrido en PREORDEN (raíz - izquierda - derecha)
    public void preorder() {
        preorderRec(root);
        System.out.println("");
    }

    private void preorderRec(Nodo actual) {
        if (actual != null) {
            System.out.print("[ " + actual.getValor() + " ]"); // Primero el nodo actual
            preorderRec(actual.getIzquierda()); // Luego el subárbol izquierdo
            preorderRec(actual.getDerecha()); // Finalmente el subárbol derecho
        }
    }

    // Método de recorrido en POSTORDEN (izquierda - derecha - raíz)
    public void postorden() {
        postordenRec(root);
        System.out.println("");
    }

    private void postordenRec(Nodo actual) {
        if (actual != null) {
            postordenRec(actual.getIzquierda()); // Recorre el lado izquierdo
            postordenRec(actual.getDerecha()); // Recorre el lado derecho
            System.out.print("[ " + actual.getValor() + " ]"); // Imprime el nodo actual
        }
    }
}




















