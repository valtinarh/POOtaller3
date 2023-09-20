package com.codigo18.pruebafiguras;

public class Cuadrado {
    double lado; 
    
    public Cuadrado(int lado) {
        this.lado = lado;
    }
    
    double calcularArea() {
        return lado*lado;
    }
    
    double calcularPerimetro() {
        return (4 * lado);
    }
}
