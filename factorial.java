import java.util.Scanner;
public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter the number to factorial");
Scanner scan = new Scanner(System.in);
Integer number = scan.nextInt();
System.out.println("factorial is " + factorial(number));
	}
	public static int factorial(int n)
    {
        if (n == 0)
          return 1;
         
        return n*factorial(n-1);
    }
}
