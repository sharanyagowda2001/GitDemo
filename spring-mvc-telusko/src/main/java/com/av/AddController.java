
package com.av;

//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;

//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
	@RequestMapping("/add")
	
	public ModelAndView add(@RequestParam("fname") int i,@RequestParam("sname") int j)
	{
		//int firstNumber=Integer.parseInt(httpServletRequest.getParameter("fname"));
		//int secondNumber=Integer.parseInt(httpServletRequest.getParameter("sname"));



		AddService addService=new AddService();
		int result=addService.add(i, j);

		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("View1");//no need to mention extension it will handled by ExtensionController
		modelAndView.addObject("result",result);


		return modelAndView;
	}
}