package s03p03estructurasbasicas;
import java.util.Scanner;
/*
 * Universidad Politecnica de San Luis Potosi
 * Programacion III
 * Programacion Orientada a Objetos
 */

/**
 *
 * 
 * 
 * @author Ana Karen Cuenca Esquivel
 * @Ana Karen Cuenca 
 */
public class Estructuras {
    
    Scanner entrada = new Scanner(System.in);
    //- mayor: Crea un metodo que lea 3 numeros y de la manera mas optima usando "if" diga cual es  el mayor de ellos.
    public void mayor(){
        System.out.println("Escribe el primer numero: ");
        int a = entrada.nextInt();
        System.out.println("Escribe el segundo numero: ");
        int b = entrada.nextInt();
        System.out.println("Escribe el tercer numero: ");
        int c = entrada.nextInt();
        if(a>b && a>c){
            System.out.println("El mayor es el primero: "+a);
        }else if(b>a && b>c){
            System.out.println("E mayor es el segundo: "+b);
        }else if(c>a && c>b){
            System.out.println("El mayor es el tercero: "+c);
        }else{
            System.out.println("Los tres numeros son iguales");
        }
    }
    //- Acumulador: acumule numeros enteros hasta que el usuario ingrese un numero negativo
    public void suma(){
        int suma=0;
        int aux=0;
        do{
            System.out.println("Numero a sumar: ");
            aux=entrada.nextInt();
            suma+=aux;
            System.out.println("La suma es: "+suma);
        }while(aux>0);
        
    }
    //- promedio: Cree un metodo que lea 5 numeros del usuario e imprima el promedio de ellos;
    public void prom(int n){
        int sum=0;float prom=0;
        for (int i = 0; i < n; i++) {
            System.out.println("Escribe el numero "+i);
            sum+=entrada.nextInt();
        }
        prom=(float)sum/n;
        System.out.println("El promedio es: "+prom);
        
        
    }
}
