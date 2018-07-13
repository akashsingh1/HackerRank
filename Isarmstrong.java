import java.util.Scanner;
public class Isarmstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter the number you want to check is an armstrong number");
Scanner scan = new Scanner(System.in);
Integer number = scan.nextInt();

    int c=0 ,a,temp;  
    
    temp = number;  
    while(number>0)  
    {  
    a = number % 10;  
    number = number/10;  
    c =c + (a*a*a);  
    
    }  
    if(temp==c)  
    System.out.println("armstrong number");   
    else  
        System.out.println("Not armstrong number");   
   }  
 
	}


