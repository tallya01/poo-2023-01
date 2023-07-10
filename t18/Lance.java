package com.github.tallya01.t18;

public class Lance {
    Jogador jogador;
    Peca peca;
    Posicao origem;
    Posicao destino;

    public Lance(Jogador jogador, Peca peca, Posicao origem, Posicao destino) {
        this.jogador = jogador;
        this.peca = peca;
        this.origem = origem;
        this.destino = destino;
    }
}