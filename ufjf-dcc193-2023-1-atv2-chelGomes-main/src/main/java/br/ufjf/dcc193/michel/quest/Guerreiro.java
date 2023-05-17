package br.ufjf.dcc193.michel.quest;

import org.springframework.stereotype.Component;

@Component("guerreiro")
public class Guerreiro implements Heroi {

    private String nome = " ";

    public Guerreiro(){
        this.nome = "Sem nome";
    }

    public Guerreiro(String nome) {
        this.nome =  nome;
        System.out.printf("O guerriro %s chega no reino!\n", this.nome);
    }

    public void agir(){
        System.out.printf("O guerreiro %s luta!\n", this.nome);
    }

}
