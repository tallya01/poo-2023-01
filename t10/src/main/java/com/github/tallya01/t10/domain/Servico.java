package com.github.tallya01.t10.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Servico {
    private double valor;
    private Date dataDaPrestacao;
    private List<Funcionario> responsaveis = new ArrayList();
}