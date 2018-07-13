import java.util.Scanner;

public class Intispalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter number to check");
		Scanner scan = new Scanner(System.in);
		Integer number = scan.nextInt();
		int palindrome = number; 
	    int reverse = 0;

	    while (palindrome != 0) {
	        int remainder = palindrome % 10;
	        reverse = reverse * 10 + remainder;
	        palindrome = palindrome / 10;
	    }
	    if (number == reverse) {
	    	System.out.println("is palindrome");	 
	    }
	    else {
	    	System.out.println("not palindrome");
	    }
	    
	}
	

}

