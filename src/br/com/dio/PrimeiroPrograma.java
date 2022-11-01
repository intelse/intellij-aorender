package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        /*int a = 5;
        int b = 2;

        System.out.println("Hello world " + (a+b));*/

        Gato cat = new Gato();
        System.out.println(cat);

        Livro livro = new Livro("O problema dos 3 corpos", 300);
        System.out.println(livro);

    }
}

class Livro{
    private String nome;
    private Integer numPagin;

    public Livro(String nome, Integer numPagin) {
        this.nome = nome;
        this.numPagin = numPagin;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPagin() {
        return numPagin;
    }

    public void setNumPagin(Integer numPagin) {
        this.numPagin = numPagin;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPagin=" + numPagin +
                '}';
    }
}