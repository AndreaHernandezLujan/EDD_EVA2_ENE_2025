
package eva2_3_linked_list;


public class Lista {
    
    private Nodo inicio; //Nodo ancla para el punto de inicio
    private Nodo fin;

    public Lista() {
        inicio = null;
        fin = null; //Inicio igual a null NO HAY NODOS EN LA LISTA
    }

//AGREGAR UN NODO AL FINAL DE LA LISTA
//O(N) Porque recorre todos los nodos hasta el final
//Ahora con la mejora es O(1)
    public void add(int valor) {
        //CREAR UN NODO

        Nodo nuevo = new Nodo(valor);//Se crea un nuevo nodo con el valor recibido
        if (inicio == null) { //Verificar que la lista este vacia *Si la lista esta vacia
            inicio = nuevo; //Inicio es el nuevo nodo *El nuevo nodo se convierte en el primer nodo
            fin = nuevo;
        } else {
//MOVERNOS AL FINAL (ÚLTIMO NODO)
//            Nodo temp = inicio;
//            while (temp.getSiguiente() != null) {
//                //¿Como me muevo al siguiente nodo?
//                temp = temp.getSiguiente();
//
//            }
//            //TEMP YA SE ENCUENTRA EN EL ÚLTIMO NODO
//            temp.setSiguiente(nuevo); //AÑADIR UN NODO AL FINAL DE LA LISTA

//CONECTAMOS
            fin.setSiguiente(nuevo);
            //Movemos fian al nuevo nodo (Nuevo final de la lista)
            fin = nuevo;
        }
    }
    
    public void printList() {
        Nodo temp = inicio;//Temp es una variable temporal
        while (temp != null) {
            System.out.print("[" + temp.getValor() + "]"); //TEMP BRINCA DE OBJETO 1 AL SIGUEINTE OBJETO
            temp = temp.getSiguiente();
            
        }
    }
    
    public int size(){
        int cont = 0;
        Nodo temp = inicio;
//            cont++;
        while(temp !=null){
            cont ++;
            temp = temp.getSiguiente();
    }
        return cont;
    }
    public void insertAt(int valor, int posicion) throws Exception{
     //VERIFICAR EL ESTADO DE LA LISTA
     //POSICION ES VÁLIDA
     //0 (CERO --> PRIMER NODO)
     //N - 1 (N --> CANTIDAD DE NODOS DE LA LISTA)
     if(inicio == null)//VERIFICAR SI LA LISTA TIENE NODOS (NO SE PUEDE INSERTAR EN  
         throw new Exception("La lista esta vacia");
     else{
         if(posicion < 0 || posicion >=size ()){ //si la posicion es mayor al tamaño de la lista 
             throw new Exception("La posicion " +posicion + " no es valida, tiene que estar entre 0 y " + size());
         }else{ //TODO BIEN
             Nodo nuevo = new Nodo(valor);
         //Mover el nodo una posicionprevia a la sinsercion
          if (posicion == 0){
              nuevo.setSiguiente(inicio);
              inicio = nuevo;
          }
              Nodo temp = inicio;
             
              int cont =0;
            while (cont <(posicion-1)) {
            cont++;
           
                //¿Como me muevo al siguiente nodo?
                temp = temp.getSiguiente();
             
         }
            //RECONECTAR
           nuevo.setSiguiente(temp.getSiguiente());
           temp.setSiguiente(nuevo);
     
    
    }
}
 
    }
//VACIAR LA LISTA (ELIMINAR TODOS LOS NODOS)
//O (1)
public void clear(){
inicio = null;
fin = null;
}

public boolean isEmpty(){
if(inicio == null){
return true;
}else
return false;
}
public void Eliminar(int posicion) throws Exception {
    if (inicio == null || posicion < 0 || posicion >= size()) 
        throw new Exception("Posición inválida o lista vacía.");//Verifica si la lista esta vacia o si la posición es invalida

    if (posicion == 0) { // Eliminar el primer nodo
        inicio = inicio.getSiguiente(); 
        if (inicio == null) 
            fin = null; 
        return;
    }

 Nodo temp = inicio;
    for (int i = 0; i < posicion - 1; i++) //Se utiliza un bucle for para movernos en el nodo anterior que queriamos eliminar
        temp = temp.getSiguiente(); //tem empieza en inicio (100)

    temp.setSiguiente(temp.getSiguiente().getSiguiente());//temp.siguiente apunta al nodo que queremos eliminar temp.getSiguiente .getsiguiente apunta a 300 saltandose a el 200 y lo elimina de la lista
    if (temp.getSiguiente() == null) 
        fin = temp; // Si eliminamos el último nodo, actualizamos `fin`
}
/////////////////////////////////////Metodo para buscar valor en la lista//////////////////////////////////////////////

public int findKth(int posicion) throws Exception {
    if (inicio == null || posicion < 0) { // Si la lista está vacía o la posición es negativa
        throw new Exception("Lista vacía o posición inválida.");
    }

    Nodo temp = inicio;
    int contador = 0;

    while (temp != null) {
        if (contador == posicion) { // Si encontramos la posición, devolvemos el valor
            return temp.getValor();
        }
        temp = temp.getSiguiente(); // Avanzamos al siguiente nodo
        contador++;
    }

    throw new Exception("Posición fuera de rango."); // Si la posición es mayor que el tamaño de la lista, entonces no se encuentra
}

}



   









    

    



