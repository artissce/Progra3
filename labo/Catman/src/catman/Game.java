/*
 * Universidad Politecnica de San Luis Potosi
 * Programacion III Java
 * Programacion Orientada a Objetos
 */
package catman;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Ana Karen Cuenca Esquivel
 */
public class Game implements KeyListener{

    static GameBoard board = new GameBoard();
    Timer timer;
     int[][] superBolas = {{3*20, 3*20}, {17*20, 3*20}, {3*20, 17*20}, {17*20, 17*20}};
    char direction = 'L';
    Image trans = Toolkit.getDefaultToolkit().getImage(".\\src\\img\\transparente.png");
    static boolean bandera= true;//arranca el juego con el retraso
    public Game() {
        JFrame game = new JFrame();
        game.setSize(420, 500);
        game.setDefaultCloseOperation(EXIT_ON_CLOSE);//cierra ventana
        game.setResizable(false);//no ajustta
        game.setLocationRelativeTo(null);//en medio
        game.setTitle("Catman");//titulo
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("../img/frente.png"));
        game.setIconImage(icon);
        game.add(board, BorderLayout.CENTER);//agrega mapa en centro del contenedor
        game.setVisible(true);
        game.addKeyListener(this);
        //actualiza la posicio de los elementos
        timer=new Timer(30,new ActionListener(){
            @Override
            @SuppressWarnings("empty-statement")
            public void actionPerformed(ActionEvent ae) {
                if(!board.titulo && board.vidas>0){//si no estamos en el inicio y hay mas de 0 vidas
                    if(bandera){
                        try {
                            Thread.sleep(2000);//para que tarde en empezar el juego
                            bandera=false;
                        } catch (InterruptedException ex) {
                            System.out.println("ERROR EN EJECUCION: "+ex);
                        }
                    }
                    board.rat1.mover();//mueve raton
                    board.rat2.mover();
                    board.rat3.mover();
                    board.rat4.mover();
                    int cont=5;
                
                
                //intento para cuando comia las superb
                for (int i = 0; i < superBolas.length; i++) {
//                        
                    if (board.Koke.x == superBolas[i][0] && board.Koke.y == superBolas[i][1]) {//si toma la superBola
                        board.score+=25;
//                            if(board.rat1.forma().intersects(board.Koke.forma())){// si choca
//                                board.rat1.x=10*Characters.cellSize;
//                                board.rat1.y=8*Characters.cellSize;
//                                board.rat1.speed=0;
//                                board.ratI1= trans;
//                               board.ratD1= trans;
//                            }
//                            if(board.rat2.forma().intersects(board.Koke.forma())){
//                                board.rat2.x=10*Characters.cellSize;
//                                board.rat2.y=9*Characters.cellSize;
//                                board.rat2.speed=0;
//                                board.ratI2= trans;
//                               board.ratD2= trans;
//                            }
//                            if(board.rat3.forma().intersects(board.Koke.forma())){
//                               board.rat3.x=11*Characters.cellSize;
//                                board.rat3.y=9*Characters.cellSize;
//                                board.rat3.speed=0;
//                                board.ratI3= trans;
//                               board.ratD3= trans;
//                            }
//                            if(board.rat4.forma().intersects(board.Koke.forma())){
//                                board.rat4.x=9*Characters.cellSize;
//                                board.rat4.y=9*Characters.cellSize;
//                                board.rat4.speed=0;
//                                board.ratI4= trans; 
//                               board.ratD4= trans;
                       }  
//                            
                    }
                    //si coinciden en el modo normal, se resetea la posicion
                    //se meuven a la posicion inical y se resta una vida
                    if(board.rat1.forma().intersects(board.Koke.forma())){//si coinciden
                        board.reset();//resetea
                    }
                    if(board.rat2.forma().intersects(board.Koke.forma())){
                        board.reset();
                    }
                    if(board.rat3.forma().intersects(board.Koke.forma())){
                        board.reset();
                    }
                    if(board.rat4.forma().intersects(board.Koke.forma())){
                        board.reset();
                    }

                    board.rat1.actualizaEstado(board.states);//para saber donde ir
                    board.rat2.actualizaEstado(board.states);
                    board.rat3.actualizaEstado(board.states);
                    board.rat4.actualizaEstado(board.states);

                    board.Koke.mover(direction);
                    if(board.balls[board.Koke.x/20][board.Koke.y/20]){
                        board.balls[board.Koke.x/20][board.Koke.y/20]=false;//come puntos
                        board.score++;//segun lo que se mueva, agrega puntos
                    }
                    
                    board.Koke.actualizaEstado(board.states);//ayuda a la posicion
                }
            }
        });
        timer.start();//empieza el timer para poder empezar el juego
    }

    public static void main(String[] args) {
        new Game();//crea opbjeto
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }
    //para cambiar la posicion de koke
    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()== KeyEvent.VK_LEFT)
            direction = 'L';
        else if(e.getKeyCode()== KeyEvent.VK_RIGHT)
            direction = 'R';
        else if(e.getKeyCode()== KeyEvent.VK_UP)
            direction = 'U';
        else if(e.getKeyCode()== KeyEvent.VK_DOWN)
            direction = 'D';
        else if(e.getKeyCode() == KeyEvent.VK_ENTER)
            board.titulo=false;
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
