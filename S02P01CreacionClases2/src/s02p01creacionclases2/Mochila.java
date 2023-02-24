/*
 * Universidad Politecnica de San Luis Potosi
 * Programacion III Java
 * Programacion Orientada a Objetos
 */

package s02p01creacionclases2;

/**
 *
 * @author Ana Karen Cuenca Esquivel
 * @Ana Karen Cuenca Esquivel
 */
public class Mochila {
    String color;
    int cierres;
    String tamaño;

    //Métodod
    //Constructor
    public Mochila(){
        color = "Azul";
        cierres = 10;
        tamaño = "Mediana";     
    }
    
    public void abrir(){
        System.out.println("Me abrieron!");
    }
    
    public void cargar(){
        System.out.println("Me estan cargando!");
    }
    
    public void lanzar(){
        System.out.println("Me han lanzado!");
    }
    
}

