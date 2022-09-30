import java.util.Random;
import java.util.Scanner;


public class EmpWageUC4 {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Calculation Program!");
		
		Random r = new Random();
		Scanner sc =new Scanner(System.in);
		int n = r.nextInt(3);
		int wagePerHour = 20;
		int empHour ;
		// UC4 Switch case used to check employee attendance status
		switch(n) { //UC1 to check the Employee is Present or Absent using Random class.
		case 0 :
			empHour=8;
			System.out.println("Employee is Present for "+empHour+" hours.");
			break;
		case 1://UC3 to add employee hour present for part time 
			empHour=4;
			System.out.println("Employee is Absent so no salary for him...");
			break;
			
			default:
				empHour=0;
				System.out.println("Employee is Absent so no salary for him...");
		}
		int wage = wagePerHour*empHour; //UC2 to calculate the daily wage for present employee
		System.out.println("Employee Wage for one day is: "+wage);
		
		}
	}

