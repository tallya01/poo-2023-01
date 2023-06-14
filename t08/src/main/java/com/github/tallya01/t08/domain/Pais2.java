package com.github.tallya01.t08.domain;

import java.lang.IllegalArgumentException;
public class Pais2 {
    private Cidade capital;

    public Pais2(Cidade capital) {
        if(capital == null)
            throw new IllegalArgumentException("Um país deve ter uma capital!");

        this.capital = capital;
    }
}