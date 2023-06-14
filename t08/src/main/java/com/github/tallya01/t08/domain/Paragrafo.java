package com.github.tallya01.t08.domain;

import java.util.ArrayList;
public class Paragrafo {
    List<Sentenca> sentencas = new ArrayList();

    public Paragrafo(Sentenca s) {
        sentencas.add(s);
    }

    public addSentenca(Sentenca s) {
        sentencas.add(s);
    }
}