package s04p01arreglos;

import java.util.Scanner;

/*
 * Universidad Politecnica de San Luis Potosi
 * Programacion III
 * Programacion Orientada a Objetos
 */

/**
 *
 * @author Ana Karen Cuenca Esquivel
 * @Ana Karen Cuenca Esquivel
 */
public class Bidimensional {
    int a[][]=new int[3][5];
    public void leer(){
        Scanner entrada=new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Dime el elemento en la posicion bidi "+i+j+": ");
                a[i][j] =entrada.nextInt();
            }
        }
    }
    public void imprimir(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    
    public void imprimirMejorado(){
        for (int x[]: a) {
            for (int y:x) {
                System.out.print(y+" ");
            }
            System.out.println("");
        }
    }
    //suponga que el indice que llega a 3 son las califcaciones paraciales de 5 alumnos
    //Haga un metodo que solicite al usuario el numero(indice) de un alumno y devuelva el promedio de los tres parciales.
    public float promedio(int indice){
        indice=indice-1;
        float prom=0;int suma=0;
        for (int i = 0; i < 3; i++) {
                suma+=a[i][indice];
        }
        prom=(float)suma/3f;
        return prom;
    }
}
