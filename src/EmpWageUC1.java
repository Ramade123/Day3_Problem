
import java.util.Random;
import java.util.Scanner;

public class EmpWageUC1 {

	public static void main(String[] args) {
	System.out.println("Welcome to Employee Wage Calculation Program!");
	
	Random r = new Random();
	Scanner scanner =new Scanner(System.in);
	int n = r.nextInt(2);
	
	int empHour ;
	switch(n)
	{ // UC1 to check the Employee is Present or absent using Random class.
	case 0:
		
		System.out.println("Employee is Present ");
		break;
		
		default:
			empHour=0;
			System.out.println("Employee is Absent so no salary for him...");
	   }	
	}	
}		
	
	




