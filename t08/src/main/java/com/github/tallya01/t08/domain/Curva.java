package com.github.tallya01.t08.domain;

import java.util.ArrayList;
import java.lang.IllegalArgumentException;
public class Curva {
    private List<Ponto> pontos = new ArrayList();

    public Curva(Ponto ponto1, Ponto ponto2) {
        if(ponto1 == null || ponto2 == null){
            throw new IllegalArgumentException("Uma curva deve ter pelo menos dois pontos!");
        }

        pontos.add(ponto1);
        pontos.add(ponto2);
    }

    public addPonto(Ponto p){
        pontos.add(ponto1);
    }
}