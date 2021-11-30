package org.o7planning.hellospringmvc.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.o7planning.hellospringmvc.bean.KhachHangbean;
import org.o7planning.hellospringmvc.bo.KhachHangBo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MenuController {
	@RequestMapping("/MENU")
    public ModelAndView Menu(Model model, HttpServletRequest request, HttpServletResponse response,
			HttpSession session) {

		KhachHangBo bo = new KhachHangBo();
		String ten = request.getParameter("ten");
		
		ArrayList<KhachHangbean> kh = bo.getKH();
		
		if(ten != null)  kh = bo.TimChung(ten);
		 model.addAttribute("ds", kh);
		 return new ModelAndView ("Menu");
		
		
       
    }
}
