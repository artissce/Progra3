/*
 * Universidad Politecnica de San Luis Potosi
 * Programacion III
 * Programacion Orientada a Objetos
 */
package s03p02encapsulacion;

/**
 *ENCAPSULACION: es una propiedad de POO que define que cada variable
 * debe tener preotegido su acceso para que solo pueda accederse por medio de metodos
 * 
 * IDENTIFICADORES DE ACCESO:
 * public - pueden ser accedidos desde cualquier clase
 * private - solo puede ser accedido por la misma clase
 * package private - solo puede ser accedido dentro del mismo proyecto (default)
 * protected - solo puede ser accedida dentro de la cadena de herencia.
 * 
 * @author Ana Karen Cuenca Esquivel
 */
public class S03P02Encapsulacion {
    public static void main(String[] args) {
        VideoJuego v1=new VideoJuego();
        v1.apodo="patito";
        //v1.nombre="COD"; no se accede por ser private 
        v1.setNombre("Call of Duty");
        System.out.println("Nombre del videojuego "+v1.getNombre());
        
        Arbol a1= new Arbol();
        a1.setNombre("Pino");
        a1.setAltura(5.5f);
        a1.setTipo("vasculares");
        a1.arbolito(a1.getNombre(),a1.getAltura(),a1.getTipo());
        
        Karaoke k1=new Karaoke();
        k1.setLugar("Avanzada");
        k1.setColor("azul");
        k1.setBotones(5);
        k1.cantar("Saul", "BABY - JUSTIN",k1.getLugar(),k1.getBotones(),k1.getColor());
        
    }
    
}
