import java.util.Scanner;

public class Reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter word to reverse");	

Scanner scan = new Scanner(System.in);

String input = scan.nextLine();
	        
	        char[] arr = input.toCharArray();
	 
	        for (int i = arr.length-1; i>=0; i--)
	            System.out.print(arr[i]);
	    }
	}


