package com.github.tallya01.t11.domain;

public class Floresta {
    List<Arvore> arvores = new ArrayList();

    public Floresta(Arvore a) {
        if(a == null) throw new IllegalArgumentException("Uma floresta deve possuir pelo menos uma árvore");
        arvores.add(folha);
    }

    public addArvore(Arvore a) {
        arvores.add(a);
    }
}