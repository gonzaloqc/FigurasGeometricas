/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Plano;
import java.lang.Math;

/**
 *
 * @author Alumno
 */
public class Posicion2D {
    
    private double x;
    private double y;
    
    public Posicion2D (double x, double y){
    
     this.x=x;
     this.y=y;
    
    }
    
    public double Distancia (Posicion2D ab){
    double ladox;
    double ladoy;
    double distancia;
    ladox = Diferenciax(ab);
    ladoy = Diferenciay(ab);
    distancia = Math.hypot(ladox ,ladoy);
    return distancia;
     }
    
    public double Diferenciax (Posicion2D px) {
        double ladox;
        ladox = Math.abs(getX()- px.getX());
        return ladox;
    }
    
    public double Diferenciay (Posicion2D py) {
        double ladoy;
        ladoy = Math.abs (getY()- py.getY());
        return ladoy;
    }

    /**
     * @return the x
     */
    public double getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public double getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(double y) {
        this.y = y;
    }
   
    
}
