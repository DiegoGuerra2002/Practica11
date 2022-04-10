/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1b.Ejercicio2;

/**
 *
 * @author Agustin
 */
public class Gato extends Animales{
    
    public Gato(String nombre)
    {
        super(nombre);
    }

    @Override
    public void saludar() {
        System.out.println("Hola me llamo"+this.nombre+"... meow");
    }
    
}
