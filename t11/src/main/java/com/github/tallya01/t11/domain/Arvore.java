package com.github.tallya01.t11.domain;

import java.util.ArrayList;
import java.util.List;

public class Arvore {
    List<Folha> folhas = new ArrayList<>();
    List<Floresta> florestas = new ArrayList();

    public Arvore(Folha folha, Floresta floresta) {
        if(folha == null) throw new IllegalArgumentException("Uma árvore deve possuir pelo menos uma folha");
        if(floresta == null) throw new IllegalArgumentException("Uma árvore deve estar em pelo menos uma floresta");
        folhas.add(folha);
        florestas.add(floresta);
    }

    public void addFolha(Folha f) {
        folhas.add(f);
    }
    public void addFloresta(Floresta f) {
        florestas.add(f);
    }
}