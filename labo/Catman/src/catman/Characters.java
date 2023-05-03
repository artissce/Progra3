/*
 * Universidad Politecnica de San Luis Potosi
 * Programacion III Java
 * Programacion Orientada a Objetos
 */

package catman;
import java.awt.Rectangle;

/**
 *
 * @author Ana Karen Cuenca Esquivel
 * @Ana Karen Cuenca Esquivel
 */
public class Characters {
    int index=0;
    boolean estado[][];
    static int cellSize=20;
    static int max=400;//Altura por Ancho= 20x20
    static int speed=4;
    char direccion;
    int x,y;
    
    public Characters(){
        estado= new boolean[20][20];
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                estado[i][j]=false;
            }
        }
    }
    
    public void actualizaEstado(boolean[][] actualizaEstado){
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                this.estado[i][j]=actualizaEstado[i][j];
            }
        }
    }
    
    public boolean valido(int x, int y){//define limite
         // Definimos los límites superior e inferior de las celdas del mapa
    int cellTop = cellSize;
    int cellBottom = max - cellSize;
    
    // Verificamos que las coordenadas estén dentro de los límites del mapa
    if (x >= cellSize && x < max - cellSize && y >= cellSize && y < max - cellSize) {
        // Verificamos que las coordenadas estén dentro de una celda libre del mapa
        int cellX = (x - cellSize) / cellSize;
        int cellY = (y - cellSize) / cellSize;
        if (estado[cellY][cellX] == false) {
            return true;
        }
    }
    return false;
    }
    
    public Rectangle forma(){//ayudara con la interseccion
        return new Rectangle(x,y,20,20);
    }
}
