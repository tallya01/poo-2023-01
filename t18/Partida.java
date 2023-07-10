package com.github.tallya01.t18;
public class Partida {
    List<Lance> lances = new ArrayList();

    public Partida(Lance lanceInicial) {
        this.addLance(lanceInicial);
    }

    public addLance(Lance l) {
        this.lances.add(l);
    }
}