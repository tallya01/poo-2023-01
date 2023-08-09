package com.github.tallya01.t22.domain;

import java.util.Set;

public class Calendario {
    Set<Data> abertoEm;

    public Set<Data> getAbertoEm() {
        return abertoEm;
    }

    public void addDataAberto(Data data) {
        abertoEm.add(data);
    }
}
