/*
 * Universidad Politecnica de San Luis Potosi
 * Programacion III
 * Programacion Orientada a Objetos
 */
package s05p02staticfinal;

/**
 *
 * @author Ana Karen Cuenca Esquivel
 */
public class S05P02StaticFinal {
    public static void main(String[] args) {
        Autos a=new Autos();
        Autos b=new Autos();
        Autos c=new Autos();
        a.acelerar();
        //a.frenar();
        Autos.frenar();//lo correcto
        
        a.anio=2023;
        a.modelo="mustang";
        Autos.marca="Ford";
        //a.marca="Ford";
        
        System.out.println("modelo de a "+a.modelo);
        System.out.println("marca de a "+a.marca);
        System.out.println("marca de b "+b.marca);
        System.out.println("marca de c "+c.marca);
        System.out.println("marca de c "+Autos.marca);
        
        Autos.marca="Henry";
        
        System.out.println("marca de a "+a.marca);
        System.out.println("marca de b "+b.marca);
        System.out.println("marca de c "+c.marca);
        System.out.println("marca de c "+Autos.marca);
        
        System.out.println("llantas de a "+a.LLANTAS);
        System.out.println("llantas de b "+b.LLANTAS);
        System.out.println("llantas de c "+c.LLANTAS);
        System.out.println("llantas de c "+Autos.LLANTAS);
        Jugos j=new Jugos(); 
        j.beber();
        j.reciclarEnvase();
        Jugos.reciclarEnvase();
        
        j.modelo="KIDS";
        j.precio=54.4f;
        Jugos.precio=54.4f;
        j.marca="JUMEX";
        Jugos.marca="JUMex";
        System.out.println("modelo de j "+j.modelo);
        System.out.println("precio de j "+j.precio);
        System.out.println("marca de j "+j.marca);
        
        System.out.println("litros de los jugos "+Jugos.LITROS);
    }
    
}
