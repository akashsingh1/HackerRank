import java.util.Scanner;;
public class Isprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the number you want to check");
Scanner scan = new Scanner(System.in);
Integer number = scan.nextInt();
System.out.println(isPrime(number));
	}
public static boolean isPrime(Integer num) {
	for (int i=2;i<num;i++) {
		if(!((num%i)==0)) {
	return false;
		}
		else
			return true;
	}
return true;
}
}
