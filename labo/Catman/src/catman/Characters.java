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
    static int tiempoVelocidadAumentada = 5;
    static int defaultSpeed=4;
    static int max=400;//Altura por Ancho= 20x20
    int speed=4;
    char direccion;
    int x,y;
    public Characters(){
        this.estado= new boolean[20][20];
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                estado[i][j]=false;//por donde no se mueve el personaje
            }
        }
    }
    
    public void actualizaEstado(boolean[][] actualizaEstado){
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                this.estado[i][j]=actualizaEstado[i][j];//para saber si ya lo paso o no
            }
        }
    }
    
    public boolean valido(int x, int y){//define limite
        if( x >= cellSize && x< max && y>=cellSize && y<max && estado[x/20-1][y/20-1]){
            return true;
        }
        else{
            return false;
        }
    }
    
    public Rectangle forma(){//ayudara con la interseccion
        return new Rectangle(x,y,20,20);
    }
}
