
package eva2_7_arbol_binario;


public class Nodo {
    private int valor;
    private Nodo derecha;
    private Nodo izquierda;
    
    
    public Nodo() {
        derecha = null;
        izquierda = null;
    }
//    public Nodo(Nodo previo) {
//        previo = null;
//    }
        
    public Nodo(int valor) {
        this.valor = valor;
        derecha = null;
        izquierda = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }
    
    
}
