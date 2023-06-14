package com.github.tallya01.t08.domain;

import java.lang.IllegalArgumentException;
public class Cidade1 {
    private Pais1 pais;

    public Cidade1(Pais1 p) {
        if(p == null)
            throw new IllegalArgumentException("Uma cidade deve estar associada a um país!");

        this.pais = p;
    }
}