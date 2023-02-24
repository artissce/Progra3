/*
 * Universidad Politecnica de San Luis Potosi
 * Programacion III
 * Programacion Orientada a Objetos
 */
package s05p01enumeraciones;

/**
 * ENUMERACION:
 * Es un conjunto de constantes definidas por
 * el usuario que pueden ser accedidas mediante una variable.
 * 
 * @author Ana Karen Cuenca Esquivel
 */
public class S05P01Enumeraciones {
    public enum Meses{
        ENERO, FEBRERO, MARZO,ABRIL,MAYO,JUNIO,JULIO,AGOSTO,SEPTIEMBRE,OCTUBRE,NOVIEMBRE,DICIEMBRE
    }
    public enum Cafes{
        ARABICA, ROBUSTA,EXPRESSO,RISTRETTO, MACCHIATO,AMERICANO,LUNGO,CARAJILLO, OLLA;
    }
    public static void main(String[] args) {
        /*Dias d;
        d=Dias.VIERNES;
        System.out.println("El valor de d: "+d);
        if(d==Dias.VIERNES){
            System.out.println("Es vierneees YEIII");
        }else{
            System.out.println("No es viernes:c");
        }
        //use un switch case con la variable d
        switch(d){
            case LUNES:
                System.out.println("A trabajar");
                break;
            case MARTES:
                System.out.println("SIGUE TRABAJANDO");
                break;
            case MIERCOLES:
                System.out.println("ESTAS EN LA MITAD");
                break;
            case JUEVES:
                System.out.println("YA CASIII");
                break;
            case VIERNES:
                System.out.println("YA MERITO");
                break;
            case SABADO:
                System.out.println("Descansito merecido");
                break;
            case DOMINGO:
                System.out.println("Disfruta mientras puedas");
                break;
        }*/
        Cafes c,f;
        c=Cafes.AMERICANO;
        f=Cafes.OLLA;
        if(c==Cafes.AMERICANO){
            System.out.println("Con moderacion, ya sabes lo de tu gastritis");
        }else if(c==Cafes.OLLA || f==Cafes.OLLA){
            System.out.println("El mejor cafe del mundo!");
        }
        
        Ajedrez a;
        a=Ajedrez.REY;
        switch(a){
            case PEON:
                System.out.println("al avanzar al otro lado del tablero,podras ser cualquier otra pieza");
                break;
            case REINA:
                System.out.println("La mejor pieza, cuidado por donde te muevas");
                break;
            case REY:
                System.out.println("JAQUEE");
                break;
            case TORRE:
                System.out.println("Solo te puedes mover en cruz");
                break;
            case ALFIL:
                System.out.println("Muevete en diagonal");
                break;
            case CABALLOS:
                System.out.println("Solo te mueves en L");
                break;
        }
    }
    
}
