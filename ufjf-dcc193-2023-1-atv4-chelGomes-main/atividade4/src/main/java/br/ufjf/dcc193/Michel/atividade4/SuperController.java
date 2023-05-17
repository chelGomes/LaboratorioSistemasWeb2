package br.ufjf.dcc193.Michel.atividade4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SuperController {
    @GetMapping({"heroi.html"})
    public String superHeroi(){
        return "heroi";
    }

    @PostMapping("/supers.html")
        public ModelAndView resultado(Super_Heroi sh){
            ModelAndView mv = new ModelAndView();
            mv.setViewName("resp_heroi");
            mv.addObject("super_heroi",sh);
            return mv;
        }  
}


