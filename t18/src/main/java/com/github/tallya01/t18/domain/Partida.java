package com.github.tallya01.t18.domain;

import java.util.ArrayList;
import java.util.List;

public class Partida {
    List<Lance> lances = new ArrayList<>();

    public Partida(Lance lanceInicial) {
        this.addLance(lanceInicial);
    }

    public void addLance(Lance l) {
        this.lances.add(l);
    }
}