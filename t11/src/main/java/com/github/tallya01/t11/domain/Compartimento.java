package com.github.tallya01.t11.domain;

public class Compartimento {
    List<Livro> livros = new ArrayList();
    List<CD> cds = new ArrayList();

    public Compartimento(CD cd1, CD cd2){
        if(cd1 == null || cd2 == null) throw new IllegalArgumentException("Um compartimento deve guardar pelo menos 2 CDs");
        cds.add(cd1);
        cds.add(cd2);
    }

    public addLivro(Livro l){
        if(livros.size() == 3){
            System.out.println("Não é possível adicionar mais livros");
        } else {
            this.livros.add(l);
        }
    }

    public addCds(List<CD> cds){
        int novoTamanho = cds.size() + this.cds.size();

        if(novoTamanho == 2 || novoTamanho == 4 || novoTamanho >= 7) {
            for(CD cd : cds){
                this.cds.add(cd);
            }
        } else {
            System.out.println("Um compartimento deve guardar 2, 4, 7 ou mais de 7 CDs");
        }
    }
}