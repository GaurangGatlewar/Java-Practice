import java.io.*;
import java.util.*;

public class ReverseArray{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int N = sc.nextInt();
        System.out.println("Enter the array elements");
        int A[] = new int[N];
        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }
        for(int i=0;i<N;i++){
            System.out.print(A[N-i-1]);
            System.out.print(" ");
        }
    }
}