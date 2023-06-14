package com.github.tallya01.t08.domain;

import java.util.ArrayList;
public class Texto {
    List<Paragrafo> paragrafos = new ArrayList();

    public Texto(Paragrafo p) {
        paragrafos.add(p);
    }

    public addParagrafo(Paragrafo p) {
        paragrafos.add(p);
    }
}