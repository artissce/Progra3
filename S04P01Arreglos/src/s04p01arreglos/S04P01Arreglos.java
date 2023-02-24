/*
 * Universidad Politecnica de San Luis Potosi
 * Programacion III
 * Programacion Orientada a Objetos
 */
package s04p01arreglos;

/**
 * @author Ana Karen Cuenca Esquivel
 * ARREGLO: es una estructura de datos que permite agrupar in conjunto de valores de un mismo tipo, 
 * bajo un mmismo nombre y accederlos a traves de un indice, que comienza en 0.
 * Pueden ser unidimensionales (vectores)
 * bidimensionales (matrices) o n-dimensionales.
 */
public class S04P01Arreglos {
    public static void main(String[] args) {
       Vector v1=new Vector();float promedio=0;
       //v1.leer();
       //v1.imprimir();
       //v1.imprimirMejor();
       //v1.mayor();
       Bidimensional bidi1=new Bidimensional();
       bidi1.leer();
       bidi1.imprimir();
       bidi1.imprimirMejorado();
       promedio=bidi1.promedio(2);
       System.out.println("El promedio es: "+promedio);
    }
}
