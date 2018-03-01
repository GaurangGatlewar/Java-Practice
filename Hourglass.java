import java.io.*;
import java.util.*;

public class Hourglass{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the 1st array dimension(>=3)");
        int m = sc.nextInt();
        if(m<3){
            System.out.println("The dimension was less than 3");
            return;
        }
        System.out.println("Please enter the 2nd array dimension(>=3)");
        int n = sc.nextInt();
        if(n<3){
            System.out.println("The dimension was less than 3");
        }
        System.out.println("Enter the " + Integer.toString(m*n) + " elements of the array:");
        int A[][] = new int[m][n];
        for(int j=0;j<n;j++){
            for(int i=0;i<m;i++){
                A[i][j] = sc.nextInt();
            }
        }
        
        int ans = -100;
        int sum = 0;
        for(int i=0;i<(m-2);i++){
            for(int j=0;j<(n-2);j++){
                sum = A[i][j] + A[i+1][j]+ A[i+2][j] + A[i+1][j+1] + A[i][j+2] + A[i+1][j+2] + A[i+2][j+2];
                if(sum>ans){
                    ans = sum;
                }
            }
        }
        
        System.out.println("The maximum Hourglass sum in the matrix is " + Integer.toString(ans));
    }
}