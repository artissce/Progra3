/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package s02p01creacionclases;

/*
CREA DOS NUEVAS CLASES QUE:
-Inicien con tu primra letra de apellido
-Contengan al menos 3 variables de instancia
-3 Métodos
-Programar explicitamete el constructor y modifiue al menos una varable
-En el driver class cree al menos 2 objetos de cada clase y prueb todos los métodos y use todas las variables
*/

public class S02P01CreacionClases {

    public static void main(String[] args) {
        Mesa m1 = new Mesa();
        Mesa m2 = new Mesa();
        
        System.out.println("MESAS");
        
        System.out.println("La mesa 1 tiene "+m1.patas+" patas");
        
        m2.patas = 3;
        System.out.println("La mesa 2 tiene "+m2.patas+" patas");
        
        System.out.println("Las mesas son de "+m1.material);
        
        System.out.println("Las mesas son de color "+m1.color);
        
        m1.existir();
        m1.soportar();
        m1.mover();
        
        System.out.println("MOCHILAS");
        
        Mochila moc1 = new Mochila();
        Mochila moc2 = new Mochila();
        
        System.out.println("Ambas mochilas tienen "+moc1.cierres+" cierres");
        System.out.println("Ambas mochilas son de color "+moc1.color);
        System.out.println("Ambas mochilas son de tamaño "+moc2.tamaño);
        
        moc1.abrir();
        moc1.cargar();
        moc1.lanzar();
        
    }
    
}
