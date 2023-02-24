/*
 * Universidad Politecnica de San Luis Potosi
 * Programacion III
 * Programacion Orientada a Objetos
 */

package s05p02staticfinal;

/**
 * STATIC: 
 * - Metodos STATIC: no requieren un objeto para ejecutarse
 * la manera correcta de llamarlos es usando el nombre de la clase.
 * - Variable STATIC - Se conoce tambien como "variables de 
 * clase", ya que si cambias el valor para cada instancia, se cambia para todos.
 * - STATIC FINAL : son constantes que se deben definir al momento 
 * de declararse y sus nombres (por regla) deben 
 * escribirse solo con mayusculas
 * 
 * @author Ana Karen Cuenca Esquivel
 * @Ana Karen Cuenca Esquivel
 */
public class Autos {
    //Atributos
    int anio;
    String modelo;
    static String marca;
    static final int LLANTAS =4;
    
    //Metodos
    public void acelerar(){
        System.out.println("Acelerando");
    }
    public static void frenar(){
        System.out.println("Deteniendomeeeee");
    }
}
