package com.github.tallya01.t07.domain.religiao;

import java.util.ArrayList;

public class Religiao {
    private ArrayList devotos;

    public void novoFiel(Devoto d) {
        devotos.add(d);
    }
}