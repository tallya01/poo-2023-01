package com.github.tallya01.t08.domain;

import java.util.ArrayList;
import java.util.List;

public class Projeto {
    private List<Pessoa> pessoas = new ArrayList();

    public void addPessoa(Pessoa p){
        pessoas.add(p);
    }
}