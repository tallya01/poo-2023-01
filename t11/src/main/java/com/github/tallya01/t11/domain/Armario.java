package com.github.tallya01.t11.domain;

public class Armario {
    List<Prateleira> prateleiras = new ArrayList();

    public Armario(Prateleira p){
        if(p == null) throw new IllegalArgumentException("Um armário deve ter pelo menos uma prateleira");
        prateleiras.add(p);
    }
}