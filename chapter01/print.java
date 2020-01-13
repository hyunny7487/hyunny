package chapter01;

import java.util.Scanner;

public class print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a;
		int cnt = 0;
		String save[] = new String[100];
		
		for(int i = 0; i < 100; i++) {
			a = sc.nextLine();
			
			if (a != null)
				save[i] = a;
				cnt++;			
				
			if (a.length() == 0) break;
			
		}
		
		for(int i = 0; i < cnt; i++) {
			System.out.println(save[i]);
		}
		
		sc.close();

	}

}
