/*
 * Universidad Politecnica de San Luis Potosi
 * Programacion III Java
 * Programacion Orientada a Objetos
 */
package s03p01clasestrings;

//import javax.swing.JOptionPane;

import java.util.Scanner;


/**
 *
 * @author Ana Karen Cuenca Esquivel
 */
public class S03P01ClaseStrings {

    /**
     * @param args the command line arguments
     */
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
        
        //Convierte todos los caracteres a MINUSCULAS
        System.out.println("\n5.- toLowerCase");
        String f=a.toLowerCase();
        System.out.println("e: "+f);
        
        //CONVIERTE A MAYUSCULAS
        System.out.println("\n6.- toUpperCase");
        String g=a.toUpperCase();
        System.out.println("e: "+g);
        
        //TAMANO DE LA CADENA
        System.out.println("\n7.- length\nEl tamano de la cadena es: "+a.length());
        //JOptionPane.showMessageDialog(null,a.length());
        
        //TOMA EL INICIO Y FINAL DE UNA CADENA
        String h="hola como estas?";
        System.out.println("\n8.- substring\nPosicion 0 a 7: "+h.substring(0,7));
        
        //COMPARA SI ES IGUAL
        String i="hola mundo";
        System.out.println("\n9.- equals\n El resultado es: "+i.equals("a"));
        
        //REMPLAZAR CADENA
        System.out.println("\n10-. replaceAll\n El remmplazo de a: "+a+" es: "+a.replaceAll("mundo", "mi gente"));
        
        //REEMPLAZAR Sobrecargado
        String str = "Hola espero que estes bien, gracias por hablar";
        //remove white spaces
        String str2 = str.replaceAll("\\s", "");
        System.out.println("\n11.- replaceAll parametro\n El reemplazo es:"+str2);
        
        //REEMPLAZA EL PRIMERO QUE SE ENCUENTRE CON ESE CARACTER
        //Only Replace first 's' with '9' 
        String str1 = str.replaceFirst("s", "9");
        System.out.println("\n12.- replaceFirts\nEl reemplazo es: "+str1);
        
        //CHECA SI ESTA VACIO EL ARREGLO    
        String strss = "Hello_Gfg";// prints false
        System.out.println("\n13.- isEmpty\n El arreglo esta vacio? "+strss.isEmpty());
        
        //devolver el número de puntos de código Unicode en el rango especificado de beginIndex a endIndex de String contenido por StringBuffe
        StringBuffer strr= new StringBuffer("Welcome to GeeksforGeeks");
        // print string
        System.out.println("\n14.- codePointCount\n Cadena = " + strr.toString());
        // returns the codepoint count from index 4 to 10
        int codepoints = strr.codePointCount(4, 10);
        System.out.println("No of Unicode code points " + " between index 4 and index 10 = "+ +codepoints);
        
        //CONVERTIR STRING BYTE
        String gfg = "Geeks for Geeks";
        System.out.println("\n15.- getBytes\nLa string antes de la conversion : "+gfg);
        byte[] bb = gfg.getBytes();
        // Display message only
        System.out.println("La string despues de la conversion : ");
        for (int ii = 0; ii < bb.length; ii++) {
            System.out.print(bb[ii]);
        }
        
        //
        String myStr1 = "HELLO";
        String myStr2 = "hello";
        System.out.println("\n16.- compareToIgnoreCase\n El resultado de la comparacion es: "+myStr1.compareToIgnoreCase(myStr2));
        
        //
        String Str1 = new String("Welcome to Tutorialspoint.com");
        String Str2 = new String("Tutorials");
        String Str3 = new String("TUTORIALS");

        System.out.print("\n17.- regionMatches\nRegresa el valor :" );
        System.out.println(Str1.regionMatches(11, Str2, 0, 9));
        System.out.print("Regresa el valor :" );
        System.out.println(Str1.regionMatches(11, Str3, 0, 9));
        
        
        //
        String myStr = "Hello";
        System.out.println("\n18.- startsWith\nEmpieza con Hel? "+myStr.startsWith("Hel"));   // true
        System.out.println("Empieza con llo? "+myStr.startsWith("llo")); 
        
        System.out.println("\n19.- startsWith\nTermina con Hel? "+myStr.endsWith("Hel"));   // false
        System.out.println("Termina con llo?"+myStr.endsWith("llo"));
       
        //
        String myStr11 = "Hello";
        System.out.println("\n20.- hashCode\n"+myStr11.hashCode());
       }
    }
    

