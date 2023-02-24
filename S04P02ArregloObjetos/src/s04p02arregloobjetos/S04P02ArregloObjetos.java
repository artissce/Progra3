/*
 * Universidad Politecnica de San Luis Potosi
 * Programacion III
 * Programacion Orientada a Objetos
 */
package s04p02arregloobjetos;

import java.util.Scanner;

/**
 *
 * @author Ana Karen Cuenca Esquivel
 */
public class S04P02ArregloObjetos {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int mat,edad,x[] =new int[5];//declaracion
        String nom, car;float m1,m2;
        
        Alumno a[]=new Alumno[3];
        a[0]=new Alumno();// se inicializa con constructor vacio
        for (int i = 0; i < 3; i++) {
            //a[i]=new Alumno();EJEMPLO DE INICIALIZACION
            System.out.println(i+".- Dime tu matricula: ");
            mat=entrada.nextInt();
            entrada.nextLine();
            System.out.println("Dime tu nombre: ");
            nom=entrada.nextLine();
            System.out.println("Dime tu carrera: ");
            car=entrada.nextLine();
            System.out.println("Dime tu edad: ");
            edad=entrada.nextInt();
            System.out.println("Dime tu calif materia 1: ");
            m1=entrada.nextFloat();
            System.out.println("Dime tu calif materia 2: ");
            m2=entrada.nextFloat();
            
            a[i]=new Alumno(mat,nom,car,edad,m1,m2);
        }
        //imprimir arreglo
        for (int i = 0; i < 3; i++) {
            //a[i]=new Alumno();EJEMPLO DE INICIALIZACION
            System.out.println(" Matricula: "+a[i].getMatricula());
            System.out.println(i+" Nombre: "+a[i].getNombre());
            System.out.println(i+" Carrera: "+a[i].getCarrera());
            System.out.println(i+" edad: "+a[i].getEdad());
            System.out.println(i+" materia 1: "+a[i].getMateria1());
            System.out.println(i+" materia 2: "+a[i].getMateria2());
        }
        //solicite al usuario una matricula y la busque diga si la encontro (o no) e imprima sus otros datos. (nombre, carrera y edad)        //Hágalo de la manera mas optima posible        
        System.out.println("Dame la matricula ");
        mat = entrada.nextInt();
        boolean b = true;
        int i=0;float prom;
        do{
            if(a[i].matricula==mat){
                prom=(a[i].materia1+a[i].materia2)/2;
                System.out.println("Encontrado!");
                System.out.println("Nombre: "+a[i].nombre+", Carrera: "+a[i].carrera+", Edad: "+a[i].edad);
                System.out.println("EL PROMEDIO ES: "+ prom);
                
                b = false;
            }
            i++;}while(b && i<3);
        if(b){
            System.out.println("No encontrado!");
        }
    }
    
}
