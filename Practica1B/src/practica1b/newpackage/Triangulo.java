/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1b.newpackage;

/**
 *
 * @author Agustin
 */
public class Triangulo implements FiguraGeometrica{
    double base,altura;
    
    public Triangulo(double _base, double _altura)
    {
        this.base= _base;
        this.altura = _altura;
    }
    
    
    private double getHipotenusa()
    {
        return Math.sqrt((Math.pow((base/2), 2)+Math.pow(altura,2)));
    }

    @Override
    public double getPerimetro() 
    {
        return (2*this.getHipotenusa())+this.base;
    }

    @Override
    public double getArea() 
    {
        return 0.5*this.base*this.altura;
    }
    
}
