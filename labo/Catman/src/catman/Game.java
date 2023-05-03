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

    GameBoard board = new GameBoard();
    Timer timer;
    char direction = 'L';
    static boolean bandera= true;
    public Game() {
        JFrame game = new JFrame();
        game.setSize(420, 500);//cambio de 420 a 430
        game.setDefaultCloseOperation(EXIT_ON_CLOSE);//cierra ventana
        game.setResizable(false);//no ajustta
        game.setLocationRelativeTo(null);//en medio
        game.setTitle("Catman");//titulo
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("../img/frente.png"));
        game.setIconImage(icon);
        game.add(board, BorderLayout.CENTER);//agrega mapa
        game.setVisible(true);
        game.addKeyListener(this);
        //actualiza la posicio de los elementos
        timer=new Timer(30,new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(!board.titulo && board.vidas>0){//si no estamos en el inicio y hay mas de 0 vidas
                    if(bandera){
                        try {
                            Thread.sleep(2000);//para que tarde en empezar el juego
                            bandera=false;
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    board.rat1.mover();//mueve raton
                    if(board.rat1.forma().intersects(board.Koke.forma())){//si coinciden
                        board.reset();//resetea
                    }
                    board.rat2.mover();
                    if(board.rat2.forma().intersects(board.Koke.forma())){
                        board.reset();
                    }
                    board.rat3.mover();
                    if(board.rat3.forma().intersects(board.Koke.forma())){
                        board.reset();
                    }
                    board.rat4.mover();
                    if(board.rat4.forma().intersects(board.Koke.forma())){
                        board.reset();
                    }

                    board.rat1.actualizaEstado(board.states);
                    board.rat2.actualizaEstado(board.states);
                    board.rat3.actualizaEstado(board.states);
                    board.rat4.actualizaEstado(board.states);

                    board.Koke.mover(direction);
                    if(board.balls[board.Koke.x/20][board.Koke.y/20]){
                        board.balls[board.Koke.x/20][board.Koke.y/20]=false;//come puntos
                        board.score++;//segun lo que se mueva, agrega puntos
                    }
                    
                    board.Koke.actualizaEstado(board.states);
                }
                
            }
        });
        timer.start();
    }

    public static void main(String[] args) {
        new Game();
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
        else if(e.getKeyCode() == KeyEvent.VK_SPACE)
            board.titulo=false;
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
