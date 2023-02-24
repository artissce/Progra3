/*
 * Universidad Politecnica de San Luis Potosi
 * Programacion III
 * Programacion Orientada a Objetos
 */
package s010p01holamundo;//nombre del proyecto, con carpeta

/**
 *
 * @author Ana Karen Cuenca Esquivel
 */
//identificador de acceso (public, private, package private, protected)
public class S010P01HolaMundo {
    //las clases inician con mayuscula
    //todo lo que no es clase es en minuscula
    
    //int a; //en automatico para package private
    
    //static permite ejecutar un metodo sin necesidad de un objeto
    //void, no regresa nada
    //driver class -> main, solo uno en cada proyecto
    //(String[] args)
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        //import ->java.lang (se carga pór default) ->java.util* (muchas clases, se las trae) ->java.util-Scanner ();
        //constructor->permite crear objetos
        Silla s1 = new Silla();Silla s2 = new Silla();
        s1.cargar();
        s2.cargar();
        s1.patas=3;
        s2.patas=4;
        
        System.out.println("La silla 1 tiene "+s1.patas+" patas");
        System.out.println("La silla 2 tiene "+s2.patas+" patas");
        
        System.out.println("La silla 1 es de "+s1.material);
        System.out.println("La silla 2 es de "+s2.material);
        
        Perro firulais = new Perro();
        System.out.println("Firulais tiene " +firulais.edad+" años");
        System.out.println("Firulais tiene " +firulais.patas+" patas");

        firulais.nombre="Luis";
        firulais.raza="chihuahua";
        System.out.println("El perro se llama "+firulais.nombre);
        System.out.println("El perro es de la raza "+firulais.raza);
        
        firulais.caminar();
        firulais.comer();
        firulais.ladrar();
    }
        
}
