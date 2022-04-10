/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1b;

import java.util.*;
import practica1b.Ejercicio2.*;

public class Practica1B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Animales> lista = new ArrayList<>();
        lista.add(new Perro(""));
        lista.add(new Gato(""));
        lista.add(new Pajaro(""));
        
        for(Animales animal : lista)
        {
            animal.saludar();
        }
    }
    
}
