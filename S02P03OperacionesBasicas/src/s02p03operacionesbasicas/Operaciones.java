/*
 * Universidad Politecnica de San Luis Potosi
 * Programacion III
 * Programacion Orientada a Objetos
 */

package s02p03operacionesbasicas;
import java.util.Scanner;

/**
 *
 * @author Ana Karen Cuenca Esquivel
 * @Ana Karen Cuenca Esquivel
 */
public class Operaciones {
    //atributos
    int a,b;
    
    //metodos
    //SUMA - listo
    public void sumar(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        a=entrada.nextInt();
        System.out.println("Dime otro numero: ");
        b=entrada.nextInt();
        
        System.out.println("La suma es: "+(a+b));
    }
    public void sumar(int a){
        System.out.println("\nSuma con int");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime un numero entero: ");
        b=entrada.nextInt();
        
        System.out.println("La suma es: "+(a+b));
    }
    public void sumar(float a){
        System.out.println("\nSuma con float");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime un numero entero: ");
        b=entrada.nextInt();
        
        System.out.println("La suma es: "+(a+(float)b));
    }  
    //RESTA
    public void resta(int a){
        System.out.println("\nResta con int");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime un numero entero: ");
        b=entrada.nextInt();
        
        System.out.println("La resta es: "+(a-b));
    }
    public void resta(float a){
        System.out.println("\nResta con float");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime un numero entero: ");
        b=entrada.nextInt();
        
        System.out.println("La resta es: "+(a+(float)b));
    }
    //MULTIPLICACION - listo
    public void multiplicar(String a){
        System.out.println("\nMultiplicacion con String");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime un numero entero: ");
        this.a=entrada.nextInt();
        System.out.println("Dime otro numero entero: ");
        b=entrada.nextInt();
        
        System.out.println(a+(this.a+b));
    }
    public void multiplicar(int a){
        System.out.println("\nMultiplicacion con int");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime otro numero entero: ");
        b=entrada.nextInt();
        
        System.out.println("La multiplicacion es: "+(a+b));
    }
    //DIVISION - listo
    public void dividir(){
        a=5;
        b=8;
        System.out.println("La division es: "+((float)a/(float)b));
    }
    public void dividir(String c){
        System.out.println("\nDivision con String");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        a=entrada.nextInt();
        System.out.println("Dime otro numero: ");
        b=entrada.nextInt();
        System.out.println(c+((float)a/(float)b));
    }
    public void dividir(int c){
        System.out.println("\nDivision con int");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime otro numero entero: ");
        b=entrada.nextInt();
        System.out.println("La division es: "+(c/(float)b));
    }
}
