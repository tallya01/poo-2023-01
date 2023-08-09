package com.github.tallya01.t22.domain;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

public class CentroDeVenda {
    Set<Venda> vendas;

    public Venda realizarNovaVenda(Funcionario funcionario, Bilhete bilhete) {
        Venda venda = new Venda(LocalDate.now(), LocalTime.now(), funcionario, this);
        venda.adicionarBilhete(bilhete);
        vendas.add(venda);
        return venda;
    }
}
