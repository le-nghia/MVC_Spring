package org.o7planning.hellospringmvc.controller;
 
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.o7planning.hellospringmvc.bean.sachbean;
import org.o7planning.hellospringmvc.bo.loaibo;
import org.o7planning.hellospringmvc.bo.sachbo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class HelloWorldController {
 
    @RequestMapping("/hello")
    public ModelAndView hello(Model model, HttpServletRequest request)  {
        
    	String timkiem = request.getParameter("txttk");
    	String maloai1 = request.getParameter("ml");
    	model.addAttribute("greeting", "Hello Spring MVC");
        loaibo loai= new loaibo();
        sachbo sach= new sachbo();
         String maloai=request.getParameter("ml");
        model.addAttribute("dsloai",loai.getLoai());
        model.addAttribute("dssach",sach.getsach());
        model.addAttribute("soloai",loai.getLoai().size()); 
        model.addAttribute("maloai",maloai);
		/* return new ModelAndView("helloworld"); */
        ArrayList<sachbean> ds;
        if(maloai1 != null ) 
        	ds = sach.TimSachTheoMa(maloai1);
        else 
        	if(timkiem != null)
        		ds= sach.TimSach(timkiem);
        	else ds= sach.getsach();
        model.addAttribute("dssach",ds);
        return new ModelAndView("helloworld");
    }
 
}