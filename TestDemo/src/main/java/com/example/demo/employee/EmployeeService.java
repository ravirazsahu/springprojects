package com.example.demo.employee;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeService {

	private List<Employee> listOfEmployees = new ArrayList<>(Arrays.asList(new Employee("Kemp", 24, 2), 
			new Employee("Sandhya", 20, 0),
			new Employee("Anil", 22, 3),
			new Employee("Kumar", 30, 6),
    		new Employee("Tim", 32, 7)));
	public List<Employee> getEmployees() {
        //put your code here.
        listOfEmployees.sort((Employee s1, Employee s2)->s1.getAge()-s2.getAge());
        listOfEmployees.forEach(((s)->System.out.println("service=="+s)));
        return listOfEmployees;
    }


}
