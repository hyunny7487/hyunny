package chapter01;

import java.util.Scanner;

public class plus07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int a, b;
		
		
		for(int i=0; i< count; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			
			if(!(a>0)||!(b<10)) break;
			
			System.out.print("Case #" + (i+1) + ": " + (a+b));	
			
		}
		
		sc.close();
	}

}
