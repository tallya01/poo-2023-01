package com.github.tallya01.t11.domain;

public class Lanchonete {
    Funcionario gerente;
    List<Funcionario> funcionarios = new ArrayList();

    public Lanchonete(Funcionario f1, Funcionario f2){
        if(f1 == null || f1 == null) throw new IllegalArgumentException("Uma lanchonete deve possuir pelo menos dois funcionarios");
        funcionarios.add(f1);
        funcionarios.add(f2);
    }

    public void setGerente(Funcionario gerente) {
        boolean isGerenteNaLista = false
        for(Funcionario f : funcionarios) {
            if(f.equals(gerente)) isGerenteNaLista = true
        }

        if(!isGerenteNaLista) System.out.println("O gerente deve ser um funcionário da lanchonete");
        else this.gerente = gerente;
    }
}