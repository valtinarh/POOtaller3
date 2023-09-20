package com.codigo18.pruebafiguras;

public class TrianguloRectangulo {
    int base; 
    int altura; 
    
    public TrianguloRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    double calcularArea() {
        
        return ((double) (base * altura) / 2);
        
    }
    
    double calcularPerimetro() {
        
        return (base + altura + calcularHipotenusa()); 
        
    }
    
    double calcularHipotenusa() {
        return Math.pow(base*base + altura*altura, 0.5);
    }
    
    String determinarTipoTriangulo() {
        if ((base == altura) && (base == calcularHipotenusa()) && (altura
                == calcularHipotenusa()))
            return "Es un triángulo equilátero"; /* Todos sus
lados son iguales */
        else if ((base != altura) && (base != calcularHipotenusa()) &&
                (altura != calcularHipotenusa()))
            return "Es un triángulo escaleno"; /* Todos sus
lados son diferentes */
        else
            return "Es un triángulo isósceles"; /* De otra
manera, es isósceles */
    }

}
