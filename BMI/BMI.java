package BMI;
import java.util.Scanner;
public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a1,a2,a3,a4,x,y;
		int b1,b2,b3,b4,z;
		Scanner input=new Scanner(System.in);
		System.out.println("name");
		x=input.nextLine();
		System.out.println("rollNo");
		y=input.next();
		System.out.println("sem");
		z=input.nextInt();
		System.out.println("unitCode");
		a1=input.next();
		a2=input.next();
		a3=input.next();
		a4=input.next();
		System.out.println("score");
		b1=input.nextInt();
		b2=input.nextInt();
		b3=input.nextInt();
		b4=input.nextInt();
		System.out.println("                              Department of Computer Science");
		System.out.println("                                   End of Semester Results");
		System.out.println("--------------------------------------------------------------------------");
		System.out.print("|Name:-"+x);
		System.out.print("\t   |Roll_No:"+y);
		System.out.println("\t    Semester:"+z);
		System.out.println("__________________________________________________________________________");
		System.out.println("|Unit Code                 |Unit Name:                      Score");
		System.out.print("|"+a1);
		System.out.print("\t\t   |Database");
		System.out.println("\t\t\t    |"+b1);
		System.out.print("|"+a2);
		System.out.print("\t\t   |Systems");
		System.out.println("\t\t\t    |"+b2);
		System.out.print("|"+a3);
		System.out.print("\t\t   |Algorithms");
		System.out.println("\t\t\t    |"+b3);
		System.out.print("|"+a4);
		System.out.print("\t\t   |Statistics");
		System.out.println("\t\t\t    |"+b4);
		System.out.println("---------------------------------------------------------------------------");
		int c=b1+b2+b3+b4;
		System.out.println("|Total\t\t\t\t\t\t\t    |"+c);
		System.out.println("---------------------------------------------------------------------------");
		double d=(double)c/4;
		System.out.println("|Average\t\t\t\t\t\t    |"+d);
		System.out.println("---------------------------------------------------------------------------");
				System.out.print("|Grade");
		if(d>=70&&d<=100) {
			System.out.println("\t\t\t\t\t\t\t    |A");
		}
		else if(d>=60&&d<70) {
			System.out.println("\t\t\t\t\t\t\t    |B");
		}
		else if(d>=50&&d<60) {
			System.out.println("\t\t\t\t\t\t\t    |C");
		}
		else if(d>=40&&d<50) {
			System.out.println("\t\t\t\t\t\t\t    |D");
		}
		else {
			System.out.println("\t\t\t\t\t\t\t    |F");
		}
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("                                             Recommendation |");
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("Grading Criteria                     Overall Grade(A-D)      Recommend Pass");
		System.out.println("70-100         A");
		System.out.println("60-70          B");
		System.out.println("50-60          C");
		System.out.println("40-50          D");
		System.out.println("Below 40       F");
		System.out.println("---------------------------------------------------------------------------");
		
		
		

	}

}
