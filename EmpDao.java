package com.deloitte.empl.dao;

import com.deloitte.empl.beans.Emp;

public interface EmpDao {
	void openConnection();
	void close();
	int addEmp(Emp emp);
}
