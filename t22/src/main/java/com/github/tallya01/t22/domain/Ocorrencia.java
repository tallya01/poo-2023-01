package com.github.tallya01.t22.domain;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

public class Ocorrencia {
    Set<Pessoa> envolvidos;
    LocalDate data;
    LocalTime hora;
    String descricao;

    public Ocorrencia(Set<Pessoa> envolvidos, LocalDate data, LocalTime hora, String descricao) {
        if(envolvidos.isEmpty()) throw new IllegalArgumentException("Uma ocorrência deve ter pelo menos um envolvido");
        this.envolvidos = envolvidos;
        this.data = data;
        this.hora = hora;
        this.descricao = descricao;
    }
}
