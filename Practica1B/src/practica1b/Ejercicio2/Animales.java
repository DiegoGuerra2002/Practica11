/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1b.Ejercicio2;

/**
 *
 * @author Agustin
 */
public abstract class Animales {
    String nombre;
    
    public Animales(){
        
    }
    
    public Animales(String _nombre){
        this.nombre = _nombre;
    }
    
    public abstract void saludar();
    
}
