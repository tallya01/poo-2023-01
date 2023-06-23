package com.github.tallya01.t10.domain;

import java.util.ArrayList;
public class Funcionario extends Pessoa {
    private String cargo;
    private Date dataAdmissao;
    private double salario;
    private JornadaDeTrabalho jornadaDeTrabalho;
    private List<Servico> servicos = new ArrayList();
}