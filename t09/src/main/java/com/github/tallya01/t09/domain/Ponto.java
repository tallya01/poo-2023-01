package com.github.tallya01.t09.domain;

public class Ponto {
    double x;
    double y;

    public void transladar(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }
}