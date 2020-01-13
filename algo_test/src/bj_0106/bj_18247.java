package bj_0106;

import java.util.Scanner;

public class bj_18247 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int x[] = new int[num];
		int y[] = new int[num];
		
		for(int i = 0; i < num; i++) {
			x[i]=sc.nextInt();
			y[i]=sc.nextInt();
		}
		
		int seat[] = new int[num];
		
		for(int i = 0; i < num; i++) {
			if(x[i]<12||y[i]<4)
				seat[i] = -1;
			else
				seat[i] = 11*y[i]+4;
		}
		
		for(int i = 0; i< num; i++) {
			System.out.print(seat[i]+"\n");
		}
		
	}
}
