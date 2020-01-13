package algo_study;

import java.util.Scanner;

public class algo_book {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int k=1;
		int count=0;
		while(num!=0) {
			num = num-k;
			k++;
			if(num<k) {
				k=1;
			}
			count++;
		}
		
		System.out.println(count);

	}

}
