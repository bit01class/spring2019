package com.bit.day05;

import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

@Controller
public class Ex01Controller implements org.springframework.web.servlet.mvc.Controller {
	Logger log= LoggerFactory.getLogger(getClass());

	@Override
	@RequestMapping("/ex01")
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav=new ModelAndView("ex01");
		mav.addObject("msg", "메시지 1");
		return mav;
	}
	
	@RequestMapping("/ex08")
	public String ex08(Model model) {
		model.addAttribute("msg", "메시지 2");
		return "ex01";
	}

	@RequestMapping(value = "/ex06.bit")
	public void ex06page(HttpServletRequest req) {
		req.setAttribute("msg", "메시지 전달");
		log.debug("ex06 controller...");
	}
	
	@RequestMapping("/ex07")
	public View ex07() {
		
		return new View() {
			
			@Override
			public void render(Map<String, ?> model, HttpServletRequest request, HttpServletResponse response)
					throws Exception {
				log.debug("ex07 render");
				PrintWriter out = response.getWriter();
				out.print("test page");
			}
			
			@Override
			public String getContentType() {
				log.debug("ex07 ContentType");
				return null;
			}
		};
	}
}

















