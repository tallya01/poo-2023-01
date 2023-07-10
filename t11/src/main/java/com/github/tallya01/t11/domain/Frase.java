package com.github.tallya01.t11.domain;

import java.util.ArrayList;
import java.util.List;

public class Frase {
    List<Palavra> palavras = new ArrayList<>();

    public Frase(Palavra p){
        if(p == null) throw new IllegalArgumentException("Uma frase deve conter pelo menos uma palavra");
        this.palavras.add(p);
    }

    public void addPalavra(Palavra p){
        this.palavras.add(p);
    }
}