package chapter01;

import java.util.Scanner;

public class plus05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b;
		do {
			a = sc.nextInt();
			b = sc.nextInt();
			
			if((a>0) && (b<10))
			System.out.println(a+b);
		}
		while ((a!=0) && (b!=0));
		
		sc.close();
	}	

}
