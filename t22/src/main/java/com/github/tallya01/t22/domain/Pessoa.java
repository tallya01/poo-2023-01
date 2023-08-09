package com.github.tallya01.t22.domain;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

public class Pessoa {
    Set<Ocorrencia> ocorrencias;
    Set<Pessoa> direcao;
    Visitante visitante;
    Trabalhador trabalhador;

    public Ocorrencia registrarOcorrencia(Set<Pessoa> envolvidos, String descricao){
        envolvidos.add(this);
        Ocorrencia ocorrencia = new Ocorrencia(envolvidos, LocalDate.now(), LocalTime.now(), descricao);
        this.ocorrencias.add(ocorrencia);
        return ocorrencia;
    }
}
