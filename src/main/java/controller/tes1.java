package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/user")
public class tes1 {
	@RequestMapping(value="/hello")
	public ModelAndView handleRequest()
	{
		return new ModelAndView("test");
	}

}
