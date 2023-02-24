/*
 * Universidad Politecnica de San Luis Potosi
 * Programacion III
 * Programacion Orientada a Objetos
 */

package s04p01arreglos;
import java.util.Scanner;
/**
 * @author Ana Karen Cuenca Esquivel
 * @Ana Karen Cuenca Esquivel
 */
public class Vector {
    int a[]=new int[5];//5 es el tamano del arreglo, su indice 0-4
    int []b=new int[5];
    float []c=new float[5];
    
    //Leer 
    public void leer(){
        Scanner entrada=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Dime el elemento en la posicion "+i+": ");
            a[i] =entrada.nextInt();
        }
    }
    //imprimir
    public void imprimir(){
        for (int i = 0; i < 5; i++) {
            System.out.println("El elemento en la posicion "+i+": "+a[i]);
        }
    }
    //imprimir con for mejorado (enhanced for)
    public void imprimirMejor(){
        for (int x: a) {
            System.out.println(x);
        }
    }
    //cree un metodo "mayor" que devuelve el numero mayor en el arreglo
    public void mayor(){
        int mayor=a[0];
        for (int i = 1; i < 5; i++) {
            if(a[i]>mayor){
                mayor=a[i];
            }
        }
        System.out.println("El mayor es "+ mayor);
    }
    //metodo ordenar por cualquier metodo menos burbuja
    //Método ordenar por cualquier metodo menos burbuja
    public void ordenar () {
        int aux = 0, min = 0;
        for(int i = 0; i < 5; i++) {
            min = i;
            for (int j =i+1; j < 5; j++) {
                if (a [min]> a[j]) {
                    min = j;
                }
        }
        aux = a[i];
        a [i]
        = a [min];
        a [min] = aux;
        }
    }
    public void imprimirOrdenar () {
        for (int i = 0; i < 5; i++) 
        System.out.println(a[i]);
    }
}
