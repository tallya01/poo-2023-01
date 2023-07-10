package com.github.tallya01.t10.domain;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {
    private Long numeroCadastro;
    private String nivel;
    private List<Bicicleta> bicicletas = new ArrayList();
}