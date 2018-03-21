/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Plano;
import java.lang.Math;

/**
 *
 * @author utku33
 */
public class Circulo extends Figura2D {
    
    private final int LADOS = 0;
    private double radio;
        
    
    public Circulo (double radio){
      super (0,0);
      this.radio = radio;
    }

    public Circulo(double radio, double x, double y) {
        super(x, y);
        this.radio = radio;
    }

    public double DistanciaPerimetro (Posicion2D dp) {
        return radio;
    }
           
    @Override
    public double Perimetro (){
    double perimetro;
    perimetro= (2*Math.PI*this.getRadio());
    return perimetro;
    }
    
    @Override
    public double Superficie(){
    double superficie;
    superficie = (Math.PI*(this.getRadio() * this.getRadio()));
    return superficie;
    }
    
    
    /**
     * @return the LADOS
     */
    public int getLADOS() {
        return LADOS;
    }

    /**
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
}
