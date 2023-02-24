/*
 * Universidad Politecnica de San Luis Potosi
 * Programacion III
 * Programacion Orientada a Objetos
 */

package s010p01holamundo;

/**
 *
 * @author Ana Karen Cuenca Esquivel
 * @Ana Karen Cuenca Esquivel
 */
public class Silla {
    int patas;
    boolean asiento;
    String material;
    String color;

    //metodos
    public void cargar(){
        System.out.println("Estoy cargando!");
    }
    //constructor
    public Silla(){
        material="Madera";
    }
    
}
