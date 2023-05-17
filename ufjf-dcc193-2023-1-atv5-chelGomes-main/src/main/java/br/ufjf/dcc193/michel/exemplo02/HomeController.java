package br.ufjf.dcc193.michel.exemplo02;

import java.util.List;

import org.eclipse.jdt.internal.compiler.codegen.AttributeNamesConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;

@Controller
public class HomeController {

    @Autowired
    private PessoaRepository rep;
  
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
    public String resultado(Pessoa p){
    //public ModelAndView resultado(Pessoa p){
        //ModelAndView mv = new ModelAndView();
        //mv.setViewName("formulario-resp");
        rep.save(p);
        //mv.addObject("pessoa",p);
        return "redirect:/pessoas.html";
    }  

    @GetMapping("/pessoas.html")
        public ModelAndView pessoas(){
            ModelAndView mv = new ModelAndView("pessoas");
            List<Pessoa> lista = rep.findAll();
            mv.addObject("pessoas", lista);
            return mv;
        }
    
}
