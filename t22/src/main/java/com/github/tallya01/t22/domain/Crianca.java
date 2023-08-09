package com.github.tallya01.t22.domain;

import java.util.Set;

public class Crianca extends Visitante {
    Set<Visitante> acompanhantes;

    public Crianca(Pessoa pessoa) {
        super(pessoa);
    }
}
