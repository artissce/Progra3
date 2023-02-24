/*
 * Universidad Politecnica de San Luis Potosi
 * Programacion III Java
 * Programacion Orientada a Objetos
 */

package s010p01holamundo;

/**
 *
 * @author Ana Karen Cuenca Esquivel
 * @Ana Karen Cuenca Esquivel
 */
public class Perro {
    int patas;
    String color;
    String raza;
    String nombre;
    int edad;
    
    public Perro(){
        patas=4;
        edad=0;
    }
    public void ladrar(){
        System.out.println("Guau guau!");
    }
    public void comer(){
        System.out.println("Estoy comiendo guau!");
    }  
    public void caminar(){
        System.out.println("Caminando guau!");
    }    
    /*SOBRECARGA}
    -2 o + metodos que se llaman igual
    -Reciben parametros diferentes
    */
}
