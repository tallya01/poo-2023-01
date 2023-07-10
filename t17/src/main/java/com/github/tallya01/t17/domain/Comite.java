package com.github.tallya01.t17.domain;

import java.lang.IllegalArgumentException;

public class Comite {
    Pessoa[] membros;
    Pessoa[] presidentes;

    Comite(Pessoa... presidentes){
        if(presidentes.length != 2 && presidentes.length != 3)
            throw new IllegalArgumentException("um comitê deve ter dois ou três presidentes");
        this.presidentes = presidentes;
    }
}