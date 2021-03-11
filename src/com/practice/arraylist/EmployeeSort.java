package com.practice.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeSort{
	
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee("one", 21);
		Employee emp2 = new Employee("two", 19);
		Employee emp3 = new Employee("three", 18);
		Employee emp4 = new Employee("four", 27);
		Employee emp5 = new Employee("five", 11);
		Employee emp6 = new Employee("six", 78);
		
		List<Employee> emp = new ArrayList<>();
		
		emp.add(emp1);
		emp.add(emp2);
		emp.add(emp3);
		emp.add(emp4);
		emp.add(emp5);
		emp.add(emp6);
		
		System.out.println(emp);
		
		for(Employee e : emp) {
			System.out.println(e.getAge());
		}
		
		System.out.println("Searched Records: "+search(emp, 20));
		Collections.sort(emp, new sortEmployee());
		System.out.println("Sorted List: "+ emp);
		
		Collections.sort(emp);
		System.out.println("Name Sorted List: "+ emp);
	}
	
	public static List<Employee> search(List<Employee> emp, int age){
		List<Employee> searchList = new ArrayList<Employee>();
		for(Employee e : emp) {
			if(e.getAge() > 20) {
				searchList.add(e);
			}
		}
		return searchList;
		
	}
	
	

}


class sortEmployee implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getAge() - o2.getAge();
	}
	
	
}

class sortEmp implements Comparable<Employee>{

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
