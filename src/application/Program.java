package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> employees = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int numberEmployees = sc.nextInt();
		
		for(int i = 1; i <= numberEmployees; i++)
		{
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n)? ");
			char option = sc.next().charAt(0);
			
			while(option != 'y' && option != 'n')
			{
				System.out.print("Outsourced (y/n)? ");
				option = sc.next().charAt(0);
			}
			
			sc.nextLine();
			
			if(option == 'n')
			{
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Hours: ");
				int hours = sc.nextInt();
				System.out.print("Value per hour: ");
				double valuePerHour = sc.nextDouble();
				Employee emp = new Employee(name, hours, valuePerHour);
				employees.add(emp);
			}
			
			else
			{
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Hours: ");
				int hours = sc.nextInt();
				System.out.print("Value per hour: ");
				double valuePerHour = sc.nextDouble();
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				employees.add(emp);
			}
			
		}
		
		System.out.println();
		System.out.println("PAYMENTS:");
		for(Employee emp : employees)
		{
			System.out.println(emp);
		}
		
		sc.close();
	}

}
