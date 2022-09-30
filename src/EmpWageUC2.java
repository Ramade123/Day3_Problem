import java.util.Random;
import java.util.Scanner;

public class EmpWageUC2 {

	public static void main(String[] args) {
		System.out.println("Employee Wage Calculation Program!");
		
		Random r = new Random();
		Scanner sc =new Scanner(System.in);
		int n = r.nextInt(2);
		int wagePerHour = 20;
		int empHour ;
		switch(n) { //UC1 to check the Employee is present or absent using Random class.
		case 0:
			empHour=8;
			System.out.println("Employee is Present for "+empHour+" hours. ");
			break;
			
			default:
				empHour=0;
				System.out.println("Employee is Absent so no salary for him...");
		  }
		   int wage = wagePerHour*empHour; //UC@ to calculate the daily wage employee
		   System.out.println("Employee Wage for one day is: "+wage);
	}
}
		 
			
		

	


