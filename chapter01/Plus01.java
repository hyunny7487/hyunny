package chapter01;

import java.util.Scanner;

public class Plus01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a ;
		int b ;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		if ( (a > 0) && (b<10)) {
			System.out.println( a + b );

		}
		
		sc.close();

	}

}
