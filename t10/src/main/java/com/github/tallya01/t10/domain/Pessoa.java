package com.github.tallya01.t10.domain;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private Integer idade;
    private String email;
    private String telefone;
    private List<Documento> documentos = new ArrayList();
}
