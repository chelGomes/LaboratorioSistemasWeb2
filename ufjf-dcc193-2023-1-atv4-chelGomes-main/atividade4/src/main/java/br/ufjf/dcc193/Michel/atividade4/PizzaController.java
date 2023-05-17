package br.ufjf.dcc193.Michel.atividade4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PizzaController {
    @GetMapping({"pizza/cliente.html"})
        public String pizzaCliente() {
        return "cliente";
    }

    @PostMapping("/pedido.html")
        public ModelAndView resultado(Detalhe_pedido_pizza dp){
            ModelAndView mv = new ModelAndView();
            mv.setViewName("cliente");
            mv.addObject("detalhe_pedido",dp);
            return mv;
        } 
    
}
