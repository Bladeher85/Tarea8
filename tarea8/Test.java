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
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Instancias
        Producto id1 = new Producto(001, "Huevo", 1.25);
        Producto id2 = new Producto(002, "Jamon", 6.50);
        Alumno nom1 = new Alumno("2021001", "Juan", 16);
        Alumno nom2 = new Alumno("2021002", "Juan", 15);

        //Mostrar en pantalla
        System.out.println("Prodcuto 1 : " + id1.nombre + " / Precio: " + id1.precio);
        System.out.println("Prodcuto 2 : " + id2.nombre + " / Precio: " + id2.precio);

        System.out.println("El precio del producto 1 es igual al precio del producto 2: " + id1.igualQue(id2));
        System.out.println("El precio del producto 2 es mayor o igual al precio del producto 1: " + id2.mayorIgualQue(id1));
        System.out.println("El precio del producto 1 es mayor al precio del producto 2:: " + id1.mayorQue(id2));
        System.out.println("El precio del producto 2 es menor o igual al precio del producto 1: " + id2.menorIgualQue(id1));

        System.out.println("///////////////////////////////////////////////////////////////////");

        System.out.println("Alumno 1 : " + nom1.nombre + " / Carnet: " + nom1.carnet + " / Edad: " + nom1.edad);
        System.out.println("Alumno 2 : " + nom2.nombre + " / Carnet: " + nom2.carnet + " / Edad: " + nom2.edad);
        System.out.println("La edad del alumno 1 es igual al del alumno 2: " + nom1.igualQue(nom2));
        System.out.println("La edad del alumno 1 es mayor o igual al del alumno 2 : " + nom1.mayorIgualQue(nom2));
        System.out.println("La edad del alumno 1 es mayor al del alumno 2: " + nom1.mayorQue(nom2));
        System.out.println("La edad del alumno 1 es menor al del alumno 2: " + nom1.menorQue(nom2));
        System.out.println("La edad del alumno 1 es menor o gial al del alumno 2: " + nom1.menorIgualQue(nom2));

    }

}
