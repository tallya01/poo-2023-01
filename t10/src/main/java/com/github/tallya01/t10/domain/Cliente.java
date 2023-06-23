package com.github.tallya01.t10.domain;

import java.util.ArrayList;
public class Cliente extends Pessoa {
    private Long numeroCadastro;
    private String nivel;
    private List<Bicicleta> bicicletas = new ArrayList();
}