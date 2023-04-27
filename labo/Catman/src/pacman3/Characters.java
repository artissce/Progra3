/*
 * Universidad Politecnica de San Luis Potosi
 * Programacion III Java
 * Programacion Orientada a Objetos
 */

package pacman3;

import java.awt.Rectangle;

/**
 *
 * @author Ana Karen Cuenca Esquivel
 * @Ana Karen Cuenca Esquivel
 */
public class Characters {
    int index=0;
    boolean states[][];
    static int cellSize=20;
    static int max=400;//Altura por Ancho= 20x20
    static int speed=4;
    char direction;
    int x,y;
    
    public Characters(){
        states= new boolean[20][20];
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                states[i][j]=false;
            }
        }
    }
    
    public void updateState(boolean[][] Updatestates){
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                this.states[i][j]=Updatestates[i][j];
            }
        }
    }
    
    public boolean isValid(int x, int y){//define limite
        if( x > cellSize && x< max && y>cellSize && y<max && states[x/20-1][y/20-1]){
            return true;
        }
        else{
            return false;
        }
    }
    
    public Rectangle getShape(){
        return new Rectangle(x,y,20,20);
    }
}
