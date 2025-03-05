
package eva2_1_examen_1ra;

import java.util.Scanner;

public class EVA2_1_EXAMEN_1RA {

    public static void main(String[] args) {
        int arreglo1[], arreglo2[]; //Se declaran dos arreglos enteros sin definir su tamaño
        Scanner captu = new Scanner(System.in);
        System.out.println("tamaño de los arreglos:");//Se le pide al usuario que ingrese el tamaño de los arreglos
        int tama = captu.nextInt();//Captura el tamaño ingresado y lo almacena en tama
        arreglo1 = new int[tama]; //Se inicializan los arreglos con el tamaño ingresado por el usuario
        arreglo2 = new int[tama];

        //Captura de datos para el primer arreglo
        for (int i = 0; i < arreglo1.length; i++) {
            System.out.println("Dato " + (i + 1) + " del arreglo 1:");
            arreglo1[i] = captu.nextInt();
            captu.nextLine();
        }
        //Captura de datos para el segundo arreglo
        System.out.println("");
        for (int i = 0; i < arreglo2.length; i++) {
            System.out.println("Dato " + (i + 1) + " del arreglo 2:");
            arreglo2[i] = captu.nextInt();
            captu.nextLine();
        }
        //Imprimir los valores del arreglo1
        for (int j = 0; j < tama; j++) {
            System.out.print("[" + arreglo1 + "]");
        }
        //Imprimir los valores del arreglo2
        for (int i = 0; i < tama; i++) {
            System.out.print("[" + arreglo1 + "]");
        }
        System.out.println("");
        
    //TAREA
   // Llamada al método para comparar los arreglos
        if (compararArreglos(arreglo1, arreglo2)) {
            System.out.println("Los arreglos son IGUALES.");
        } else {
            System.out.println("Los arreglos NO son IGUALES.");
        }
    }

    // Método para comparar los arreglos
    public static boolean compararArreglos(int[] arreglo1, int[] arreglo2) {
        // Verifica si los arreglos tienen el mismo tamaño
        if (arreglo1.length != arreglo2.length) {
            return false;
        }

        // Compara los valores en cada posición
        for (int i = 0; i < arreglo1.length; i++) {
            if (arreglo1[i] != arreglo2[i]) {
                return false; // Si hay alguna diferencia, los arreglos no son iguales
            }
        }

        // Si no hubo diferencias, los arreglos son iguales
        return true;
    }

}

