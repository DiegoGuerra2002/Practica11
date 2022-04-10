/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1b.newpackage;

/**
 *
 * @author Agustin
 */
public class Rectangulo implements FiguraGeometrica{
    double ancho,largo;
    
    public Rectangulo(double _ancho,double _largo)
    {
        this.ancho = _ancho;
        this.largo = _largo;
    }

    @Override
    public double getPerimetro() 
    {
        return (2*this.ancho)+(2*this.largo);
    }

    @Override
    public double getArea() 
    {
        return this.ancho*this.largo;
    }
    
}
