import java.util.*;
public class Reversesentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the sentence");
		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();
		
	String output = "";
	String[] array = sentence.split(" ");
	for(int i = array.length-1; i >= 0; i--)
	{
	    output += array[i];
	    if (i != 0) { output += " "; }
	}
	System.out.println(output);
}
}