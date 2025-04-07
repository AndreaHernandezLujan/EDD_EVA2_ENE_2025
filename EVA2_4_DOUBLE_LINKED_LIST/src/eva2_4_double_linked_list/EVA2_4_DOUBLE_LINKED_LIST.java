
package eva2_4_double_linked_list;

public class EVA2_4_DOUBLE_LINKED_LIST {

    public static void main(String[] args) {
        // TODO code application logic here
        ListaDoble lista = new ListaDoble();
        lista.add(100);//posicion 0
        lista.add(200);//1
        lista.add(300);//2
        lista.add(400);//3
        lista.add(500);//4
        lista.printList();
        lista.PrintListInverso();
        System.out.println("Cantidad de nodos:" + lista.size());

        System.out.println("");
        System.out.println("Cantidad de nodos:" + lista.size());
        try {
            lista.insertAt(3, 3); //insertar el valor 3 en la posición
        } catch (Exception e) {
            e.printStackTrace();
        }

        lista.printList();
        lista.PrintListInverso();
        System.out.println("Cantidad de nodos:" + lista.size());

///////////////////////////////////////////Eliminar////////////////////////////////////////////////
        try {
            lista.eliminar(2);
            System.out.println("Lista despues de eliminar el elemento en la posicion 2:");
            lista.printList();
            lista.PrintListInverso();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Cantidad de nodos:" + lista.size());
///////////////////////////////////////Buscar////////////////////////////////////////////////////
        try {
            lista.findKth(4);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}


