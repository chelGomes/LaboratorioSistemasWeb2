package br.ufjf.dcc193.michel.exemplo02;

import org.eclipse.jdt.internal.compiler.codegen.AttributeNamesConstants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;

@Controller
public class HomeController {
    @GetMapping({"/","index.html" })
    //@ResponseBody
    public String index(){
        return "home";

        /*String nome = req.getParameter("Michel");
        if(nome == null){
            nome = "Desconhecido";
        }
        return "Hello <strong>" + nome + "</strong>";*/
    }

    @GetMapping("/formulario.html")
    public String formulario(){
        return "formulario";
    }

    @PostMapping("/resultado.html")
    public ModelAndView resultado(Pessoa p){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("formulario-resp");
        mv.addObject("pessoa",p);
        return mv;
    }  
}
