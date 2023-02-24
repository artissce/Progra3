/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package s02p01creacionclases;

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
