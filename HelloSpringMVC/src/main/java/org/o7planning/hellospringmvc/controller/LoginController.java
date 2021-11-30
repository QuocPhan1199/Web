package org.o7planning.hellospringmvc.controller;

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
public class LoginController {
	@RequestMapping("/Login")
	public ModelAndView KtLogin(Model model, HttpServletRequest request, HttpServletResponse response,
			HttpSession session) {
		try {
			String user = request.getParameter("tdn");
			String pass = request.getParameter("password");
			KhachHangBo bo = new KhachHangBo();
			KhachHangbean bean = bo.KTdn(user, pass);
			if(user == null || pass == null)
			{
				return new ModelAndView("Dangnhap");
			}
			else {
				if(bean != null)
				{
					session.setAttribute("login", bean);
					return new ModelAndView ("Menu");
				}
				else
				{
					model.addAttribute("tb","dns");
					return new ModelAndView("Dangnhap");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		

	}
}
