/*
 * Universidad Politecnica de San Luis Potosi
 * Programacion III
 * Programacion Orientada a Objetos
 */

package s03p02encapsulacion;

/**
 * REQUISITOS PARA ENCAPSULAR:
 * 1.- Las variables de instancia deben marcarse como private
 * 2.- Acada variable se le debe programar su "set"(establecer) y su "get" (obtener)
 * 
 * @author Ana Karen Cuenca Esquivel
 * @Ana Karen Cuenca Esquivel
 */
public class VideoJuego {
    //atributo
    String apodo;//definido como package private
    private String nombre;
    private String desarrollador;
    private double precio;
    private String consola;
            
    public void iniciar(){
        System.out.println("Arrancando el juego");
    }
    
    //setters y getters (establecer y obtener)
    public void setNombre(String n){
        nombre = n;
    }
    public String getNombre(){
        return nombre;
    }
    public void setPrecio(double n){
        precio = n;
    }
    public double getPrecio(){
        return precio;
    }
    public void setDesarrollador(String d){
        desarrollador=d;
    }
    public String getDesarrollador(){
        return desarrollador;
    }

    public String getConsola() {
        return consola;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }
    
}
