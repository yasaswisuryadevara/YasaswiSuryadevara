package mvchbn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {
	@Autowired
      CustomerDao dao;
	@RequestMapping(value="/addcust",method=RequestMethod.GET)
	public String ShowAddCustomerForm(){
		return "AddCustomer";
		
	}
	@RequestMapping(value="/addcust",method=RequestMethod.POST)
	public ModelAndView addCustomer(@ModelAttribute("customer")
	          Customer cust){
		ModelAndView mav= new ModelAndView();
		dao.addCustomer(cust);
		//mav.setViewName("ViewCustomers");
		return mav;
	}
}
