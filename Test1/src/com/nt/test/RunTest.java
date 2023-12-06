package com.nt.test;

import java.util.Date;

import comm.nt.beans.Employee;

public class RunTest {
public static void main(String[] args) {
	Employee employee=new Employee();
	employee.getName();
	Date d=new Date(); 
	System.out.println(d.getYear());
}
}
