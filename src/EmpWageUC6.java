import java.util.Random;
import java.util.Scanner;


public class EmpWageUC6 {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Calculation Program!");
		
		Random r = new Random();
		Scanner sc =new Scanner(System.in);
		int n = r.nextInt(3);
		int wagePerHour = 20;
		int empHour ;
		// UC4 Switch case used to check employee attendance status
		switch(n) { //UC1 to check the Employee is present or absent using Random class.
		case 0:
			empHour=8;
			System.out.println("Employee is Present for "+empHour+" hours. ");
			break;
		case 1:// UC3 to add employee hours present for part time
			empHour=4;
			System.out.println("employee Present for part time for "+empHour+" hours. ");
			break;
			
			default:
				empHour=0;
				System.out.println("Employee is absent so no salary for him...");
		}
		int wage = wagePerHour*empHour; //UC2 calculate the daily wage for present employee
		System.out.println("Employee Wage for one day is: +wage");
		
		System.out.println("Enter no of days worker worked in one month: ");//UC5 to calculate monthly wage of employee
		int workdays = sc.nextInt();
		int monthlyWage = wage*workdays;
		int monthlyHour = empHour*workdays;
		System.out.println("Employee this month salary will be : "+monthlyWage);
		
		System.out.println("");
		System.out.println("");
		if (workdays >=20 || monthlyHour >100) {
			System.out.println("Worker did not satisfies the payscale condition.");
			System.out.println("The Final Salary will be credited to Workers bank account is: "+monthlyWage);
		}
		else {
			System.out.println("Worker did not satisfies the payscale condition.");
			System.out.println("Worker needs to work for more hour or minimum for 20 days. ");
		}
	}
}
	
		
		
		 
		
					
		
		

	


