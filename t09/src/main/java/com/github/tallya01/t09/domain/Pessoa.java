package com.github.tallya01.t09.domain;

import java.util.ArrayList;

public class Pessoa {
    String nome;
    Integer idade;
    List<Habito> habitos = new ArrayList();

    public addHabito(Habito habito){
        this.habitos.add(habito);
    }
}