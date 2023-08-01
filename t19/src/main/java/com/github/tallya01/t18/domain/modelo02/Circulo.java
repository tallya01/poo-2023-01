package com.github.tallya01.t18.domain.modelo02;

public class Circulo {
    private double raio;
    private double x;
    private double y;

    public Circulo(double raio, double x, double y) {
        this.raio = raio;
        this.x = x;
        this.y = y;
    }

    public void move(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
