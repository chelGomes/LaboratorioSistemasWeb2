package br.ufjf.dcc193.michel.quest;

import org.springframework.stereotype.Component;

@Component ("clerigo")
public class Clerigo implements Heroi {

    private String nome = " ";

    public Clerigo(){
        this.nome = "Sem nome";
    }


    public Clerigo(String nome) {
        this.nome =  nome;
        System.out.printf("O clerigo %s chega no reino!\n", this.nome);
    }

    @Override
    public void agir(){
        System.out.printf("O clerigo %s luta!\n", this.nome);
    }
}
