package bj_0102;

import java.util.Scanner;

public class bj_1000 {
	static Scanner sc = new Scanner(System.in);
	
	static void  bj1000() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a+b);
	}
	
	static void bj2741() {
		int a = sc.nextInt();
		for(int i = 1; i <= a; i++) {
			System.out.println(i);
		}
	}
	
	static void bj2438() {
		int a = sc.nextInt();
		for(int i=1; i<=a; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void bj2742() {
		int a = sc.nextInt();
		for(int i = a; i>=1; i--) {
			System.out.println(i);
		}
	}
	
	static void bj2439() {
		int a = sc.nextInt();
		for(int i = 1; i <= a; i++) {
			for(int j=i; j<a; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void bj10430() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println((a+b)%c);
		System.out.println((a%c+b%c)%c);
		System.out.println((a*b)%c);
		System.out.println((a%c*b%c)%c);
		
		
	}
	
	static void bj2440() {
		int a = sc.nextInt();
		for(int j = 1; j<=a; j++) {
			for(int i = a-j; i>=0; i--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void bj1924() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int day=0;
		for(int i = 1; i<=a-1; i++) {
			switch(i) {
			case 1:day+=31; break;
			case 3:day+=31; break;
			case 5:day+=31; break;
			case 7:day+=31; break;
			case 8:day+=31; break;
			case 10:day+=31; break;
			case 12:day+=31;break;
			case 2:day+=28; break;
			default:day+=30; break;
			}
		}
		day += b;
		switch(day%7) {
		case 1: System.out.println("MON"); break;
		case 2: System.out.println("TUE"); break;
		case 3: System.out.println("WED"); break;
		case 4: System.out.println("THU"); break;
		case 5: System.out.println("FRI"); break;
		case 6: System.out.println("SAT"); break;
		default: System.out.println("SUN"); break;
		}
		
	}
	
	static void bj2839a() {
		int kg=sc.nextInt(),num=0,a=5,b=3,kg2=kg;
		num = kg/a;
		kg2 %= a;
		if(kg2!=0) {
			num+=kg2/b;
			kg2%=b;
			while(kg2!=0) {
				num--;
				kg2+=a;
				if(kg2>=kg) {
					num=-1;
					break;
				}
				num+=kg2/b;
				kg2%=b;
				
			}
		}
		System.out.println(num);
		
	}
	
	static void bj2839b() {
		int kg = sc.nextInt();
		int num = 0;
		int a=sc.nextInt();
		int b=sc.nextInt();
		int min,max;
		if(a<b) {
			min=a;
			max=b;
		}else {
			min=b;
			max=a;
		}
		while(kg!=0) {
			if(kg%max==0) {
				num+=kg/max;
				kg%=max;
				break;
			}else {
				kg-=min;
				if(kg!=0&&kg<min) {
					num=-1;
					break;
				}
				num++;
			}
		}
		
		
		System.out.println(num);
	}
	
	static void bj2839c() {
		int kg = sc.nextInt();
		int num = 0;
		int a=5;
		int b=3;
		while(kg!=0) {
			if(kg%a==0) {
				num+=kg/a;
				kg%=a;
				break;
			}else {
				kg-=b;
				if(kg!=0&&kg<b) {
					num=-1;
					break;
				}
				num++;
			}
		}
		
		
		System.out.println(num);
	}
	static void bj11720() {
		int num = sc.nextInt();
		String val = sc.next();
		int sum=0;
		int sum1=0;
		for(int i=0; i<num; i++) {
			sum+=val.charAt(i)-'0';
		}
		System.out.println(sum);
	}
	
	static void bj11721() {
		String str = sc.nextLine();
		for(int i=0; i<=str.length()/10; i++) {
			for(int j=i*10; j<(i*10)+10; j++) {
				if(j==str.length()) {
					break;
				}
				System.out.print(str.charAt(j));
			}
			System.out.println();
		}
	}
	
	static void bj1463a() {
		int num = 10;
		int a = 3;
		int b = 2;
		int min=a,max=b;
		if(a>b) {
			max=a;
			min=b;
		}
		int count=0;
		int val=num;
		while(val>1) {
			if(val%max!=0) {
				if(val%min!=0) {
					val--;
				}else {
					val/=min;
				}
			}else {
				val/=max;
			}
			count++;
			System.out.println(val);
		}
		System.out.println(count);
		
	}
	
	static void bj1463b() {
		int num = sc.nextInt();
		int dp[] = new int[num+1];
		dp[1]=0;
		dp[2]=1;
		dp[3]=1;
		for(int i=4; i<=num; i++) {
			dp[i]=dp[i-1]+1;
			if(i%3==0) {
				dp[i]=Math.min(dp[i-1]+1,dp[i/3]+1);
			}else if(i%2==0){
				dp[i]=Math.min(dp[i-1]+1,dp[i/2]+1);
			}
		}
		System.out.println(dp[num]);			
		for (int i : dp) {
			System.out.print(i+",");
		}
		
	}
	
	static void bj9095() {
		int num = sc.nextInt();
		int dp[] = new int[num+1];
		dp[1]=1;
		dp[2]=2;
		dp[3]=4;
		for(int i = 4; i<=num; i++) {
			dp[i]=dp[i-3]+dp[i-2]+dp[i-1];
		}
		System.out.println(dp[num]);
	}
	
	
	public static void main(String[] args) {
		bj_1000.bj9095();
	}

}
