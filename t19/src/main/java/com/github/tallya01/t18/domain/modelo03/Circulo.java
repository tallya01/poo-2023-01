package com.github.tallya01.t18.domain.modelo03;

public class Circulo {
    private double raio;
    private Ponto centro;

    public void move(double x, double y){
        this.centro.move(new Ponto(x, y));
    }
}
