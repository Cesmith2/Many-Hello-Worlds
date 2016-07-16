
public class Fib {

	public static float fibonacci(float n) {
		if(n<=1)
			//base case(s)
			return n;
		else
			//recurse
			return fibonacci(n-1) + fibonacci(n-2);
	}
	
	//main
	public static void main(String[] args) {
		float n = 10;
		for(int i=0; i<=n; i++) {
			System.out.println(i + "~" + (int)fibonacci(i));
		}
	}
}
