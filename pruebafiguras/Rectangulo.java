package com.codigo18.pruebafiguras;

public class Rectangulo {
    int base; 
    int altura; 
   
    Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
   
    double calcularArea() {
        return base * altura;
    }
    
    double calcularPerimetro() {
        return (2 * base) + (2 * altura);
    }
}
