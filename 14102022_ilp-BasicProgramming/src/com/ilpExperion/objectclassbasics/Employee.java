package com.ilpExperion.objectclassbasics;

public class Employee {
	String employeeName = "Liya Elsa Mathew";
	int employeeAge = 22;
	char employeeGender = 'M';
	float employeeCgpa = 8.4f;
	
	public void displayEmployeeDetails()
	{
		System.out.println("******Welcome to ILP Program*******");
		System.out.println("Name" + "			" + "Age" + "	" + "Gender" + "	" + "CGPA");
		System.out.println(employeeName + "	" + employeeAge + "	" + employeeGender + "	" + employeeCgpa);

	}
}
