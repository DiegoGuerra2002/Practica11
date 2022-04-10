/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1b.newpackage;

/**
 *
 * @author Agustin
 */
public class Circulo implements FiguraGeometrica{
    
    double radio;
    
    public Circulo(double _radio)
    {
        this.radio = _radio;
    }

    @Override
    public double getPerimetro() {
         return Math.PI*(2*this.radio);
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(radio,2);
    }
    
}
