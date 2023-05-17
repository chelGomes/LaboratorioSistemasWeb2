package br.ufjf.dcc193.Michel.atividade4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping({"/","index.html"})
    public String index(){
        return "home";
    }
}
