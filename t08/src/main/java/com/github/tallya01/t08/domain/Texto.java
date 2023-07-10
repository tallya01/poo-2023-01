package com.github.tallya01.t08.domain;

import java.util.ArrayList;
import java.util.List;

public class Texto {
    List<Paragrafo> paragrafos = new ArrayList();

    public Texto(Paragrafo p) {
        paragrafos.add(p);
    }

    public void addParagrafo(Paragrafo p) {
        paragrafos.add(p);
    }
}