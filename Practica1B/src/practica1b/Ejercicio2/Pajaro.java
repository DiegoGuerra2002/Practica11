/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1b.Ejercicio2;

/**
 *
 * @author Agustin
 */
public class Pajaro extends Animales{

    public Pajaro(String nombre)
    {
        super(nombre);
    }
    @Override
    public void saludar() {
    System.out.println("Mi nombre es "+this.nombre+". . . Pio pio");
    }
    
}
