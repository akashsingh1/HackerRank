import java.util.Scanner;
// Question 1

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the limit number of the fibonacci series");
Scanner scan = new Scanner(System.in);
Integer limit = scan.nextInt();
scan.close();
Integer num1 = 0;
Integer num2 = 1;
System.out.print("0 1 ");
if(limit>3) {
	for (int i = 0; num2+num1<limit;i++) {
		Integer num3 = num1 +num2;
		System.out.print(num3 + " ");
		num1 = num2;
		num2 = num3; 
}
}

	}

}
