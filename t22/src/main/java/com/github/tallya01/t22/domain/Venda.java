package com.github.tallya01.t22.domain;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

public class Venda {
    LocalDate data;
    LocalTime hora;
    Funcionario funcionario;
    CentroDeVenda centroDeVenda;
    Set<Bilhete> bilhetes = new HashSet<>();

    public Venda(LocalDate data, LocalTime hora, Funcionario funcionario, CentroDeVenda centroDeVenda) {
        this.data = data;
        this.hora = hora;
        this.funcionario = funcionario;
        this.centroDeVenda = centroDeVenda;
    }

    public void adicionarBilhete(Bilhete bilhete) {
        bilhetes.add(bilhete);
    }
}
