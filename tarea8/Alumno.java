/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea8;

/**
 *
 * @author Phernandez
 */
public class Alumno implements Comparador {

    public String carnet;
    public String nombre;
    public int edad;

    public Alumno(String carnet, String nombre, int edad) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public boolean igualQue(Object q) {
        Alumno nom = (Alumno) q;
        return this.edad == nom.edad;
    }

    @Override
    public boolean menorQue(Object q) {
        Alumno nom = (Alumno) q;
        return this.edad < nom.edad;
    }

    @Override
    public boolean menorIgualQue(Object q) {
        Alumno nom = (Alumno) q;
        return this.edad <= nom.edad;
    }

    @Override
    public boolean mayorQue(Object q) {
        Alumno nom = (Alumno) q;
        return this.edad > nom.edad;
    }

    @Override
    public boolean mayorIgualQue(Object q) {
        Alumno nom = (Alumno) q;
        return this.edad >= nom.edad;
    }

}
