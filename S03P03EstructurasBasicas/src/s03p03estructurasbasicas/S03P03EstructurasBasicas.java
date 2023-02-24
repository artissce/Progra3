
/*
 * Universidad Politecnica de San Luis Potosi
 * Programacion III Java
 * Programacion Orientada a Objetos
 */
package s03p03estructurasbasicas;

/**
 *+Estructura secuenciales. Asignación, lectura, impresión, proceso
 * +Selectivas. A partir de una "condición" se eligen o descartan instrucciones a ejecutar.
 *  - Simpre: si - entonces(if)
 *  - Doble: si - entonces - sino (if - else)
 *  - Multiple: según sea (switch - case)
 * +Repetitivas (iterativas, ciclicas). Repiten un conjunto de instrucciones en función de alguna condición.
 *  - Para/Desde (for) Cuando sabemos cuántas veces se va a repetir
 *  - Mientras (while) Repite si una condiccion es verdadera puede ser que nunca se ejecutan las instrucciones
 *  - Hacer - Mientras (do-while) Repite si una condicion es verdadera ejecuta al menos UNA vez las instrucciones
 *                                pues la condición va al final.
 */
public class S03P03EstructurasBasicas {

    public static void main(String[] args) {
        int a = 8;
        int b = 5;
        /*
        //SELECTIVAS
        //if
        if(a<b){
            System.out.println("a "+a+" es menor a b");
        }
       
        //if - else
        if(a<b){
            System.out.println("a "+a+" es menor a b");
        }else{
            System.out.println("a "+a+" es mayor a b");
        }
       
        //switch case (multiples)
        switch(a){
            case 1:
                System.out.println("UNO");
                break;
            case 2:
                System.out.println("DOS");
                break;
            case 8:
                System.out.println("OCHO");
                break;
            default:
                System.out.println("deeefault");
                break;
        }
       
        //ESTRUCTURAS REPETITIVAS
        //for
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1)+"\t");
        }
        System.out.println("");
       
        //while
        while(a<10){
            System.out.println("a: "+a);
            a++;
        }
       
        //do-while
        do{
            System.out.println("a do while "+a);
        }while(a<5);
        */
        Estructuras structure = new Estructuras();
        structure.mayor();
        structure.suma();
        structure.prom(5);
    }
    
}
