import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class calcu {
	
	private static double cc;
	
	public static double addNum(double a, double b) {
		cc = a+b;
		return cc;
	};
	
	public static double subNum(double a, double b) {
		cc = a-b;
		return cc;
	};
	
	public static double multNum(double a, double b) {
		cc = a*b;
		return cc;
	};
	
	public static double divNum(double a, double b) {
		cc = a/b;
		return cc;
	};

	public static void closers(Scanner input1, Scanner input2, Scanner input3) {
		input1.close();
		input2.close();
		input3.close();
	};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a,b,c;
		String operation;
		Scanner input1= new Scanner(System.in);
		Scanner input2= new Scanner(System.in);
		Scanner input3= new Scanner(System.in);
		
		System.out.println("Enter a number and press enter");
		try{
			a = input1.nextDouble();
		}
		catch(Exception e){
			System.out.println("Invalid entry.");
			closers(input1, input2, input3); 
			return;
		}
		
		//grab input 2
		System.out.println("Enter another number and press enter again.");
		try{
			b = input2.nextDouble();
		}
		catch(Exception e){
			System.out.println("Invalid entry.");
			closers(input1, input2, input3); 
			return;
		}
		
		System.out.println("Now select and operation");
		operation = input3.next();
		
		/*if(operation != "+" && operation != "-" && operation != "*" && operation != "/"){
			c = 1;
			DecimalFormat df = new DecimalFormat("#.#");
			df.setRoundingMode(RoundingMode.HALF_EVEN);
			//System.out.printf(" Error(" + (int)c + "): %s " + operation + " %s could not be calculated%n", df.format(a), df.format(b));
		}
		else{*/
		
		DecimalFormat df = new DecimalFormat("#.#");
		df.setRoundingMode(RoundingMode.HALF_EVEN);
			switch(operation){
				case "+": closers(input1, input2, input3); 
					c = addNum(a, b);
					System.out.printf("%s " + operation + " %s = %s :)%n",df.format(a), df.format(b), df.format(c));
					break;
				case "-": closers(input1, input2, input3);
					c = subNum(a, b);
					System.out.printf("%s " + operation + " %s = %s :)%n",df.format(a), df.format(b), df.format(c));
					break;
				case "*": closers(input1, input2, input3);
					c = multNum(a, b);
					System.out.printf("%s " + operation + " %s = %s :)%n",df.format(a), df.format(b), df.format(c));
					break;
				case "/": closers(input1, input2, input3);
					c = divNum(a, b);
					System.out.printf("%s " + operation + " %s = %s :)%n",df.format(a), df.format(b), df.format(c));
					break;
				default:
					c = 0;
					System.out.println("Invalid operation.");
					//System.out.printf(" Error(" + (int)c + "): %s " + operation + " %s could not be calculated%n", df.format(a), df.format(b));
					break;
			}
			/*DecimalFormat df = new DecimalFormat("#.#");
			df.setRoundingMode(RoundingMode.HALF_EVEN);
			System.out.printf("%s " + operation + " %s = %s :)%n",df.format(a), df.format(b), df.format(c));
		}*/
	}
}
