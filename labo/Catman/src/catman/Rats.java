/*
 * Universidad Politecnica de San Luis Potosi
 * Programacion III Java
 * Programacion Orientada a Objetos
 */

package catman;
import java.util.*;
import java.util.ArrayList;

import java.util.List;

/**
 *
 * @author Ana Karen Cuenca Esquivel
 * @Ana Karen Cuenca Esquivel
 */
public class Rats extends Characters{

    public Rats(int x, int y){//ubica la posicion de cada rata
        this.x=x;
        this.y=y;
        direccion='L';//posicion default
    }
    
    public boolean elegir(){
        if(x % cellSize == 0 && y % cellSize==0)//si la posicion es multiplo del tamanio de la celda, cambia posicion
            return true;
        else
            return false;
    }
    
    public char seleccionarDireccion(){
        int random;
        int newx=x, newy=y;
        Set<Character> mySet= new HashSet<Character>();
        //una tabla hash para almacenar sus elementos, lo que permite buscar elementos en tiempo constante en promedio. 
        char backwards='R';//cambio de posicion
        
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
        //si es valido para moverse o no
        while(newDirection == backwards || !valido(newx,newy)){//si la nueva direccion es igual a la opuestya o no sea valido el nuevo x o y
            if(mySet.size()==3){// si no hay direccion valida despues de 3 intentos, cambia a la opuesta
                mySet.clear();//limpia la tabla
                newDirection=backwards;//la nueva direccion se queda con la opuesta
                break;
            }
            random = (int)(Math.random()*4)+1;
            if(random==1){//si el aleaotorio va a la izquierda 
                newDirection = 'L';
               
            }else if(random==2){//si el aleaotorio va a la derecha 
                newDirection = 'R';
             
            }else if(random==3){//si el aleaotorio va a arriba
                newDirection = 'U';
               
            }else if(random==4){//si el aleaotorio va a abajo 
                newDirection = 'D';
               
            }
            
            if(newDirection != backwards){//si la nueva direccion no es igual a la opuesta
                mySet.add(newDirection);//agregala a la tabla
            }
            index= random % 2;//para saber la imagen
        }
        return newDirection;//regresa la nueva direccion agregafa
    }
    
    public void mover(){
        if(elegir()){//decide si elegir o no
            direccion=seleccionarDireccion();
        }
        switch(direccion){//ya con la nueva direccion
            case 'L':
                if(valido(x-speed,y)){//verifica si es valido para que sea cambiado la posicion
                    x-=speed;
                }
                break;
            case 'R':
                if(valido(x+cellSize,y)){//verifica si es valido para que sea cambiado la posicion
                    x+=speed;
                }
                break;
            case 'U':
                if(valido(x,y-speed)){//verifica si es valido para que sea cambiado la posicion
                    y-=speed;
                }
                break;
            case 'D':
                if(valido(x,y+cellSize)){//verifica si es valido para que sea cambiado la posicion
                    y+=speed;
                }
                break;
            
        }
    }
    
    
}
