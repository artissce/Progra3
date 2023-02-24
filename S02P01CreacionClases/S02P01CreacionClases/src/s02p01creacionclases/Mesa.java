/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package s02p01creacionclases;

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
