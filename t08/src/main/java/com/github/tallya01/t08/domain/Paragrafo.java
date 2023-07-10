package com.github.tallya01.t08.domain;

import java.util.ArrayList;
import java.util.List;

public class Paragrafo {
    List<Sentenca> sentencas = new ArrayList();

    public Paragrafo(Sentenca s) {
        sentencas.add(s);
    }

    public void addSentenca(Sentenca s) {
        sentencas.add(s);
    }
}