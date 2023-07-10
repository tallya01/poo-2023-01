package com.github.tallya01.t10.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Funcionario extends Pessoa {
    private String cargo;
    private Date dataAdmissao;
    private double salario;
    private JornadaDeTrabalho jornadaDeTrabalho;
    private List<Servico> servicos = new ArrayList();
}