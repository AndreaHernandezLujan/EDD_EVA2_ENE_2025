
package eva2_3_linked_list;

public class EVA2_3_LINKED_LIST {

    public static void main(String[] args) {
        // TODO code application logic here
//        int datos[]= new int[1000000];
//        long ini= System.nanoTime(); //Me regresa el tiempo en un entero, tomas la hora de inico y la hora final y lo restas
//        for (int i = 0; i < 1000000; i++) {
//            datos[i] = (int)(Math.random()*1000);
//            
//        }
//        long fin = System.nanoTime();
//        long tiempo = fin - ini;
//        System.out.println("Tiempo arreglo: " + tiempo);
//        
//        Lista lista = new Lista ();//SE CREA UNA LISTA VACIA
//        ini = System.nanoTime();
//        for (int i = 0; i < 1000000; i++) {
//            lista.add((int)(Math.random()* 1000));
//            
//        }
//        fin = System.nanoTime();
//        tiempo = fin - ini;
//        System.out.println("Tiempo lista: " + tiempo);
//        System.out.println("Tamaño de la lista: " + lista.size());
//        lista.add(100);//SE AGREGAN VALORES A LA LISTA
//        lista.add(200);
//        lista.add(300);
//        lista.add(400);
//        lista.add(500);
//        lista.printList();//METODO IMPRIMIR LISTA SE IMPRIME EN LA CONSOLA
        Lista lista = new Lista();
        lista.add(100);//posicion 0
        lista.add(200);//1
        lista.add(300);//2
        lista.add(400);//3
        lista.add(500);//4
        lista.printList();
        System.out.println("");
        System.out.println("Cantidad de nodos:" + lista.size());
        try {
            lista.insertAt(3, 3); //insertar el valor 3 en la posición
        } catch (Exception e) {
            e.printStackTrace();
        }
        lista.printList();
        System.out.println("Cantidad de nodos:" + lista.size());
//    lista.clear();
        lista.printList();
        System.out.println("Cantidad de nodos:" + lista.size());
        System.out.println("Cantidad de nodos:" + lista.isEmpty());
/////////////////////////////////////////////////////////////////////////////////////////
        try {
            lista.Eliminar(2);
            System.out.println("Lista despues de eliminar el elemento en la posicion 2:");
            lista.printList();
            System.out.println();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());

////////////////////////////////////Buscar /////////////////////////////////////////////////
            
        }


try {
    int valor = lista.findKth(2); 
    System.out.println("Lista despues de buscar el elemento en la posicion 2:");
    System.out.println("El valor en la posicion 2 es: " + valor);
    lista.printList();
} catch (Exception ex) {
    System.out.println("Error: " + ex.getMessage());
}

            }
    }

