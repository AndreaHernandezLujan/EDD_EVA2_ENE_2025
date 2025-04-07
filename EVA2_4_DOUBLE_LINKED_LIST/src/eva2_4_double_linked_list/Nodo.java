
package eva2_4_double_linked_list;


public class Nodo {
    private int valor; //Guarda el dato del nodo
    private Nodo siguiente;//Apunta al siguiente nodo en la lista
    private Nodo previo;
    
    public Nodo(){
        siguiente = null; //No hay nodo más adelante, al crear un nodo sin valor, no apunta a otro nodo
    }

    public Nodo getPrevio() {
        return previo;
    }

    public void setPrevio(Nodo previo) {
        this.previo = previo;
    }

    public Nodo(int valor) {
        this.valor = valor;//Se asigna el valor al nodo
        siguiente = null; //Inicialmente no tiene siguiente nodo
        previo = null;
    }

    public int getValor() {
        return valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
