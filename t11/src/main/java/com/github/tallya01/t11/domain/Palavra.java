package com.github.tallya01.t11.domain;

public class Palavra {
    List<Letra> letras = new ArrayList();

    public Palavra(Letra l){
        if(l == null) throw new IllegalArgumentException("Uma palavra deve conter pelo menos uma letra");
        this.letras.add(l);
    }

    public addLetra(Letra l){
        this.letras.add(l);
    }
}