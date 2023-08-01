package com.github.tallya01.t18.domain.modelo03;

public class Ponto {
    private double x;
    private double y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void move(Ponto ponto){
        this.x = ponto.x;
        this.y = ponto.y;
    }
}
