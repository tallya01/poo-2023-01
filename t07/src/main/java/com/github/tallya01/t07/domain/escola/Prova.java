package com.github.tallya01.t07.domain.escola;
public class Prova implements Identificacao {
    private byte numQuestoes;

    public byte getNumQuestoes() {
        return numQuestoes;
    }

    public void setNumQuestoes(byte n) {
        if(n > 0) {
            this.numQuestoes = n;
        }
    }

    @Override
    public String getNome() {
        throw new Error("metodo nao implementado");
    }
}