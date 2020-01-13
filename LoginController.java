package bootmvc;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import bootmvc.Login;
@Controller
public class LoginController {
       @RequestMapping(value="/login",method=RequestMethod.GET)
   	public String ShowLoginForm(){
   		return "Login";
   		
   	}
   	@RequestMapping(value="/login",method=RequestMethod.POST)
   	public ModelAndView Login(@ModelAttribute("Login")
   	          Login login){
   		ModelAndView mav= new ModelAndView();
   		mav.addObject(login);
   		mav.setViewName("Welcome");
   		return mav;
}

}