/*
 * Universidad Politecnica de San Luis Potosi
 * Programacion III Java
 * Programacion Orientada a Objetos
 */

package catman;

import static catman.Game.board;

/**
 *
 * @author Ana Karen Cuenca Esquivel
 * @Ana Karen Cuenca Esquivel
 */
public class Koke extends Characters{
    // Establecer la velocidad aumentada
   
    public Koke(int x, int y){
        this.x=x;
        this.y=y;
    }

    public void mover(char direction){
        switch(direction){
            case 'L':
                if(valido(x-speed,y) && valido(x-speed,y+cellSize-5)){//checar
                    x-=speed;
                }else if(y>178 && y <182 && x==20){
                    x=380;
                }
                index=0;
                break;
            case 'R':
                if(valido(x+cellSize,y) && valido(x+cellSize,y+cellSize-5)){
                    x+=speed;
                }else if(y>178 && y <182 && x==380){
                    x=20;
                }    
                index=1;
                break;
            case 'U':
                if(valido(x,y-speed) && valido(x+cellSize-5,y-speed)){
                    y-=speed;
                }
                index=2;
                break;
            case 'D':
                if(valido(x,y+cellSize) && valido(x+cellSize-5,y+cellSize)){
                    y+=speed;
                }
                index=3;
                break;
            
        }
        
     
    }
    
}
