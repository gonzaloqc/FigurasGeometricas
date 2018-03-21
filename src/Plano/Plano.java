/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Plano;
import java.util.ArrayList;

/**
 *
 * @author Alumno
 */
public final class Plano {
    private final ArrayList<FiguraGeometrica> figuras;
    private final ArrayList<Circulo> circulos;
    private final ArrayList<Rectangulo> rectangulos;

public Plano () {
    figuras = new ArrayList<>();
    circulos = new ArrayList<>();
    rectangulos = new ArrayList<>();
    
}    

public void addCirculo (Circulo x) {
    circulos.add(x);
    figuras.add(x);
}

public void addRectangulo (Rectangulo x) {
    rectangulos.add(x);
    figuras.add(x);
}



    public static void main(String[] args) throws DimensionIncorrectaException {
     
        Triangulo triangulo1 = new Triangulo (3,4,5);
        try {
            Rectangulo rectangulo1 = new Rectangulo (-1,8);
                }
        catch (DimensionIncorrectaException ex) {
            System.out.println (ex.getMessage());
        }
        Circulo circulo1 = new Circulo (6.8);
        Paralelepipedo paralelepipedo1 = new Paralelepipedo (6.97, 6.7, 5);
        Esfera esfera1 = new Esfera (9.8);
        Cilindro cilindro1 = new Cilindro (8.5 , 97);
        Cilindroc cilindro1c = new Cilindroc (8.5 , 97);
        
        System.out.println ("Trinagulo - " + "Perimetro: " + triangulo1.Perimetro() + " Superficie: " + triangulo1.Superficie());
        System.out.println ("Rectangulo - " + "Perimetro: " + rectangulo1.Perimetro() + " Superficie: " + rectangulo1.Superficie());
        System.out.println ("Circulo - " + "Perimetro: " + circulo1.Perimetro() + " Superficie: " + circulo1.Superficie());
        System.out.println ("Paralelepipedo - " + "Superficie: " + paralelepipedo1.Superficie()+ " Volumen: " + paralelepipedo1.Volumen());
        System.out.println ("Esfera - " + "Superficie: " + esfera1.Superficie()+ " Volumen: " + esfera1.Volumen());
        System.out.println ("Cilindro - " + "Superficie: " + cilindro1.Superficie()+ " Volumen: " + cilindro1.Volumen());
        System.out.println ("CilindroC - " + "Superficie: " + cilindro1c.Superficie()+ " Volumen: " + cilindro1c.Volumen());
        System.out.println("Radi de CilindroC: " + cilindro1c.base.getRadio());
        
         
        
    }
    
    
}
