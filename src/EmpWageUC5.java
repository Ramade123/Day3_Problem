import java.util.Random;
import java.util.Scanner;

public class EmpWageUC5 {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Calculation Program!");
		
		
		int wagePerHour = 20;
		int TotalworkDays=20;
		int workDays=0;
		int MonthlyWage=0;
		int wage=0;
		
		while(workDays<=TotalworkDays) 
		{
			workDays++;
			Random r = new Random();
			var sc =new Scanner(System.in);
			int n = r.nextInt(3);
			int empHour;
		
		switch(n) 
		{ 
			case 0:
			empHour=8;
			
			break;
			case 1: 
			empHour=4;
			
			break;
			
			default:
				empHour=0;
				
				break;
		}
		
		    wage = wagePerHour*empHour; 
			
		}
			
		MonthlyWage = wage*TotalworkDays;
			
		System.out.println("Total number of days worked : "+TotalworkDays);

			System.out.println("Employee this month salary will be : "+MonthlyWage);
				

	}

}
