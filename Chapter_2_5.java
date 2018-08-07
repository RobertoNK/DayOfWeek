import java.util.Scanner;

public class Chapter_2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter month (1-12): ");
		int month = input.nextInt();
		System.out.println("Enter day(1-31): ");
		int day = input.nextInt();
		System.out.println("Enter year: ");
		int year=input.nextInt();
		int year2,year1;
		year1=year/100;
		year2=year%100;
		int result = (day+26*(month+1)/10 + year2 + year2/4 + year1/4 +5*year1) %7;
		System.out.println("The day of the wee is "+result+"(1=Sunday ; 7 = Saturday)");

	}

}
