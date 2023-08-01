package com.github.tallya01.t18.domain.modelo16;

import java.util.List;

public class Calendario {
    private int ano;
    List<Evento> feriados;
    List<Evento> datasImportantes;

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public List<Evento> getFeriados() {
        return feriados;
    }

    public void setFeriados(List<Evento> feriados) {
        this.feriados = feriados;
    }

    public List<Evento> getDatasImportantes() {
        return datasImportantes;
    }

    public void setDatasImportantes(List<Evento> datasImportantes) {
        this.datasImportantes = datasImportantes;
    }
}
