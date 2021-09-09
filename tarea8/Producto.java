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
 //Pedro Luis de Jesus Hernandez Lopez
 //Carnet: 7690-20-16633
public class Producto implements Comparador {

    public int q;
    public String nombre;
    public double precio;

    public Producto(int q, String nombre, double precio) {
        this.q = q;
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public boolean igualQue(Object q) {

        Producto id = (Producto) q;
        return this.precio == id.precio;
    }

    @Override
    public boolean menorQue(Object q) {
        Producto id = (Producto) q;
        return this.precio < id.precio;
    }

    @Override
    public boolean menorIgualQue(Object q) {
        Producto id = (Producto) q;
        return this.precio <= id.precio;
    }

    @Override
    public boolean mayorQue(Object q) {
        Producto id = (Producto) q;
        return this.precio > id.precio;
    }

    @Override
    public boolean mayorIgualQue(Object q) {
        Producto id = (Producto) q;
        return this.precio >= id.precio;
    }

}
