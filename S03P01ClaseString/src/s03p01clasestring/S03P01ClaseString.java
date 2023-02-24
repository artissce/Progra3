/*
 * Universidad Politecnica de San Luis Potosi
 * Programacion III
 * Programacion Orientada a Objetos
 */
package s03p01clasestring;

//import javax.swing.JOptionPane;

/**
 * @author Ana Karen Cuenca Esquivel
 * Clase string - permite el manejo de cadenas de caracteres
 * brinda una gran cantidad de metodos para su operacion
 * Se encuentra en java.lang
 */
public class S03P01ClaseString {
    public static void main(String[] args) {
        String a = "Hola mundo";
        String b = new String("Universidad Politecnica de San Luis Potosi");
        //DEVUELVE EL CARACTER EN LA POSICION 
        char c =a.charAt​(0);
        System.out.println("1.- charAt\n El caracter es: "+c);
        
        //DEVUELVE UN ENTERO PARA COMPARAR LAS CADENAS, da 0 si es lo mismo
        int d=a.compareTo​("ANA");
        System.out.println("\n2.- compareTo\nEl resultado es: "+d);
        
        //COMPARA LAS CADENAS IGNORADAS LAS MAYUSCULAS O MINUSCULAS
        System.out.println("\n3.- compareToIgnoreCase");
        int x=a.compareToIgnoreCase("HoLa MuNdO");
        System.out.println("El resultado es: "+x);
        
        //DEVUELVE UN BOOLEAN SI LA "SUBSTRING ESTA EN LA CADENA
        System.out.println("\n4-. constains");
        boolean e=a.contains("undo");
        System.out.println("El resultado de la busqueda es: "+e);
        
        //Convierte todos los caracteres a mayuscula
        System.out.println("\n5.- toLowerCase");
        String f=a.toLowerCase();
        System.out.println("e: "+f);
        
        //TAMANO DE LA CADENA
        System.out.println("\n6.- length");
        //JOptionPane.showMessageDialog(null,a.length());
    }
    
}
