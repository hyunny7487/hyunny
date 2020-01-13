package chapter01;

import java.util.Scanner;

public class Ten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String target = sc.nextLine();
		String a = target;
		String[] rs = new String[(target.length()/10)+1];
		
		for(int i = 0; i <= (target.length()/10); i++) {
			
			if(a.length()>10) {
				rs[i] = a.substring(0, 10);
				a = a.substring(10);
			}
			else {
				rs[i] = a;
			}
		}
		
		for(int i = 0; i <= (target.length()/10); i++) {
			System.out.println(rs[i]);
		}
		
		sc.close();
	}

}
