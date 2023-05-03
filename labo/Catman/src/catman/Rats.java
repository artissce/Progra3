/*
 * Universidad Politecnica de San Luis Potosi
 * Programacion III Java
 * Programacion Orientada a Objetos
 */

package catman;
import java.util.*;

/**
 *
 * @author Ana Karen Cuenca Esquivel
 * @Ana Karen Cuenca Esquivel
 */
public class Rats extends Characters{

    public Rats(int x, int y){
        this.x=x;
        this.y=y;
        direccion='L';//posicion default
    }
    
    public boolean elegir(){//checar bien, como que no coincde del todo
        if(x % cellSize == 0 && y % cellSize==0)
            return true;
        else
            return false;
    }
    
    public char seleccionarDireccion(){
        int random;
        int newx=x, newy=y;
        Set<Character> mySet= new HashSet<Character>();
        char backwards='R';
        
        switch (direccion) {
            case 'L':
                backwards='R';
                break;
            case 'R':
                backwards='L';
                break;
            case 'U':
                backwards='D';
                break;
             case 'D':
                backwards='U';
                break;
        }
        char newDirection = backwards;
        while(newDirection == backwards || !valido(newx,newy)){
            if(mySet.size()==3){
                mySet.clear();
                newDirection=backwards;
                break;
            }
            random = (int)(Math.random()*4)+1;
            if(random==1){
                newDirection = 'L';
                newx-=speed;
            }else if(random==2){
                newDirection = 'R';
                newx+=cellSize;
            }else if(random==3){
                newDirection = 'U';
                newy-=speed;
            }else if(random==4){
                newDirection = 'D';
                newy+=cellSize;
            }
            
            if(newDirection != backwards){
                mySet.add(newDirection);
            }
            index= random % 2;
        }
        return newDirection;
    }
    
    public void mover(){
        if(elegir()){
            direccion=seleccionarDireccion();
        }
        switch(direccion){
            case 'L':
                if(valido(x-speed,y)){
                    x-=speed;
                }
                break;
            case 'R':
                if(valido(x+cellSize,y)){
                    x+=speed;
                }
                break;
            case 'U':
                if(valido(x,y-speed)){
                    y-=speed;
                }
                break;
            case 'D':
                if(valido(x,y+cellSize)){
                    y+=speed;
                }
                break;
            
        }
    }
    
    //Pendienteeeee
    public void asustado(){
        
    }
}
