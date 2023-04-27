/*
 * Universidad Politecnica de San Luis Potosi
 * Programacion III Java
 * Programacion Orientada a Objetos
 */

package pacman3;

/**
 *
 * @author Ana Karen Cuenca Esquivel
 * @Ana Karen Cuenca Esquivel
 */
public class Koke extends Characters{
    
    public Koke(int x, int y){
        this.x=x;
        this.y=y;
    }

    public void move(char direction){
        
        switch(direction){
            case 'L':
                if(isValid(x-speed,y) && isValid(x-speed,y+cellSize-5)){//checar
                    x-=speed;
                }else if(y>178 && y <182 && x==20){
                    x=380;
                }
                index=0;
                break;
            case 'R':
                if(isValid(x+cellSize,y) && isValid(x+cellSize,y+cellSize-5)){
                    x+=speed;
                }else if(y>178 && y <182 && x==20){
                    x=20;
                }    
                index=1;
                break;
            case 'U':
                if(isValid(x,y-speed) && isValid(x+cellSize-5,y-speed)){
                    y-=speed;
                }
                index=2;
                break;
            case 'D':
                if(isValid(x,y+cellSize) && isValid(x+cellSize-5,y+cellSize)){
                    y+=speed;
                }
                index=3;
                break;
            
        }
    }
}
