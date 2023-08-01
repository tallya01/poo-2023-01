package com.github.tallya01.t18.domain.modelo15;

import java.util.List;

public class Calendario {
    private int ano;
    List<Dia> feriados;
    List<Dia> datasImportantes;

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public List<Dia> getFeriados() {
        return feriados;
    }

    public void setFeriados(List<Dia> feriados) {
        this.feriados = feriados;
    }

    public List<Dia> getDatasImportantes() {
        return datasImportantes;
    }

    public void setDatasImportantes(List<Dia> datasImportantes) {
        this.datasImportantes = datasImportantes;
    }
}
