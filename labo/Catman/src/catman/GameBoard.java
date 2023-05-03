/*
 * Universidad Politecnica de San Luis Potosi
 * Programacion III Java
 * Programacion Orientada a Objetos
 */

package catman;
import java.awt.*;
import javax.swing.*;

/**
 * TO-DO:
 * - Agregar mapa con puntos y bloques, hacer que no se coloquen puntos en bloques //LISTO?
 * - Agregar imagenes de personajes
 * - Verificar como hacer el movimiento de los objetos
 * @author Ana Karen Cuenca Esquivel
 * @Ana Karen Cuenca Esquivel
 */
public class GameBoard extends JPanel{
    
    // -------------------VARIABLES--------------
    Image titleScreen = Toolkit.getDefaultToolkit().getImage(".\\src\\img\\inicio.png");
    Image lost = Toolkit.getDefaultToolkit().getImage(".\\src\\img\\lost.png");
    Image win = Toolkit.getDefaultToolkit().getImage(".\\src\\img\\win.png");
    //ratas
    Image ratI = Toolkit.getDefaultToolkit().getImage(".\\src\\img\\ratsIzq-copy.png");
    Image ratD = Toolkit.getDefaultToolkit().getImage(".\\src\\img\\ratsDer.png");
    Image[] rata1={ratI,ratD};//Arreglos para los movimientos de los ratones
    Image[] rata2={ratI,ratD};
    Image[] rata3={ratI,ratD};
    Image[] rata4={ratI,ratD};
    Rats rat1=new Rats(10*Characters.cellSize,8*Characters.cellSize);
    Rats rat2=new Rats(10*Characters.cellSize,9*Characters.cellSize);
    Rats rat3=new Rats(11*Characters.cellSize,9*Characters.cellSize);
    Rats rat4=new Rats(9*Characters.cellSize,9*Characters.cellSize);
    //koke
    Image koke = Toolkit.getDefaultToolkit().getImage(".\\src\\img\\frente - Copy.png");
    Image kokeI = Toolkit.getDefaultToolkit().getImage(".\\src\\img\\koke_izq.png");
    Image kokeD = Toolkit.getDefaultToolkit().getImage(".\\src\\img\\koke_der.png");
    Image kokeUp = Toolkit.getDefaultToolkit().getImage(".\\src\\img\\back.png");
    Image kokeDown = Toolkit.getDefaultToolkit().getImage(".\\src\\img\\frente.png");
    Image[] Koke_img={kokeI,kokeD,kokeUp,kokeDown};
    Koke Koke = new Koke(10*Characters.cellSize, 15*Characters.cellSize);
    
    //Extra
    Image cora = Toolkit.getDefaultToolkit().getImage(".\\src\\img\\cora.png");
    int score;
    boolean titulo;
    boolean balls[][];
    boolean states[][];
    short vidas=3;
    
    //Coloca las vidas de acuerdo a la variable de vidas jeje
    public void dibujaVidas(Graphics g){
        for (int i = 0; i < vidas; i++) {
            g.drawImage(cora,(Characters.cellSize+5) * i+15, Characters.max+10, Characters.cellSize, Characters.cellSize,null); 
        }
    }
    
    //colocar puntos
    public void iniciar(){
        for (int i = 0; i < Characters.cellSize; i++) {
            for (int j = 0; j < Characters.cellSize; j++) {
                balls[i][j]=true;
                states[i][j]=true;
            }
        }
        //para no dibujar en el centro de la jaula
        balls[10][8]=false;
        balls[10][9]=false;
        balls[11][9]=false;
        balls[9][9]=false;
        balls[10][15]=false;
    }
    //agregar los elementos
    public GameBoard(){
        titulo = true;//para iniciar la pantalla de inicio
        balls= new boolean[Characters.cellSize][Characters.cellSize];
        states= new boolean[Characters.cellSize][Characters.cellSize];
        iniciar();
    }
    //
     public void actualizar(Graphics g, int x, int y, int w, int h){
        g.fillRect(x, y, w, h);
        //dibula los puntos yy rectangulos
        for (int i = x/20; i < x/20 + w/20; i++) {
            for (int j = y/20; j < y/20+h/20; j++) {
                   balls[i][j]=false;
                   states[i-1][j-1]=false;//con esto no se ponen en los puntos
            }
        }
    }
    
    public void dibujaBolas(Graphics g){
        g.setColor(Color.white);
        for (int i = 1; i < Characters.cellSize; i++) {//ciclos que recorre todo el mapa
            for (int j = 1; j < Characters.cellSize; j++) {
                if(balls[i][j]){
                    g.fillOval(i*20+8, j*20+8, 4, 4);// posicion en las coordenadas de los pixeles y 8 es para centrar
                    //el punto es de 4x4 pixeles
                }
            }
        }
    }
    //PENDIENTEEEEE
    public void dibujaSuperBolas(Graphics g){
        g.setColor(Color.white);
        for (int i = 1; i < Characters.cellSize; i++) {//ciclos que recorre todo el mapa
            for (int j = 1; j < Characters.cellSize; j++) {
                if(balls[i][j]){
                    g.fillOval(i*20+8, j*20+8, 4, 4);// posicion en las coordenadas de los pixeles y 8 es para centrar
                    //el punto es de 4x4 pixeles
                }
            }
        }
    }
    
    public void reset(){
        if(vidas > 0 )//descuenta vidas si hay interseccion
            vidas--;
        
        //buelvo a posicionar
        rat1.x=10*Characters.cellSize;
        rat1.y=8*Characters.cellSize;
        
        rat2.x=10*Characters.cellSize;
        rat2.y=9*Characters.cellSize;
        
        rat3.x=11*Characters.cellSize;
        rat3.y=9*Characters.cellSize;
        
        rat4.x=9*Characters.cellSize;
        rat4.y=9*Characters.cellSize;
        
        Koke.x =10*Characters.cellSize;
        Koke.y=15*Characters.cellSize;
        //continuar
        Game.bandera=true;
        
    }
    
    public void drawBoard(Graphics g){
        g.setColor(Color.white);
        g.drawRect(16, 17, 389, 382);//marco del mapa
        g.setColor(new Color(207,108,49));
        //bloques
        actualizar(g,40,40,60,20);
        actualizar(g,120,40,60,20);
        actualizar(g,200,20,20,40);
        actualizar(g,240,40,60,20);
        actualizar(g,320,40,60,20);
        actualizar(g,40,80,60,20);
        actualizar(g,160,80,100,20);
        actualizar(g,200,80,20,60);
        actualizar(g,320,80,60,20);
        actualizar(g,20,120,80,60);
        actualizar(g,320,120,80,60);
        actualizar(g,20,200,80,60);
        actualizar(g,320,200,80,60);
        actualizar(g,160,160,40,20);
        actualizar(g,220,160,40,20);
        actualizar(g,160,180,20,20);
        actualizar(g,160,200,100,20);
        actualizar(g,240,180,20,20);
        actualizar(g,120,120,60,20);
        actualizar(g,120,80,20,100);
        actualizar(g,280,80,20,100);
        actualizar(g,240,120,60,20);
        actualizar(g,280,200,20,60);    
        actualizar(g,120,200,20,60); 
        actualizar(g,160,240,100,20);
        actualizar(g,200,260,20,40);
        actualizar(g,120,280,60,20);
        actualizar(g,240,280,60,20);
        actualizar(g,40,280,60,20);
        actualizar(g,80,280,20,60);
        actualizar(g,320,280,60,20);
        actualizar(g,320,280,20,60);
        actualizar(g,20,320,40,20);
        actualizar(g,360,320,40,20);
        actualizar(g,160,320,100,20);
        actualizar(g,200,320,20,60);
        //
        actualizar(g,40,360,140,20);
        actualizar(g,240,360,140,20);
        actualizar(g,280,320,20,60);
        actualizar(g,120,320,20,60);
        
        repaint();//volver a dibujar
    }
    
    //Dibuja los elementos
    @Override
    public void paint(Graphics g){
        g.setColor(new Color(42,40,48));
        g.fillRect(0, 0, 420, 500);
        drawBoard(g);
        dibujaBolas(g);
        dibujaVidas(g);
        g.setFont(new Font("Consolas",Font.BOLD,20));
        g.drawString("Score: "+score, Characters.max/2+50, Characters.max+30);
        g.drawImage(rata1[rat1.index], rat1.x,rat1.y, null);
        g.drawImage(rata2[rat2.index], rat2.x,rat2.y, null);
        g.drawImage(rata3[rat3.index], rat3.x,rat3.y, null);
        g.drawImage(rata4[rat4.index], rat4.x,rat4.y, null);
        
        g.drawImage(Koke_img[Koke.index], Koke.x,Koke.y, null);//multiple por 200 para exportar la imagen en pixelorama
        
        if(titulo){//aparece la imgane de inicio
            g.drawImage(titleScreen, 0, 0, null);
        }
        if(vidas==0)//si pierdes
            g.drawImage(lost, 0, 0, null);
        
        if(checar())//si ganas todos los puntos (de momento)
            g.drawImage(win, 0, 0, null);
    
    }
    
    public boolean checar(){
        for (int i = 1; i < Characters.cellSize; i++) {//ciclos que recorre todo el mapa
            for (int j = 1; j < Characters.cellSize; j++) {
                if(balls[i][j])
                    return false;
            }
        }
        return true;
    }
}

