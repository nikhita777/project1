package com.tns.staticprograms;
public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee ob=new Employee("janu",3125);
		System.out.println(ob);
		Employee companyName; // accessing the static variable using classname
		ob=new Employee("Nikhi",2933);
		System.out.println(ob);
		}

}
