package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GetEmployee {

	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("beans/SpringCore.xml");
		Employee e= (Employee) ctx.getBean("emp");
		e.setEmpname("yasaswi");
        e.setEmpid(1234);
		System.out.println(e.getEmpname()+ " "+e.getEmpid() + " " +e.getSkills());
		

	}

}
