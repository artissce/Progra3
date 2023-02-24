/*
 * Universidad Politecnica de San Luis Potosi
 * Programacion III
 * Programacion Orientada a Objetos
 */
package s02p03operacionesbasicas;

/**
 *Sobrecargue los 4 metodos al menos 2 veces mas en la clase principal usando un objeto pruebe los metodos
 * @author Ana Karen Cuenca Esquivel
 */
public class S02P03OperacionesBasicas {

    public static void main(String[] args) {
        System.out.println("INGRESAR SOLO ENTEROS");
        Operaciones ope= new Operaciones();
        ope.sumar();
        ope.sumar(6);
        ope.sumar(8.7f);
        
        ope.resta(8);
        ope.resta(6.8f);
        
        ope.multiplicar("La multiplicacion es: ");
        ope.multiplicar(6);
        
        ope.dividir();
        ope.dividir("La division es: ");
        ope.dividir(9);
    }
    
}
