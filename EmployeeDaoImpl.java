package beans;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import beans.Employee;

@Repository
public class EmployeeDaoImpl {
	 public List<Employee> getEmpls(){
		 List<Employee> emplist= new ArrayList<Employee>();
		 emplist.add(new Employee(101, "aaaa", 50000));
		 emplist.add(new Employee(102, "bbbb", 60000));
		 emplist.add(new Employee(103, "cccc", 80000));
		 return emplist;
	 }

}
