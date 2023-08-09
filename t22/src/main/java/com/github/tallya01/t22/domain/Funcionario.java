package com.github.tallya01.t22.domain;

import java.util.Set;

public class Funcionario extends Trabalhador {
    Set<Escala> escalas;
    Set<Venda> vendas;
    public Funcionario(Pessoa pessoa) {
        super(pessoa);
    }
}
