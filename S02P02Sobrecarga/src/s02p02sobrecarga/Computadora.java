/*
 * Universidad Politecnica de San Luis Potosi
 * Programacion III
 * Programacion Orientada a Objetos
 */

package s02p02sobrecarga;

/**
 *
 * @author Ana Karen Cuenca Esquivel
 * @Ana Karen Cuenca Esquivel
 */
public class Computadora {
    //atributos
    String color;
    String modelo;
    String procesador;
    float precio;
    
    //metodos
    //constructor
    public Computadora(){
        System.out.println("Constructor sin parametro");
    }
    //sobrecarga del constructor
    public Computadora(float p){
        precio=p;
    }
    public Computadora(String colorr){
        color=colorr;
    }
    
    //de la clase
    public void encender() {
        System.out.println("Encendido");
    }
    public void jugar(){
        System.out.println("A jugar!!!!");
    }
    
}
