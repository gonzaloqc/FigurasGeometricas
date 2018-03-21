/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Plano;

/**
 *
 * @author utku33
 */
public class Rectangulo extends Figura2D {
    
    private final int LADOS =4;
    private double ancho;
    private double alto;
       
    
    public Rectangulo(double ancho, double alto) throws DimensionIncorrectaException {
    super(0,0);
        setAncho (ancho);
        setAlto (alto);
      
    }
    
    public Rectangulo(double ancho, double alto, double x, double y) throws DimensionIncorrectaException {
    super(x,y);
    setAncho (ancho);
    setAlto (alto);
    }
    
    public double DistanciaPerimetro (Posicion2D dr) {
        double distanciaperimetro;
        double proporcionallado;
        double proporcionaldistancia;
        
        proporcionallado = (getAlto() / getAncho());
        proporcionaldistancia = (this.posicion.Diferenciay(dr) / this.posicion.Diferenciax(dr));
        double hypotenusa = (this.posicion.Distancia(dr));
        double senoang = (this.posicion.Diferenciay(dr) / hypotenusa);
        double cosenoang = (this.posicion.Diferenciax(dr) / hypotenusa);
        
        if (proporcionallado < proporcionaldistancia) {
           distanciaperimetro = 
        }
                
        return distanciaperimetro;        
    } 
    

    @Override
    public double Perimetro(){
    double perimetro;
    perimetro =((this.getAncho()*2) + (this.getAlto() * 2));
    return perimetro;   
    }
    
    @Override
    public double Superficie(){
    double superficie;
    superficie = (this.getAlto() * this.getAncho());
    return superficie;
    }

    /**
     * @return the ancho
     */
    public double getAncho() {
        return ancho;
    }

    /**
     * @param ancho the ancho to set
     */
    public void setAncho(double ancho) throws DimensionIncorrectaException {
        if (ancho >=0) {
           this.ancho = ancho; 
        }
        else {
            throw new DimensionIncorrectaException("El ancho es menor que 0");
        }
    }

    /**
     * @return the alto
     */
    public double getAlto() {
        return alto;
    }

    /**
     * @param alto the alto to set
     */
    public void setAlto(double alto) throws DimensionIncorrectaException {
        if (alto >=0) {
           this.alto = alto; 
        }
        else {
            throw new DimensionIncorrectaException("El alto es menor que 0");
        }
    }
    
    
}
