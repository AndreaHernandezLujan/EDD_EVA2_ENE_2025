
package eva2_9_tipos_genericos;


public class EVA2_9_TIPOS_GENERICOS {

   
    public static void main(String[] args) {
    //ClASES PARA LOS TIPOS DE DATOS GENÉRICOS
    //int --> Integer
    //double --> Double
    //float --> Float
    Nodo<String> nodo = new Nodo ();//Se especifica que tipo de valor va a guardar
    nodo.setValor("Hola mundo!!!");
        System.out.println(nodo.getValor());
    Nodo<Double> nodo2 = new Nodo ();//Se especifica que tipo de valor va a guardar
    nodo2.setValor(1000.8); 
     System.out.println(nodo2.getValor());
    
    }
    
}             //TIPOS DE DATOS GENÉNERICOS NO FUNCIONAN
class Nodo<T>{//Tipo de dato generico al momento de que se declare entre corchetes se pone le tipo de dato
    private T valor;
    private Nodo siguiente;
    private Nodo previo;
    
    public Nodo(){
    siguiente = null;
    previo = null;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public Nodo(T valor) {
        this.valor = valor;
    }
}
