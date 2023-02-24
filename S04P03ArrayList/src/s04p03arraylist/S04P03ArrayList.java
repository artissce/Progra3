/*
 * Universidad Politecnica de San Luis Potosi
 * Programacion III
 * Programacion Orientada a Objetos
 */
package s04p03arraylist;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *ARRALIST:
 * Es un arreglo dinamico (no tiene definido el arreglo) de OBJETOS
 * String, Integer, Float... de cualquier clase
 */
public class S04P03ArrayList {
    public static void main(String[] args) {
        int x[]=new int[5];    
        //declaracion:
        ArrayList b=new ArrayList<>();
        //no es la forma mas adecuada porque no se indica la clase del arreglo de tipo ArrayList
        ArrayList <String> a= new ArrayList<>();

        a.add("Mundo");
        a.add("Gringa combinada");
        a.add("Coca de vidrio");
        
        System.out.println("ArrayList a: "+a);
        
        a.add(1,"pizza");
        System.out.println("ArrayList a: "+a);
        a.add(3,"torta de barbacoa");
        System.out.println("ArrayList a: "+a);
        
        a.remove(1);
        System.out.println("ArrayList a: "+a);
        
        
        a.add(1,"tacos al pastor");
        System.out.println("ArrayList a: "+a);
        a.add(3,"agua de horchata");
        System.out.println("ArrayList a: "+a);
        
        //a.clear();
        //System.out.println("ArrayList a: "+a);
        System.out.println("Tamaño de a: "+a.size());
        
        //ITERATOR - Es una "interfaz" es un tipo de clase que indica el tipo de metodo debe tener clase. 
        //se usa para recorre un "arraylist" a traves de "copiar" el arraylist usando el metodo iterator (de ArratList)
        Iterator <String> it=a.iterator();//metodo que esta en arraylist,lo convierte a iterator
        int i=0;
        while(it.hasNext()){
            System.out.println("Elemento "+i+"es: "+it.next());
            i++;
        }
        /*Genere un arrayList que almacene enteros.
        agregue como elementos a los primeros 10 numeros(1 al 10) usando ciclos. 
        Imprima con iterator*/
        ArrayList <Integer> c= new ArrayList<>();
        
        for (int j = 1; j < 11; j++) {
            c.add(j);
        }
        Iterator <Integer> itt=c.iterator();//metodo que esta en arraylist,lo convierte a iterator
        int ii=0;
        while(itt.hasNext()){
            System.out.println("Elemento "+ii+" es: "+itt.next());
            ii++;
        }
        
    }
}
