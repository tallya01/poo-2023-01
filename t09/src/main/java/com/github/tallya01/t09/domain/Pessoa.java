package com.github.tallya01.t09.domain;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    String nome;
    Integer idade;
    List<Habito> habitos = new ArrayList();

    public void addHabito(Habito habito){
        this.habitos.add(habito);
    }
}