package com.github.tallya01.t08.domain;

import java.util.ArrayList;
public class Pais3 {
    private Cidade3 capital;
    private ArrayList<Cidade3> cidades = new ArrayList();

    public void setCapital(Cidade3 capital) {
        this.capital = capital;
    }

    public addCidade(Cidade3 c) {
        this.cidades.add(c);
    }
}