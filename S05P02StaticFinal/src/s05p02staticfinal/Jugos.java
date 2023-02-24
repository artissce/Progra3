/*
 * Universidad Politecnica de San Luis Potosi
 * Programacion III
 * Programacion Orientada a Objetos
 */

package s05p02staticfinal;

/** instancias->objetos
 * AGREGUE:
 * - Al menos un metodo "normal" y un metodo static,pruebe ambos en el main LISTOO
 * - Defina al menos una variable "normal" y 2 variables static. Uselas en 
 * la clase principal (al menos debe notarse que cambio su valor para
 * todas las instancias.
 * - Defina una "variable" static final e imprima su valor LISTOO
 * @author Ana Karen Cuenca Esquivel
 * @Ana Karen Cuenca Esquivel
 */
public class Jugos {
    //atributos
    String modelo;
    static float precio;
    static String marca;
    static final int LITROS =2;
    
    public void beber(){
        System.out.println("bebiendo el jugo");
    }
    public static void reciclarEnvase(){
        System.out.println("Reciclando botella del jugo");
    }
}
