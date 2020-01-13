package chapter01;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		String second = sc.next();
		
		int value = 0;
		int rs = 0;
		
		
		for(int i = 0; i < cnt; i++) {
			
			value = second.charAt(i) - '0';
			rs += value;
		}
		
		System.out.println(rs);
		sc.close();
	}

}
