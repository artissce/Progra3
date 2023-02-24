/*
 * Universidad Politecnica de San Luis Potosi
 * Programacion III
 * Programacion Orientada a Objetos
 */

package s04p02arregloobjetos;

/**
 *
 * @author Ana Karen Cuenca Esquivel
 * @Ana Karen Cuenca Esquivel
 */
public class Alumno {
    //atributos
    int matricula;
    String nombre;
    String carrera;
    int edad;
    float materia1;
    float materia2;
    
    //metodos
    public Alumno(){
        //vacio
    }
    public Alumno(int m, String n,String c, int e,float m1,float m2){
        matricula=m;
        nombre=n;
        carrera=c;
        edad=e;
        materia1=m1;
        materia2=m2;
    }
    
    public void baja(){
        System.out.println("NP - No pude");
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getMateria1() {
        return materia1;
    }

    public void setMateria1(float materia1) {
        this.materia1 = materia1;
    }

    public float getMateria2() {
        return materia2;
    }

    public void setMateria2(float materia2) {
        this.materia2 = materia2;
    }
    
}
