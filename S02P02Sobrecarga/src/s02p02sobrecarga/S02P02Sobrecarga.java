/*
 * Universidad Politecnica de San Luis Potosi
 * Programacion III
 * Programacion Orientada a Objetos
 */
package s02p02sobrecarga;

/**
 *
 * @author Ana Karen Cuenca Esquivel
 */
public class S02P02Sobrecarga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Computadora c1=new Computadora();
        Computadora c2=new Computadora(112.2f);
        Computadora c3=new Computadora("azul");
        c1.modelo="thinkcenter";
        System.out.println("Modelo de c1: "+c1.modelo);
        System.out.println("El precio de c2 es "+c2.precio);
        System.out.println("El color de c3 es " +c3.color);
    }
    
}
