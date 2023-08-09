package com.github.tallya01.t22.domain;

public class Trabalhador {
    Pessoa pessoa;

    public Trabalhador(Pessoa pessoa) {
        if(pessoa == null) throw new IllegalArgumentException("Um trabalhador deve estar associado a uma pessoa");
        this.pessoa = pessoa;
    }
}
