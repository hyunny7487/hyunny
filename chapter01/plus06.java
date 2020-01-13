package chapter01;

import java.util.Scanner;

public class plus06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String box[] ;
		int a,b;
		
		do {
			String next = sc.next();
			
			box = next.split(",");
			a = Integer.parseInt(box[0]);
			b = Integer.parseInt(box[1]);
			System.out.println(a + b);
		}
		while ((a>0) && (b<10));
		
		sc.close();

	}

}
