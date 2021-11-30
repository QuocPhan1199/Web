package org.o7planning.hellospringmvc.controller;

import org.o7planning.hellospringmvc.dao.DungChung;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

    @RequestMapping("/hello")
    public ModelAndView hello(Model model) throws Exception {
       
        model.addAttribute("greeting", "Hello Spring MVC");
        String ds[] = {"Quoc", "Linh", "Anh", "TRuc"};
        model.addAttribute("ds", ds);
        DungChung dc= new DungChung();
		dc.KetNoi();
       
		return new ModelAndView("helloworld") ;
       
    }

}