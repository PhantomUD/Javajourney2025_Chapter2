import java.util.Scanner;
public class Addition5{
public static void main(String[] args){

	Scanner Udeze = new Scanner(System.in);
	
	System.out.print ("First Integer");
	int number1 = Udeze.nextInt();

	System.out.print ("Second Integer");
	int number2 = Udeze.nextInt();

	int sum = number1 + number2;
	System.out.printf("Sum of new Interger %d%n", sum);
}
}
