package bj_0102;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int num = sc.nextInt();
		
		int room[] = new int[num];
		for(int i=0; i<num; i++) {
			room[i]=sc.nextInt();		
		}
		
		for(int j=0; j<room.length; j++) {
			System.out.println(solve(room[j]));
	
		}
	}
	
	static int solve(int num) {
		if(num==1)
			return 1;
		else if(num==2)
			return 2;
		int dp[] = new int[num+1];
		dp[0]=1;
		dp[1]=1;
		dp[2]=2;
		
		for(int i = 3; i<=num; i++) {
			dp[i]=dp[i-3]+dp[i-2]+dp[i-1];
		}
		
		return dp[num];
	}
}
