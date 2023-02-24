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
public class Mesa {
    int patas;
    String color;
    String material;
    
    //Métodos
    //Constructot
    public Mesa(){
        patas = 4;
        color = "Cafe";
        material = "Madera";
    }
    
    public void existir(){
        System.out.println("Soy una mesa y existo!");
    }
    
    public void soportar(){
        System.out.println("Estoy cargando objetos!");
    }
    
    public void mover(){
        System.out.println("Me estan moviendo!");
    }
    
    
}
