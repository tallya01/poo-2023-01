package com.github.tallya01.t22.domain;

import java.util.Set;

public class Visitante {
    Pessoa pessoa;
    Set<Crianca> acompanhados;
    boolean usaBrinquedos;

    public Visitante(Pessoa pessoa) {
        if(pessoa == null) throw new IllegalArgumentException("Um visitante deve estar associado a uma pessoa");
        this.pessoa = pessoa;
    }
}
