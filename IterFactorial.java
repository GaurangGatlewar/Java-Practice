import java.util.Scanner;

class IterFactorial{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number greater than 1");
		int n = sc.nextInt();
		if(n<1){
			System.out.println("Invalid input");
		}
		long answer = 1;
		for(int i=2;i<=n;i++){
			answer *= i;
		}
		System.out.println(answer);
	}
}