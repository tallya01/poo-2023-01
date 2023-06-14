package com.github.tallya01.t08.domain;

import java.lang.IllegalArgumentException;
public class Disciplina {
    private String nome;

    public Disciplina(String nome) {
        if(nome == null || nome.length() == 0)
            throw new IllegalArgumentException("O nome não pode ser nulo ou vazio!");
        this.nome = nome;
    }
}