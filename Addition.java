import java.util.Scanner;
public class Addition {
	public static void main(String[] args) {

	Scanner Udeze = new Scanner(System.in);

	System.out.print("First Integer");
	Double number1 = Udeze.nextDouble();

	System.out.print("Secont Integer");
	double number2 = Udeze.nextDouble();

	double sum = number1 + number2;
	System.out.printf ("Sum is %2f%n", sum);
    }
}