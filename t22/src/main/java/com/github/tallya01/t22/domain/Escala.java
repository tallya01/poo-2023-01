package com.github.tallya01.t22.domain;

public class Escala {
    Funcionario funcionario;
    Radio radio;

    public Escala(Funcionario funcionario, Radio radio) {
        if(funcionario == null)
            throw new IllegalArgumentException("Uma escala deve estar associada a um funcionário e a um rádio");
        this.funcionario = funcionario;
        this.radio = radio;
    }
}
