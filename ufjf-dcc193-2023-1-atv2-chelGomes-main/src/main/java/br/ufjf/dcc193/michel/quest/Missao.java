package br.ufjf.dcc193.michel.quest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Missao {

     @Autowired
     @Qualifier("guerreiro")
    private Heroi heroi;

    public Missao(){
        System.out.println("O rei tem uma nova missão importante");
    }

    public void iniciar(){
        System.out.println("Missao teve inicio");
        this.heroi.agir();
    }

    public void conlcuir(){
        System.out.println("Missao terminou");
    }


    public void setHeroi(Heroi h) {
        this.heroi = h;
    }

}
