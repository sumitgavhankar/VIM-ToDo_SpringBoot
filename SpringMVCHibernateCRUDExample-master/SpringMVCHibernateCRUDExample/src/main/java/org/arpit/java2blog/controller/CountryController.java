package org.arpit.java2blog.controller;

import java.util.List;


import javax.servlet.http.HttpServletRequest;
import org.arpit.java2blog.model.Country;
import org.arpit.java2blog.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CountryController {
	
	
	@Autowired
	CountryService countryService;
	
	
	/*calling loginpage here*/
	
	@RequestMapping(value="logindata")
	public ModelAndView login() {
		System.out.println("calling login method....");
		return new ModelAndView("loginpage","country", new Country());
		
	}
	
	/*calling or move to the success page*/
	
	@RequestMapping(value="logindatapage")
	public ModelAndView loaddata(Country country,HttpServletRequest request) {
		System.out.println("calling login loaddata....");
		
		List list=countryService.getalldata(country);
		System.out.println("chk list size:--"+list.size());
		request.setAttribute("list", list);
		return new ModelAndView("success");
		
	}
	
	
	/*calling or go to registerpage */
	
	@RequestMapping(value="rgisterdata")
	public ModelAndView registerdata(@ModelAttribute Country country) {
		System.out.println("calling login registerdata....");
		return new ModelAndView("registration","country",new Country());
		
	}
	
	
	/*save register data inside database*/
	
	
	
	@RequestMapping(value="rgistersavedata")
	public ModelAndView registersavedata(@ModelAttribute Country country) {
		System.out.println("calling login registersavedata....");
		countryService.addcountry(country);
		
		return new ModelAndView("index");
		
	}
	
	
	@RequestMapping(value="deletedata")
	public ModelAndView deldata(@ModelAttribute Country country,HttpServletRequest request) {
		System.out.println("calling login deletedata....");
		
			
			String str=request.getParameter("countruradioid");
			System.out.println("----"+str);
			int idc=Integer.valueOf(str.toString());
			System.out.println("================="+idc);
		    Country country2=new Country();
		    country2.setId(idc);
		    countryService.deletedata(country2);
			/*List list=countryService.getalldata(country);
			System.out.println("chk list size:--"+list.size());
			request.setAttribute("list", list);*/
	
	      	return new ModelAndView("demo");
	}
	

}
