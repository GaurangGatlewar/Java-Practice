import java.util.Scanner;

class Factorial{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number greater than 1");
		int n = sc.nextInt();
		if(n<1){
			System.out.println("Invalid input");
		}
		long answer = fact(n);
		System.out.println(answer);
	}

	public static long fact(int n){
		if(n == 1){
			return 1;
		}else{
			return (n * fact(n-1));
		}
	}
}