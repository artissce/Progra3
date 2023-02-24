/*
 * Universidad Politecnica de San Luis Potosi
 * Programacion III
 * Programacion Orientada a Objetos
 */

package s03p02encapsulacion;

/**
 *
 * @author Ana Karen Cuenca Esquivel
 * @Ana Karen Cuenca Esquivel
 */
public class Karaoke {
    private String lugar;
    String cancion;
    private int botones;
    private String color;

    public String getLugar() {
        return lugar;
    }
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    public String getCancion() {
        return cancion;
    }
    public void setBotones(int botones) {
        this.botones = botones;
    }
    public int getBotones(){
        return botones;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    
    public void cantar(String cantante, String cancion, String lugar,int botones, String color){
        System.out.println("La persona "+cantante+" canta la cancion "+cancion+" en la direccion "+lugar+" y la maquina tiene color "+ color+" y tiene "+ botones +" botones");
    }
    
}
