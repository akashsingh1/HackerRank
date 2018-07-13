import java.util.*;
public class Removeduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter collection of items");
		Scanner scan = new Scanner(System.in);
		
		String sentence = scan.nextLine();
		
		String[] arr = sentence.split(" ");
		
		int end = arr.length;
		
		for (int i = 0; i < end; i++) {
	        for (int j = i + 1; j < end-1; j++) {
	            if (arr[i] == arr[j]) {                  
	                arr[j] = arr[end-1];
	                end--;
	                j--;
	            }
	        }
		}
	        String[] done = new String[end];
	        for(int a = 0; a < end; a++){
	            done[a] = arr[a];      
	    
	       }
	        System.out.println(Arrays.toString(done));
	

	}
}
