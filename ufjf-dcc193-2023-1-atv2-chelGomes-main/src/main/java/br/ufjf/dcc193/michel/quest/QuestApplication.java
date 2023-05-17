package br.ufjf.dcc193.michel.quest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class QuestApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(QuestApplication.class, args);
        System.out.println("Hello word");

        //Heroi g1 = HeroiFactory.createHeroi (nome:"Konnan", tipo:1);
		Guerreiro h1 = ctx.getBean(Guerreiro.class);
		
		//Heroi g2 = HeroiFactory.createHeroi(nome:"Marc", tipo:0);
        Clerigo h2 = ctx.getBean(Clerigo.class);
		
		//Missao m1 = new Missao();

		Missao m1 = ctx.getBean(Missao.class);
		
		//m1.setHeroi(g2);
		m1.iniciar ();
		m1.conlcuir ();		
	}

}
