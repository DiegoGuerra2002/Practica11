/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1b.newpackage;

/**
 *
 * @author Agustin
 */
public class Cuadrado implements FiguraGeometrica{
    
    double lado;
    
    public Cuadrado(double _lado) 
    {
        this.lado = _lado;
    }

    @Override
    public double getPerimetro() {
       return 4*this.lado;
    }

    @Override
    public double getArea() 
    {
    return Math.pow(lado, 2);
    }
    
}
