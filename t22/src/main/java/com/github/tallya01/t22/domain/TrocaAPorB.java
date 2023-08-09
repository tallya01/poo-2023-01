package com.github.tallya01.t22.domain;

import java.time.LocalDate;
import java.time.LocalTime;

public class TrocaAPorB {
    Bilhete a;
    Bilhete b;
    LocalDate data;
    LocalTime hora;
    double diferenca;

    public TrocaAPorB(Bilhete a, Bilhete b, LocalDate data, LocalTime hora, double diferenca) {
        this.a = a;
        this.b = b;
        this.data = data;
        this.hora = hora;
        this.diferenca = diferenca;
        a.troca = this;
        b.troca = this;
    }
}
